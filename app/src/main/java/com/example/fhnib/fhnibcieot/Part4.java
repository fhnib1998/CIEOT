package com.example.fhnib.fhnibcieot;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Part4 extends Activity {
    ListView lvPart4;
    ArrayList<String> listPart4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_part4);
        lvPart4=(ListView) findViewById(R.id.lvPart4);
        listPart4 = new ArrayList<>();
        listPart4.add("Exercise 1");
        listPart4.add("Exercise 2");
        listPart4.add("Exercise 3");
        listPart4.add("Exercise 4");
        listPart4.add("Exercise 5");
        ArrayAdapter adapter4 = new ArrayAdapter(Part4.this,android.R.layout.simple_list_item_1,listPart4);
        lvPart4.setAdapter(adapter4);
    }
}

