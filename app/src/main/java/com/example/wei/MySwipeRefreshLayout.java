package com.example.wei;

import android.content.Context;
import android.support.v4.widget.SwipeRefreshLayout;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AbsListView;
import android.widget.ListView;
import android.widget.TextView;


/**
 * Created by ZXY on 2018/12/21 11:03.
 * Class functions
 * *********************************************************
 * *
 * *********************************************************
 */

public class MySwipeRefreshLayout extends SwipeRefreshLayout {
    private View footView;
    private TextView tv_foot_context;

    private OnMySwipeRefreshLayoutListener onMySwipeRefreshLayoutListener;

    private ListView listView;

    private boolean isLoading = true;

    public MySwipeRefreshLayout(Context context) {
        super(context);
        init(context);

    }

    public MySwipeRefreshLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        if (listView == null) {
            try {
                listView = (ListView) getChildAt(1);
                listView.addFooterView(footView);
            } catch (Exception e) {
//                Log.e("111", "SwipeRefreshLayout的第一个子控件必须是ListView");
                listView = (ListView) getChildAt(0);
            }

            listView.setOnScrollListener(new AbsListView.OnScrollListener() {
                @Override
                public void onScrollStateChanged(AbsListView view, int scrollState) {
                    if (isLoading && listView.getLastVisiblePosition() == listView.getCount() - 1 && scrollState == SCROLL_STATE_IDLE) {
                        isLoading = false;
                        Log.e("111", "开始加载更多");
                        onMySwipeRefreshLayoutListener.OnLoad();//加载更多的回调
                    }
                }

                @Override
                public void onScroll(AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {

                }
            });
        }
    }

    public void init(Context mContext) {
        footView = LayoutInflater.from(mContext).inflate(R.layout.footview, null);
        tv_foot_context = footView.findViewById(R.id.foot_context);

        this.setOnRefreshListener(new OnRefreshListener() {
            @Override
            public void onRefresh() {
                completLoad();
                onMySwipeRefreshLayoutListener.OnFlush();//刷新接口的回掉
            }
        });
    }

    public interface OnMySwipeRefreshLayoutListener {
        void OnFlush();

        void OnLoad();
    }

    public void setOnMySwipeRefreshLayoutListener(OnMySwipeRefreshLayoutListener onMySwipeRefreshLayoutListener) {
        this.onMySwipeRefreshLayoutListener = onMySwipeRefreshLayoutListener;
    }

    public void completLoad() {
        isLoading = true;
        tv_foot_context.setText("加载中");
    }

    public void completLoadEnd() {
        isLoading = true;
        tv_foot_context.setText("已经到最后一页了");
    }
}
