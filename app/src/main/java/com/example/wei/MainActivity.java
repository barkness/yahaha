package com.example.wei;



import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.widget.RadioGroup;


import com.example.wei.Frame.CartoonMainFrament;
import com.example.wei.Frame.GhostFrameAdapter;
import com.example.wei.Frame.GhostMainFrament;
import com.example.wei.Frame.RecreayionMainFrame;



public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener{


    private RadioGroup radioGroup;
    private FragmentManager fragmentManager;
    private RecreayionMainFrame recreayionMainFrame;
    private GhostMainFrament ghostMainFrament;
    private CartoonMainFrament cartoonMainFrament;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentManager = getSupportFragmentManager();
        radioGroup = findViewById(R.id.rg_mian);
        radioGroup.setOnCheckedChangeListener(this);

    }

    @Override
    public void onCheckedChanged(RadioGroup radioGroup, int i) {
        FragmentTransaction ft = fragmentManager.beginTransaction();
        hideAllFragment(ft);
        switch (i){
            case R.id.rb1_mian:
                if (recreayionMainFrame==null){
                    recreayionMainFrame = new RecreayionMainFrame();
                    getSupportFragmentManager().beginTransaction().add(R.id.fl_main,recreayionMainFrame).commit();
                }else {
                    ft.show(recreayionMainFrame);
                }
                break;
            case R.id.rb4_mian:
                if (ghostMainFrament==null){
                    ghostMainFrament = new GhostMainFrament();
                    getSupportFragmentManager().beginTransaction().add(R.id.fl_main,ghostMainFrament).commit();

                }else {
                    ft.show(ghostMainFrament);
                }
                break;
            case R.id.rb2_mian:
                if (cartoonMainFrament==null){
                    cartoonMainFrament = new CartoonMainFrament();
                    getSupportFragmentManager().beginTransaction().add(R.id.fl_main,cartoonMainFrament).commit();
                }else {
                    ft.show(cartoonMainFrament);
                }
        }
        ft.commit();
    }

    private void hideAllFragment(FragmentTransaction ft){
        if (recreayionMainFrame!=null)ft.hide(recreayionMainFrame);
        if (ghostMainFrament!=null) ft.hide(ghostMainFrament);
        if (cartoonMainFrament!=null) ft.hide(cartoonMainFrament);
    }
}
