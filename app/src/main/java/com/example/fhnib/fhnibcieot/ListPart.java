package com.example.fhnib.fhnibcieot;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ListPart extends AppCompatActivity {
    ExpandableListView expandableListView;
    List<String> listdataPart;
    HashMap<String,List<String>> listdataExercise;
    CustomExpandablelistview customExpandablelistview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_part);
        expandableListView = findViewById(R.id.expandableListview);
        listdataExercise = new HashMap<String, List<String>>();
        listdataPart = new ArrayList<>();
        //
        listdataPart.add("\nPart I: Photograph\n");
        listdataPart.add("\nPart II: Question & Response\n");
        listdataPart.add("\nPart III: Short conversation\n");
        listdataPart.add("\nPart IV: Short talk\n");
        listdataPart.add("\nPart V: Incomplete sentence\n");
        listdataPart.add("\nPart VI: Incomplete text\n");
        listdataPart.add("\nPart VII: Reading Comprehension\n");

        //list Part 1
        List<String> exPart1 = new ArrayList<>();
        exPart1.add("Exercise 1");
        exPart1.add("Exercise 2");
        exPart1.add("Exercise 3");
        exPart1.add("Exercise 4");
        //list Part 2
        List<String> exPart2 = new ArrayList<>();
        exPart2.add("Exercise 1");
        exPart2.add("Exercise 2");
        exPart2.add("Exercise 3");
        exPart2.add("Exercise 4");
        //list Part 3
        List<String> exPart3 = new ArrayList<>();
        exPart3.add("Exercise 1");
        exPart3.add("Exercise 2");
        exPart3.add("Exercise 3");
        //list Part 4
        List<String> exPart4 = new ArrayList<>();
        exPart4.add("Exercise 1");
        exPart4.add("Exercise 2");
        //list Part 5
        List<String> exPart5 = new ArrayList<>();
        exPart5.add("Exercise 1");
        exPart5.add("Exercise 2");
        exPart5.add("Exercise 3");
        exPart5.add("Exercise 4");
        //list Part 6
        List<String> exPart6 = new ArrayList<>();
        exPart6.add("Exercise 1");
        exPart6.add("Exercise 2");
        exPart6.add("Exercise 3");
        exPart6.add("Exercise 4");
        //list Part 7
        List<String> exPart7 = new ArrayList<>();
        exPart7.add("Exercise 1");
        exPart7.add("Exercise 2");
        exPart7.add("Exercise 3");
        //
        listdataExercise.put( listdataPart.get(0),exPart1);
        listdataExercise.put( listdataPart.get(1),exPart2);
        listdataExercise.put( listdataPart.get(2),exPart3);
        listdataExercise.put( listdataPart.get(3),exPart4);
        listdataExercise.put( listdataPart.get(4),exPart5);
        listdataExercise.put( listdataPart.get(5),exPart6);
        listdataExercise.put( listdataPart.get(6),exPart7);
        //set Adapter
        customExpandablelistview = new CustomExpandablelistview(ListPart.this,listdataPart,listdataExercise);
        expandableListView.setAdapter(customExpandablelistview);

        expandableListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {
                //Part1
                if(groupPosition==0){
                    switch (childPosition){
                        case 0:
                            startActivity(new Intent(ListPart.this,Exercise1Part1.class));
                            overridePendingTransition(R.anim.anum_enter,R.anim.anim_exit);
                            break;
                    }
                }
                //Part2
                if(groupPosition==1){
                    switch (childPosition){
                        case 0:
                            startActivity(new Intent(ListPart.this,Exercise1Part2.class));
                            overridePendingTransition(R.anim.anum_enter,R.anim.anim_exit);
                    }
                }
                //Part3
                if(groupPosition==2){
                    switch (childPosition){

                    }
                }
                //Part4
                if(groupPosition==3){
                    switch (childPosition){

                    }
                }
                //Part5
                if(groupPosition==4){
                    switch (childPosition){
                        case 0:
                            startActivity(new Intent(ListPart.this,Exercise1Part5.class));
                            overridePendingTransition(R.anim.anum_enter,R.anim.anim_exit);
                            break;
                    }
                }
                //Part6
                if(groupPosition==5){
                    switch (childPosition){
                        case 0:
                            startActivity(new Intent(ListPart.this,Exercise1Part6.class));
                            overridePendingTransition(R.anim.anum_enter,R.anim.anim_exit);
                            break;
                    }
                }
                //Part7
                if(groupPosition==6){
                    switch (childPosition){

                    }
                }
                return false;
            }
        });
    }
}
