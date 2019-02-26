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
import com.example.wei.activity.GhostActivity;
import com.example.wei.base.GhostListBase;
import com.example.wei.list_adapter.GhostListAbapter;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.RequestParams;
import com.loopj.android.http.TextHttpResponseHandler;

import java.util.List;

import cz.msebera.android.httpclient.Header;

/**
 * Created by wei on 2019/1/4.
 */

@SuppressLint("ValidFragment")
public class GhostFrameAdapter extends Fragment implements MySwipeRefreshLayout.OnMySwipeRefreshLayoutListener, Runnable{

    private View view;
    private GhostListBase ghostListBase;
    private List<GhostListBase.ShowapiResBodyBean.PagebeanBean.ContentlistBean>list;
    private GhostListAbapter ghostListAbapter;
    private ListView listView;
    private boolean isLaoding = false;
    private int page = 0;
    private MySwipeRefreshLayout swipeRefreshLayout;
    private String type;

    @SuppressLint("ValidFragment")
    public GhostFrameAdapter (String type){
        this.type = type;
    }

    @Nullable
    @Override
    public View onCreateView(final LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.ghost_frame_layout,null);
        listView = view.findViewById(R.id.lv_mian_ghost);
        swipeRefreshLayout = view.findViewById(R.id.msr_ghost);
        OnFlush();
        swipeRefreshLayout.setRefreshing(true);
        swipeRefreshLayout.setOnMySwipeRefreshLayoutListener(this);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Intent intent = new Intent(getActivity(), GhostActivity.class);
                intent.putExtra("title",list.get(i).getTitle());
                intent.putExtra("link",list.get(i).getLink());
                startActivity(intent);

            }
        });

        return view;
    }
    private void initHttp(){
        AsyncHttpClient asyncHttpClient = new AsyncHttpClient();
        RequestParams requestParams = new RequestParams();
        requestParams.put("showapi_appid", "83012");
        requestParams.put("showapi_sign","c2a51ec16703440a8f50929a88e1ccff");
        requestParams.put("type",type);
        requestParams.put("page",++page);
        String url = "http://route.showapi.com/955-1";
        asyncHttpClient.get(url, requestParams, new TextHttpResponseHandler() {
            @Override
            public void onFailure(int i, Header[] headers, String s, Throwable throwable) {

            }

            @Override
            public void onSuccess(int i, Header[] headers, String s) {
                ghostListBase = JSON.parseObject(s,GhostListBase.class);
                run();
            }
        });

    }
    @Override
    public void run() {
        if (page==1){
            list = ghostListBase.getShowapi_res_body().getPagebean().getContentlist();
            ghostListAbapter = new GhostListAbapter(getActivity(),list);
            listView.setAdapter(ghostListAbapter);
            isLaoding = true;
            swipeRefreshLayout.setRefreshing(false);
        }else {
            if (ghostListBase==null || ghostListBase.getShowapi_res_body().getPagebean().getContentlist()==null
                    || ghostListBase.getShowapi_res_body().getPagebean().getContentlist().size()==0){

                Toast.makeText(getActivity(),"莫得了莫得了，再扯就断了",Toast.LENGTH_SHORT).show();
                isLaoding=false;
            }else {
                list.addAll(ghostListBase.getShowapi_res_body().getPagebean().getContentlist());
                ghostListAbapter.notifyDataSetChanged();
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
                    initHttp();
                }

            }

            @Override
            public void onScroll(AbsListView absListView, int i, int i1, int i2) {

            }
        });
    }


    @Override
    public void OnFlush() {
        page=0;
        initHttp();
        swipeRefreshLayout.setRefreshing(false);

    }

    @Override
    public void OnLoad() {
        initData();

    }


}
