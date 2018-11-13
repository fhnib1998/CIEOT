package com.example.fhnib.fhnibcieot;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Part2 extends Activity {
    ListView lvPart2;
    ArrayList<String> listPart2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_part2);
        lvPart2=(ListView) findViewById(R.id.lvPart2);
        listPart2 = new ArrayList<>();
        listPart2.add("Exercise 1");
        listPart2.add("Exercise 2");
        listPart2.add("Exercise 3");
        listPart2.add("Exercise 4");
        listPart2.add("Exercise 5");
        ArrayAdapter adapter2 = new ArrayAdapter(Part2.this,android.R.layout.simple_list_item_1,listPart2);
        lvPart2.setAdapter(adapter2);
    }
}
