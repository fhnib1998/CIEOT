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

public class Info extends AppCompatActivity {
    DrawerLayout drawerLayout;
    ActionBarDrawerToggle drawerToggle;
    NavigationView navigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        //NAV
        navigationView = (NavigationView) findViewById(R.id.navigation_info);
        drawerLayout = (DrawerLayout) findViewById(R.id.drawerInfo);
        drawerToggle = new ActionBarDrawerToggle(this,drawerLayout,R.string.open,R.string.close);
        drawerLayout.addDrawerListener(drawerToggle);
        drawerToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        navigationView.setCheckedItem(R.id.nav_info);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                menuItem.setChecked(true);
                drawerLayout.closeDrawer(GravityCompat.START);
                switch (menuItem.getItemId()){
                    case R.id.nav_listpart:
                        startActivity(new Intent(Info.this,ListPart.class));
                        break;
                    case R.id.nav_vocabulary:
                        startActivity(new Intent(Info.this,ListVab.class));
                        break;
                    case R.id.nav_grammar:
                        startActivity(new Intent(Info.this,Grammars.class));
                        break;
                    case R.id.nav_meoj:
                        startActivity(new Intent(Info.this,Meos.class));
                        break;
                }
                return true;
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
