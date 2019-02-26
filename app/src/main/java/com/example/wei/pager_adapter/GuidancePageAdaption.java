package com.example.wei.pager_adapter;

import android.support.v4.view.PagerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by wei on 2019/1/3.
 */

public class GuidancePageAdaption extends PagerAdapter {

    private List<View> list;

    public GuidancePageAdaption(List<View>list){
        super();
        this.list = list;
    }


    @Override
    public int getCount() {
        return list.size();
    }

    //匹配是否key -values
    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    //销毁
    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {

        container.removeView(list.get(position));
    }

    //将View增加到ViewGroup组中，返回一个key
    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        Log.e("111",list.size()+"");
        container.addView(list.get(position));
        return list.get(position);
    }
}
