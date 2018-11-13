package com.example.fhnib.fhnibcieot;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Part7 extends Activity {
    ListView lvPart7;
    ArrayList<String> listPart7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_part7);
        lvPart7=(ListView) findViewById(R.id.lvPart7);
        listPart7 = new ArrayList<>();
        listPart7.add("Exercise 1");
        listPart7.add("Exercise 2");
        listPart7.add("Exercise 3");
        listPart7.add("Exercise 4");
        listPart7.add("Exercise 5");
        ArrayAdapter adapter7 = new ArrayAdapter(Part7.this,android.R.layout.simple_list_item_1,listPart7);
        lvPart7.setAdapter(adapter7);
    }
}

