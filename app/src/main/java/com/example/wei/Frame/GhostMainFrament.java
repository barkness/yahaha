package com.example.wei.Frame;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.wei.R;
import com.example.wei.pager_adapter.GhostPageAdaption;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wei on 2019/1/6.
 */

public class GhostMainFrament extends Fragment {
    private View view;
    private ViewPager viewPager;
    private List<Fragment> list = new ArrayList<>();
    private List<String> text = new ArrayList<>();
    private GhostPageAdaption ghostPageAdaption;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.ghost_frament_mian_layout,null);
        viewPager = view.findViewById(R.id.vp_ghost_main);

        list.add(new GhostFrameAdapter("cp"));
        text.add("长篇故事");

        list.add(new GhostFrameAdapter("dp"));
        text.add("短片故事");

        list.add(new GhostFrameAdapter("xy"));
        text.add("校园故事");

        list.add(new GhostFrameAdapter("yy"));
        text.add("医院故事");

        ghostPageAdaption = new GhostPageAdaption(getActivity().getSupportFragmentManager(),list,text);
        viewPager.setAdapter(ghostPageAdaption);

        return view;
    }
}
