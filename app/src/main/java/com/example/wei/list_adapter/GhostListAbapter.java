package com.example.wei.list_adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.wei.R;
import com.example.wei.base.GhostListBase;

import java.util.List;

/**
 * Created by wei on 2019/1/4.
 */

public class GhostListAbapter extends BaseAdapter {

    private Context context;
    private TextView title,desc;
    private List<GhostListBase.ShowapiResBodyBean.PagebeanBean.ContentlistBean>list;

    public GhostListAbapter(Context context,List<GhostListBase.ShowapiResBodyBean.PagebeanBean.ContentlistBean>list){
        this.context = context;
        this.list = list;

    }

    @Override
    public int getCount() {
        return list==null?0:list.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {


        view = LayoutInflater.from(context).inflate(R.layout.ghost_lits_layout,null);
        title = view.findViewById(R.id.tv_title_ghost);
        desc = view.findViewById(R.id.tv_desc_ghost);
        title.setText(list.get(i).getTitle());
        desc.setText(list.get(i).getDesc());

        return view;
    }
}
