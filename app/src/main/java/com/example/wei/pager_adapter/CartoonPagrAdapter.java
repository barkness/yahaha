package com.example.wei.pager_adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by wei on 2019/1/9.
 */

public class CartoonPagrAdapter extends FragmentPagerAdapter {

    private List<Fragment>list;
    private String[] text;

    public CartoonPagrAdapter(FragmentManager fm, List<Fragment> list,String[] text){
        super(fm);
        this.list = list;
        this.text = text;
    }


    @Override
    public Fragment getItem(int position) {
        return list.get(position);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return text[position];
    }
}
