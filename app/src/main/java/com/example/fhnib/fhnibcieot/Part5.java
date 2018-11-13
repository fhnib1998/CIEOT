package com.example.fhnib.fhnibcieot;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Part5 extends Activity {
    ListView lvPart5;
    ArrayList<String> listPart5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_part5);
        lvPart5=(ListView) findViewById(R.id.lvPart5);
        listPart5 = new ArrayList<>();
        listPart5.add("Exercise 1");
        listPart5.add("Exercise 2");
        listPart5.add("Exercise 3");
        listPart5.add("Exercise 4");
        listPart5.add("Exercise 5");
        ArrayAdapter adapter5 = new ArrayAdapter(Part5.this,android.R.layout.simple_list_item_1,listPart5);
        lvPart5.setAdapter(adapter5);
        lvPart5.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        startActivity(new Intent(Part5.this,Exercise1Part5.class));
                        break;
                }
            }
        });
    }
}

