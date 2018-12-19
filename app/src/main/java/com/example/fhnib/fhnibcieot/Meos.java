package com.example.fhnib.fhnibcieot;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;
import android.view.View;

import com.example.fhnib.fhnibcieot.CustomView.ItemClickSupport;
import com.example.fhnib.fhnibcieot.CustomView.Meoj;
import com.example.fhnib.fhnibcieot.CustomView.MeojAdapter;
import com.example.fhnib.fhnibcieot.Meojs.MeojPart1;
import com.example.fhnib.fhnibcieot.Meojs.MeojPart2;
import com.example.fhnib.fhnibcieot.Meojs.MeojPart3;
import com.example.fhnib.fhnibcieot.Meojs.MeojPart4;
import com.example.fhnib.fhnibcieot.Meojs.MeojPart5;
import com.example.fhnib.fhnibcieot.Meojs.MeojPart6;
import com.example.fhnib.fhnibcieot.Meojs.MeojPart7;

import java.util.ArrayList;
import java.util.List;

public class Meos extends AppCompatActivity {
    DrawerLayout drawerLayout;
    ActionBarDrawerToggle drawerToggle;
    NavigationView navigationMeoj;
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    List<Meoj> meojList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meos);
        //Nav
        navigationMeoj = (NavigationView) findViewById(R.id.navigation_meoj);
        drawerLayout = (DrawerLayout) findViewById(R.id.drawermeoj);
        drawerToggle = new ActionBarDrawerToggle(this,drawerLayout,R.string.open,R.string.close);
        drawerLayout.addDrawerListener(drawerToggle);
        drawerToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        navigationMeoj.setCheckedItem(R.id.nav_meoj);
        navigationMeoj.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                menuItem.setChecked(true);
                drawerLayout.closeDrawer(GravityCompat.START);
                switch (menuItem.getItemId()){
                    case R.id.nav_listpart:
                        startActivity(new Intent(Meos.this,ListPart.class));
                        break;
                    case R.id.nav_vocabulary:
                        startActivity(new Intent(Meos.this,ListVab.class));
                        break;
                    case R.id.nav_grammar:
                        startActivity(new Intent(Meos.this,Grammars.class));
                        break;
                    case R.id.nav_info:
                        startActivity(new Intent(Meos.this,Info.class));
                        break;
                }
                return true;
            }
        });
        //Recycler
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        //add list meoj
        meojList = new ArrayList<>();
        meojList.add(new Meoj("Mẹo #1: Mô tả hình ảnh",R.drawable.part1));
        meojList.add(new Meoj("Mẹo #2: Hỏi đáp",R.drawable.part2));
        meojList.add(new Meoj("Mẹo #3: Đoạn hội thoại",R.drawable.part3));
        meojList.add(new Meoj("Mẹo #4: Độc thoại",R.drawable.part4));
        meojList.add(new Meoj("Mẹo #5: Điền vào chỗ trống",R.drawable.part5));
        meojList.add(new Meoj("Mẹo #6: Điền vào đoạn văn",R.drawable.part6));
        meojList.add(new Meoj("Mẹo #7: Đọc hiểu đoạn văn",R.drawable.part7));
        adapter = new MeojAdapter(this,meojList);
        recyclerView.setAdapter(adapter);
        ItemClickSupport.addTo(recyclerView).setOnItemClickListener(
                new ItemClickSupport.OnItemClickListener() {
                    @Override
                    public void onItemClicked(RecyclerView recyclerView, int position, View v) {
                        switch (position){
                            case 0:
                                startActivity(new Intent(Meos.this,MeojPart1.class));
                                break;
                            case 1:
                                startActivity(new Intent(Meos.this,MeojPart2.class));
                                break;
                            case 2:
                                startActivity(new Intent(Meos.this,MeojPart3.class));
                                break;
                            case 3:
                                startActivity(new Intent(Meos.this,MeojPart4.class));
                                break;
                            case 4:
                                startActivity(new Intent(Meos.this,MeojPart5.class));
                                break;
                            case 5:
                                startActivity(new Intent(Meos.this,MeojPart6.class));
                                break;
                            case 6:
                                startActivity(new Intent(Meos.this,MeojPart7.class));
                                break;
                        }
                    }
                }
        );
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
