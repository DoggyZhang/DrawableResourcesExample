package com.kcode.github.shapedemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{

    private final static Map<Integer,Class<?>> clsMap = new HashMap<>();

    static {
        clsMap.put(0, BitmapActivity.class);
        clsMap.put(1, NinePatchActivity.class);
        clsMap.put(2, LayerActivity.class);
        clsMap.put(3, StateActivity.class);
        clsMap.put(4, LevelActivity.class);
        clsMap.put(5, TransitionActivity.class);
        clsMap.put(6, InsetActivity.class);
        clsMap.put(7, ClipActivity.class);
        clsMap.put(8, ScaleActivity.class);
        clsMap.put(9, ShapeActivity.class);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView mListView = (ListView) findViewById(R.id.listView);
        mListView.setAdapter(new ArrayAdapter<String>(
                this,
                R.layout.item_name,
                R.id.name,
                getResources().getStringArray(R.array.MyList)));

        mListView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        start2Act(clsMap.get(position));
    }

    private void start2Act(Class<?> cls) {
        Intent intent = new Intent(this, cls);
        startActivity(intent);
    }
}
