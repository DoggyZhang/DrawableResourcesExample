package com.kcode.github.shapedemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

/**
 * Created by caik on 2016/11/23.
 */

public class LevelActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level);

        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        imageView.getDrawable().setLevel(2);
    }
}
