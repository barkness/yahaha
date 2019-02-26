package com.example.wei.Frame;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.wei.R;
import com.example.wei.pager_adapter.CartoonPagrAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wei on 2019/1/7.
 */

public class CartoonMainFrament extends Fragment {

    private View view;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private List<Fragment> list =new ArrayList<Fragment>();
    private CartoonPagrAdapter cartoonPagrAdapter;


    private int[] pics = new int[]{R.mipmap.kongbu,R.mipmap.gushi,R.mipmap.duanzi,R.mipmap.lengzishi,
            R.mipmap.qiqv,R.mipmap.dianying,R.mipmap.gaoxiao,R.mipmap.mengchong,R.mipmap.xinqi,
            R.mipmap.huanqiu,R.mipmap.sheying,R.mipmap.sheying,R.mipmap.chahua};
    private String[] longTitles = new String[]{ "恐怖漫画","故事漫画","段子手","冷知识","奇趣","电影",
            "搞笑","萌宠","新奇","环球","摄影","玩艺","插画" };

    @Nullable
    @Override
    public View onCreateView(final LayoutInflater inflater, @Nullable final ViewGroup container, @Nullable Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.cartoon_main_layout,null);

        tabLayout = view.findViewById(R.id.tab_main_cartoon);
        viewPager = view.findViewById(R.id.vp_main_cartoon);
       for (int i=0;i< pics.length;i++){
           tabLayout.addTab(tabLayout.newTab());

       }

       for (int i=0; i< pics.length;i++){
//         tabLayout.getTabAt(i).setCustomView(makeTabView(i));
           list.add(new CartoonFrament(i+1));
       }

        tabLayout.setupWithViewPager(viewPager);

        cartoonPagrAdapter = new CartoonPagrAdapter(getActivity().getSupportFragmentManager(),list,longTitles);
        viewPager.setAdapter(cartoonPagrAdapter);
        return view;
    }


     // 引入布局设置图标和标题

//    private View makeTabView(int position){
//        View tabView = LayoutInflater.from(getActivity()).inflate(R.layout.cartoon_tablayout_layout,null);
//        TextView textView = tabView.findViewById(R.id.tv_title_cartoon);
//        ImageView imageView = tabView.findViewById(R.id.iv_img_cartoon);
//        textView.setText(longTitles[position]);
//        imageView.setImageResource(pics[position]);
//
//        return tabView;
//    }

}
