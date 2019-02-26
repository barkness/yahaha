package com.example.wei.Frame;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import com.alibaba.fastjson.JSON;
import com.example.wei.R;
import com.example.wei.activity.ParticularsActivity;
import com.example.wei.base.RecreationBase;
import com.example.wei.base.TextRecreatonBase;
import com.example.wei.list_adapter.RecreationAdaption;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.RequestParams;
import com.loopj.android.http.TextHttpResponseHandler;

import java.util.List;

import cz.msebera.android.httpclient.Header;

/**
 * Created by wei on 2018/12/29.
 */

@SuppressLint("ValidFragment")
public class RecreationFrame extends Fragment {



    private View view;
    private RecreationBase recreationBase;
    private TextRecreatonBase textRecreatonBase;
    private List<RecreationBase.ShowapiResBodyBean.ContentlistBean>list;
    private List<TextRecreatonBase.ShowapiResBodyBean.ContentlistBean>list2;
    private  GridView gridView;
    private int flag;
    @SuppressLint("ValidFragment")
    public RecreationFrame(int flag){

        this.flag = flag;
    }

    @Nullable
    @Override
    public View onCreateView(final LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.recreation_frame_layout,null);
        gridView = view.findViewById(R.id.gridview_frame);
        initHttp(flag);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (flag){
                    case 1:
                        Intent intent = new Intent(getActivity(), ParticularsActivity.class);
                        intent.putExtra("img",list.get(i).getImg());
                        intent.putExtra("Title",list.get(i).getTitle());
                        int[] s = new int[2];
                        s[0]=flag;
                        intent.putExtra("flag",s);
                        startActivity(intent);
                        break;
                    case 2:
                        Intent intent1 = new Intent(getActivity(),ParticularsActivity.class);
                        intent1.putExtra("title",list2.get(i).getTitle());
                        intent1.putExtra("text",list2.get(i).getText());
                        int[] s2 = new int[2];
                        s2[0]=flag;
                        intent1.putExtra("flag",s2);
                        startActivity(intent1);
                        break;
                }

            }
        });

        return view;
    }

    private void initHttp(final int flag){
        String url=null;
        switch (flag){
            case 1:
                url = "http://route.showapi.com/341-2";
                break;
            case 2:
                url = "http://route.showapi.com/341-1";
                break;
        }

        Log.e("333",url);
        AsyncHttpClient asyncHttpClient = new AsyncHttpClient();
        final RequestParams requestParams = new RequestParams();
        requestParams.put("showapi_appid","84663");
        requestParams.put("showapi_sign","6580cf90694940508b42cb4b50a08165");

        asyncHttpClient.get(url, requestParams, new TextHttpResponseHandler() {
            @Override
            public void onFailure(int i, Header[] headers, String s, Throwable throwable) {

            }

            @Override
            public void onSuccess(int i, Header[] headers, String s) {

                switch (flag){
                    case 1:
                        recreationBase = JSON.parseObject(s,RecreationBase.class);
                        list = recreationBase.getShowapi_res_body().getContentlist();
                        RecreationAdaption recreationAdaption = new RecreationAdaption(getActivity(),list,flag);
                        gridView.setAdapter(recreationAdaption);
                        break;
                    case 2:
                        textRecreatonBase = JSON.parseObject(s,TextRecreatonBase.class);
                        list2 = textRecreatonBase.getShowapi_res_body().getContentlist();
                        RecreationAdaption recreationAdaption2 = new RecreationAdaption(getActivity(),list2,flag,0);
                        gridView.setAdapter(recreationAdaption2);
                        break;
                }


            }
        });
    }

}
