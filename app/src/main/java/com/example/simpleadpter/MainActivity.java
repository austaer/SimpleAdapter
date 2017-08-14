package com.example.simpleadpter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //動態資訊 陣列
        int[] img = {R.mipmap.ic_launcher, R.mipmap.ic_launcher, R.mipmap.ic_launcher};
        String[] title = {"Alice", "Bob", "Cindy"};

        ListView listView = (ListView) findViewById(R.id.listView);

        ArrayList<HashMap<String, Object>> listItem = new ArrayList<HashMap<String, Object>>();

        for (int i = 0; i < title.length; i++) {
            HashMap<String, Object> map = new HashMap<String, Object>();
            map.put("ItemImage", img[i]);
            map.put("ItemTitle", title[i]);
            listItem.add(map);
        }

        SimpleAdapter listItemAdapter = new SimpleAdapter(this, listItem, R.layout.list, new String[]{"ItemImage", "ItemTitle"}, new int[]{R.id.imageView, R.id.textView});

        listView.setAdapter(listItemAdapter);

    }

}
