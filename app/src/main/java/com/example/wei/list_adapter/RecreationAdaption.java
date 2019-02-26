package com.example.wei.list_adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.wei.R;
import com.example.wei.base.RecreationBase;
import com.example.wei.base.TextRecreatonBase;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by wei on 2018/12/29.
 */

public class RecreationAdaption extends BaseAdapter {

    private ImageView imageView;
    private TextView textView;
    private TextView title;

    private Context context;
    private List<RecreationBase.ShowapiResBodyBean.ContentlistBean> list;
    private int flag;
    private List<TextRecreatonBase.ShowapiResBodyBean.ContentlistBean>list2;

    public RecreationAdaption(Context context,
                              List<RecreationBase.ShowapiResBodyBean.ContentlistBean> list, int flag) {
        this.context = context;
        this.list = list;
        this.flag = flag;
    }
    public RecreationAdaption(Context context,List<TextRecreatonBase.ShowapiResBodyBean.ContentlistBean>list2, int flag,int i) {
        this.context = context;
        this.list2 =list2 ;
        this.flag = flag;
    }

    @Override
    public int getCount() {

        switch (flag){
            case 1:
                return list == null ? 0 : list.size();

            case 2:
                return list2 == null?0:list2.size();

        }
       return 0;
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

        switch (flag) {
            case 1:
                view = LayoutInflater.from(context).inflate(R.layout.recreation_gridview_layot, null);
                imageView = view.findViewById(R.id.iv_img_gridview);
                textView = view.findViewById(R.id.tv_text_gridview);
                textView.setText(list.get(i).getTitle());
                Picasso.with(context).load(list.get(i).getImg()).into(imageView);
                break;
            case 2:
                view = LayoutInflater.from(context).inflate(R.layout.recreation_text_gridview_layout, null);
                textView = view.findViewById(R.id.tv_text_text);
                title = view.findViewById(R.id.tv_title_text);

                textView.setText(list2.get(i).getText());
                title.setText(list2.get(i).getTitle());

                break;

        }
        return view;
    }
}
