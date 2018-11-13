package com.example.fhnib.fhnibcieot;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Part1 extends Activity {
    ListView lvPart1;
    ArrayList<String> listPart1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_part1);
        lvPart1=(ListView) findViewById(R.id.lvPart1);
        listPart1 = new ArrayList<>();
        listPart1.add("Exercise 1");
        listPart1.add("Exercise 2");
        listPart1.add("Exercise 3");
        listPart1.add("Exercise 4");
        listPart1.add("Exercise 5");
        ArrayAdapter adapter1 = new ArrayAdapter(Part1.this,android.R.layout.simple_list_item_1,listPart1);
        lvPart1.setAdapter(adapter1);
    }
}
