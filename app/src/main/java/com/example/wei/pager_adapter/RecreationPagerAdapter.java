package com.example.wei.pager_adapter;



import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by wei on 2019/1/3.
 */

public class RecreationPagerAdapter extends FragmentPagerAdapter {

    private  List<Fragment>list;
    private List<String>text;

    public RecreationPagerAdapter(FragmentManager fragmentManager, List<Fragment>list,List<String>text){
        super(fragmentManager);
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
        return text.get(position);
    }
}
