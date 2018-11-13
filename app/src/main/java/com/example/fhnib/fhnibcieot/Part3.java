package com.example.fhnib.fhnibcieot;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Part3 extends Activity {
    ListView lvPart3;
    ArrayList<String> listPart3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_part3);
        lvPart3=(ListView) findViewById(R.id.lvPart3);
        listPart3 = new ArrayList<>();
        listPart3.add("Exercise 1");
        listPart3.add("Exercise 2");
        listPart3.add("Exercise 3");
        listPart3.add("Exercise 4");
        listPart3.add("Exercise 5");
        ArrayAdapter adapter3 = new ArrayAdapter(Part3.this,android.R.layout.simple_list_item_1,listPart3);
        lvPart3.setAdapter(adapter3);
    }
}
