package com.example.wei.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.wei.R;
import com.squareup.picasso.Picasso;

public class ParticularsActivity extends AppCompatActivity {

    private ImageView imageView;
    private TextView title,text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_particulars);
        Intent intent = getIntent();

        int[]s = intent.getIntArrayExtra("flag");
        int flag = s[0];

        switch (flag){
            case 1:
                imageView =findViewById(R.id.iv_img_particuars);
                Picasso.with(this).load(intent.getStringExtra("img")).into(imageView);
                break;
            case 2:
                title = findViewById(R.id.tv_title_particuats);
                text = findViewById(R.id.tv_text_particuats);
                title.setText(intent.getStringExtra("title"));
                text.setText(intent.getStringExtra("text"));
                break;
        }

    }

}
