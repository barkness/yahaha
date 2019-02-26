package com.example.wei.Frame;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.wei.R;
import com.example.wei.pager_adapter.RecreationPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wei on 2019/1/3.
 */

public class RecreayionMainFrame extends Fragment {



    private View view;

    private ViewPager viewPager;
    private List<Fragment> list = new ArrayList<>();
    private List<String> text = new ArrayList<>();
    private RecreationPagerAdapter recreationPagerAdapter;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.recreation_frame_main_layout,null);
        viewPager = view.findViewById(R.id.vp_main_frame);

        list.add(new RecreationFrame(1));
        text.add("搞笑图片");

        list.add(new RecreationFrame(2));
        text.add("笑话合集");

        recreationPagerAdapter = new RecreationPagerAdapter(getActivity().getSupportFragmentManager(),list,text);
        viewPager.setAdapter(recreationPagerAdapter);

        return view;
    }
}
