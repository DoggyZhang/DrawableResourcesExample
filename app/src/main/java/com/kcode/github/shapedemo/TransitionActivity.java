package com.kcode.github.shapedemo;

import android.graphics.drawable.TransitionDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

/**
 * Created by caik on 2016/11/23.
 */

public class TransitionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transition);

        ImageView button = (ImageView) findViewById(R.id.imagebutton);
        TransitionDrawable drawable = (TransitionDrawable) button.getDrawable();
        drawable.startTransition(5000);

    }
}
