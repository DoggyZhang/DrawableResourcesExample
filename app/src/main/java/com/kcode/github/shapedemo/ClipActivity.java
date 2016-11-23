package com.kcode.github.shapedemo;

import android.graphics.drawable.ClipDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

/**
 * Created by caik on 2016/11/23.
 */

public class ClipActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clip);

        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        ClipDrawable drawable = (ClipDrawable) imageView.getBackground();
        //level:0-10000.
        drawable.setLevel(5000);
    }
}
