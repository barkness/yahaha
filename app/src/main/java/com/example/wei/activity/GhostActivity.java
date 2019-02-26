package com.example.wei.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.alibaba.fastjson.JSON;
import com.example.wei.R;
import com.example.wei.base.GhostParticularsBase;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.RequestParams;
import com.loopj.android.http.TextHttpResponseHandler;

import cz.msebera.android.httpclient.Header;

public class GhostActivity extends AppCompatActivity {
    private TextView title,text;
    private String id;
    private String url="http://route.showapi.com/955-2";
    private GhostParticularsBase ghostParticularsBase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ghost);
        title = findViewById(R.id.tv_title_acivity);
        text = findViewById(R.id.tv_text_acivity);
        Intent intent = getIntent();
        id = intent.getStringExtra("link");

        title.setText(intent.getStringExtra("title"));
        initHttp();
    }
    private void initHttp(){
        AsyncHttpClient asyncHttpClient = new AsyncHttpClient();
        RequestParams requestParams = new RequestParams();
        requestParams.put("showapi_appid","84663");
        requestParams.put("showapi_sign","6580cf90694940508b42cb4b50a08165");
        requestParams.put("id",id);
        requestParams.put("page","1");

        asyncHttpClient.get(url, requestParams, new TextHttpResponseHandler() {
            @Override
            public void onFailure(int i, Header[] headers, String s, Throwable throwable) {

            }

            @Override
            public void onSuccess(int i, Header[] headers, String s) {

                ghostParticularsBase = JSON.parseObject(s,GhostParticularsBase.class);
                text.setText(ghostParticularsBase.getShowapi_res_body().getText());

            }
        });

    }
}
