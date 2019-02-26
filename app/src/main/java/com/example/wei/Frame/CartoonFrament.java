package com.example.wei.Frame;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.alibaba.fastjson.JSON;
import com.example.wei.MySwipeRefreshLayout;
import com.example.wei.R;
import com.example.wei.activity.CartoonShowActivity;
import com.example.wei.base.CartoonBase;
import com.example.wei.list_adapter.CartoonAdapter;
import com.example.wei.tool.CartoonUrlTool;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.RequestParams;
import com.loopj.android.http.TextHttpResponseHandler;

import java.util.List;

import cz.msebera.android.httpclient.Header;


/**
 * Created by wei on 2019/1/10.
 */

@SuppressLint("ValidFragment")
public class CartoonFrament extends Fragment implements MySwipeRefreshLayout.OnMySwipeRefreshLayoutListener, Runnable {

    private View view;
    private ListView listView;
    private int flag;
    private String url = "http://route.showapi.com/958-1";
    private CartoonBase cartoonBase;
    private List<CartoonBase.ShowapiResBodyBean.PagebeanBean.ContentlistBean> list;
    private int page = 0;
    private MySwipeRefreshLayout mySwipeRefreshLayout;
    private boolean isLaoding = false;
    private  CartoonAdapter cartoonAdapter;


    @SuppressLint("ValidFragment")
    public CartoonFrament(int flag) {
        this.flag = flag;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.cartoon_frament_layout, null);
        mySwipeRefreshLayout = view.findViewById(R.id.mstl_farment_cartoon);
        listView = view.findViewById(R.id.lv_frametn);
        mySwipeRefreshLayout.setRefreshing(true);
        mySwipeRefreshLayout.setOnMySwipeRefreshLayoutListener(this);

        OnFlush();

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getActivity(), CartoonShowActivity.class);
                intent.putExtra("link", list.get(i).getLink());
                startActivity(intent);
            }
        });


        return view;
    }

    private void initHttp(String type) {
        AsyncHttpClient asyncHttpClient = new AsyncHttpClient();
        RequestParams requestParams = new RequestParams();
        requestParams.put("showapi_appid", "83012");
        requestParams.put("showapi_sign", "c2a51ec16703440a8f50929a88e1ccff");
        requestParams.put("type", type);
        requestParams.put("page", page++);

        asyncHttpClient.get(url, requestParams, new TextHttpResponseHandler() {
            @Override
            public void onFailure(int i, Header[] headers, String s, Throwable throwable) {

            }

            @Override
            public void onSuccess(int i, Header[] headers, String s) {
                cartoonBase = JSON.parseObject(s, CartoonBase.class);
                run();
            }
        });
    }

    @Override
    public void run() {
        if (page == 1) {
            list = cartoonBase.getShowapi_res_body().getPagebean().getContentlist();
            cartoonAdapter = new CartoonAdapter(getActivity(), list);
            listView.setAdapter(cartoonAdapter);
            isLaoding = true;
            mySwipeRefreshLayout.setRefreshing(false);
        } else {
            if (cartoonBase == null
                    || cartoonBase.getShowapi_res_body().getPagebean().getContentlist().size() == 0
                    || cartoonBase.getShowapi_res_body().getPagebean().getContentlist() == null) {
                Toast.makeText(getActivity(), "莫得了莫得了，再扯就断了", Toast.LENGTH_SHORT).show();
                isLaoding = false;

            } else {
                    list.addAll(cartoonBase.getShowapi_res_body().getPagebean().getContentlist());
                    cartoonAdapter.notifyDataSetChanged();
                    isLaoding=true;
            }
        }
    }

    private void initData(){
       listView.setOnScrollListener(new AbsListView.OnScrollListener() {
           @Override
           public void onScrollStateChanged(AbsListView absListView, int i) {
               if (absListView.getLastVisiblePosition()== absListView.getCount()-1 && isLaoding && i==SCROLL_STATE_IDLE){
                   isLaoding=false;
                   Toast.makeText(getActivity(),"正在为客官加载信息请稍等",Toast.LENGTH_SHORT).show();
                   initFlag();
               }
           }

           @Override
           public void onScroll(AbsListView absListView, int i, int i1, int i2) {

           }
       });
    }

    private void initFlag(){
        switch (flag) {
            case 1:
                initHttp(CartoonUrlTool.KONGBU);
                break;
            case 2:
                initHttp(CartoonUrlTool.GUSHI);
                break;
            case 3:
                initHttp(CartoonUrlTool.DUANZI);
                break;
            case 4:
                initHttp(CartoonUrlTool.LENGZHISHI);
                break;
            case 5:
                initHttp(CartoonUrlTool.QIQU);
                break;
            case 6:
                initHttp(CartoonUrlTool.DIANYING);
                break;
            case 7:
                initHttp(CartoonUrlTool.GAOXIAO);
                break;
            case 8:
                initHttp(CartoonUrlTool.MENGCHONG);
                break;
            case 9:
                initHttp(CartoonUrlTool.XINQI);
                break;
            case 10:
                initHttp(CartoonUrlTool.HUANQIU);
                break;
            case 11:
                initHttp(CartoonUrlTool.SHEYING);
                break;
            case 12:
                initHttp(CartoonUrlTool.WANYI);
                break;
            case 13:
                initHttp(CartoonUrlTool.CHAHUA);
                break;

        }
    }

    @Override
    public void OnFlush() {
        page = 0;
        initFlag();
        mySwipeRefreshLayout.setRefreshing(false);
    }

    @Override
    public void OnLoad() {
        initData();

    }


}
