package com.example.wei.list_adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.wei.R;
import com.example.wei.base.CartoonBase;

import java.util.List;

/**
 * Created by wei on 2019/1/8.
 */

public class CartoonAdapter extends BaseAdapter {

    private Context context;
    private List<CartoonBase.ShowapiResBodyBean.PagebeanBean.ContentlistBean>list;
    private TextView textView;

     public CartoonAdapter(Context context, List<CartoonBase.ShowapiResBodyBean.PagebeanBean.ContentlistBean>list){

         this.list = list;
         this.context = context;
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


        view = LayoutInflater.from(context).inflate(R.layout.cartoon_list_layout,null);
        textView = view.findViewById(R.id.tv_title_list_cartoon);

        textView.setText(list.get(i).getTitle());

        return view;
    }
}
