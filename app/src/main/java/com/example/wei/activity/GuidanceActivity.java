package com.example.wei.activity;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;

import com.example.wei.R;
import com.example.wei.pager_adapter.GuidancePageAdaption;

import java.util.ArrayList;

public class GuidanceActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private ArrayList<View> arrayList;
    private GuidancePageAdaption guidancePageAdaption;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guidance);
        viewPager =  findViewById(R.id.search_voice_btn);

        arrayList = new ArrayList<>();
        LayoutInflater li = getLayoutInflater();
        arrayList.add(li.inflate(R.layout.giudance_page_1_layout,null,false));
        arrayList.add(li.inflate(R.layout.guidance_page_2_layout,null,false));
        arrayList.add(li.inflate(R.layout.guidance_page_3_layout,null,false));

        guidancePageAdaption = new GuidancePageAdaption(arrayList);
        viewPager.setAdapter(guidancePageAdaption);
    }
}
