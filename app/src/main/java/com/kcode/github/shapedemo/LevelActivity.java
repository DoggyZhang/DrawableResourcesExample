package com.kcode.github.shapedemo;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import static com.kcode.github.shapedemo.R.id.imageView;

/**
 * Created by caik on 2016/11/23.
 */

public class LevelActivity extends BaseActivity {

    private EditText mLevel;
    private ImageView mLevelView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level);

        mLevel = (EditText) findViewById(R.id.et_level);
        mLevelView = (ImageView) findViewById(imageView);
    }

    public void sure(View view) {
        String levelText = mLevel.getText().toString();
        if (TextUtils.isEmpty(levelText)) {
            Toast.makeText(this, "level can't empty", Toast.LENGTH_SHORT).show();
            return;
        }

        int level = Integer.parseInt(levelText);
        Drawable drawable = mLevelView.getDrawable();
        if (drawable != null) {
            drawable.setLevel(level);
        }
    }

}
