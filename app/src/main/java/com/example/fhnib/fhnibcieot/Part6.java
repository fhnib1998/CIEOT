package com.example.fhnib.fhnibcieot;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Part6 extends Activity {
    ListView lvPart6;
    ArrayList<String> listPart6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_part6);
        lvPart6=(ListView) findViewById(R.id.lvPart6);
        listPart6 = new ArrayList<>();
        listPart6.add("Exercise 1");
        listPart6.add("Exercise 2");
        listPart6.add("Exercise 3");
        listPart6.add("Exercise 4");
        listPart6.add("Exercise 5");
        ArrayAdapter adapter6 = new ArrayAdapter(Part6.this,android.R.layout.simple_list_item_1,listPart6);
        lvPart6.setAdapter(adapter6);

    }
}
