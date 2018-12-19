package com.example.fhnib.fhnibcieot;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.ExpandableListView;

import com.example.fhnib.fhnibcieot.CustomView.CustomExpandablelistview;
import com.example.fhnib.fhnibcieot.Exercises.Exercise1Part1;
import com.example.fhnib.fhnibcieot.Exercises.Exercise1Part2;
import com.example.fhnib.fhnibcieot.Exercises.Exercise1Part3;
import com.example.fhnib.fhnibcieot.Exercises.Exercise1Part4;
import com.example.fhnib.fhnibcieot.Exercises.Exercise1Part5;
import com.example.fhnib.fhnibcieot.Exercises.Exercise1Part6;
import com.example.fhnib.fhnibcieot.Exercises.Exercise1Part7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ListPart extends AppCompatActivity {
    DrawerLayout drawerLayout;
    ActionBarDrawerToggle drawerToggle;
    NavigationView navigationView;
    ExpandableListView expandableListView;
    List<String> listdataPart;
    HashMap<String,List<String>> listdataExercise;
    CustomExpandablelistview customExpandablelistview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_part);
        //NAV
        navigationView = (NavigationView) findViewById(R.id.navigation_part);
        drawerLayout = (DrawerLayout) findViewById(R.id.drawerPart);
        drawerToggle = new ActionBarDrawerToggle(this,drawerLayout,R.string.open,R.string.close);
        drawerLayout.addDrawerListener(drawerToggle);
        drawerToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        navigationView.setCheckedItem(R.id.nav_listpart);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                menuItem.setChecked(true);
                drawerLayout.closeDrawer(GravityCompat.START);
                switch (menuItem.getItemId()){
                    case R.id.nav_vocabulary:
                        startActivity(new Intent(ListPart.this,ListVab.class));
                        break;
                    case R.id.nav_grammar:
                        startActivity(new Intent(ListPart.this,Grammars.class));
                        break;
                    case R.id.nav_meoj:
                        startActivity(new Intent(ListPart.this,Meos.class));
                        break;
                    case R.id.nav_info:
                        startActivity(new Intent(ListPart.this,Info.class));
                        break;
                }
                return true;
            }
        });
        //Expandable
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
        exPart1.add("Example");
        exPart1.add("Tranh tả người");
        exPart1.add("Tranh tả vật");
        //list Part 2
        List<String> exPart2 = new ArrayList<>();
        exPart2.add("Example");
        exPart2.add("Statement");
        exPart2.add("WH Question");
        exPart2.add("How");
        //list Part 3
        List<String> exPart3 = new ArrayList<>();
        exPart3.add("Example");
        exPart3.add("Chủ đề 1");
        exPart3.add("Chủ đề n");
        //list Part 4
        List<String> exPart4 = new ArrayList<>();
        exPart4.add("Example");
        exPart4.add("Chủ đề n");
        //list Part 5
        List<String> exPart5 = new ArrayList<>();
        exPart5.add("Exemple");
        exPart5.add("Unit 1");
        exPart5.add("Unit 2");
        exPart5.add("Unit n");
        //list Part 6
        List<String> exPart6 = new ArrayList<>();
        exPart6.add("Example");
        exPart6.add("Unit n");
        //list Part 7
        List<String> exPart7 = new ArrayList<>();
        exPart7.add("Example");
        exPart7.add("Unit 1");
        exPart7.add("Unit n");
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
                            break;
                    }
                }
                //Part2
                if(groupPosition==1){
                    switch (childPosition){
                        case 0:
                            startActivity(new Intent(ListPart.this,Exercise1Part2.class));
                            break;
                    }
                }
                //Part3
                if(groupPosition==2){
                    switch (childPosition){
                        case 0:
                            startActivity(new Intent(ListPart.this,Exercise1Part3.class));
                            break;
                    }
                }
                //Part4
                if(groupPosition==3){
                    switch (childPosition){
                        case 0:
                            startActivity(new Intent(ListPart.this,Exercise1Part4.class));
                            break;
                    }
                }
                //Part5
                if(groupPosition==4){
                    switch (childPosition){
                        case 0:
                            startActivity(new Intent(ListPart.this,Exercise1Part5.class));
                            break;
                    }
                }
                //Part6
                if(groupPosition==5){
                    switch (childPosition){
                        case 0:
                            startActivity(new Intent(ListPart.this,Exercise1Part6.class));
                            break;
                    }
                }
                //Part7
                if(groupPosition==6){
                    switch (childPosition){
                        case 0:
                            startActivity(new Intent(ListPart.this,Exercise1Part7.class));
                            break;
                    }
                }
                return false;
            }
        });
    }
    //Click ToolBar
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(drawerToggle.onOptionsItemSelected(item)){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
