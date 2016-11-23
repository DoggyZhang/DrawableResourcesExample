package com.kcode.github.shapedemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

/**
 * Created by caik on 2016/11/23.
 */

public class ScaleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scale);
        ImageView view30 = (ImageView) findViewById(R.id.image30);
        view30.setImageLevel(1);

        ImageView view50 = (ImageView) findViewById(R.id.image50);
        view50.setImageLevel(1);

        ImageView view80 = (ImageView) findViewById(R.id.image80);
        view80.setImageLevel(1);
    }

}
