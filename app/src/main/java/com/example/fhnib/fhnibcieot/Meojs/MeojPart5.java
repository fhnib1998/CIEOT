package com.example.fhnib.fhnibcieot.Meojs;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

import com.example.fhnib.fhnibcieot.Meos;
import com.example.fhnib.fhnibcieot.R;

public class MeojPart5 extends AppCompatActivity {
    ImageButton imageButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meoj_part5);
        imageButton = (ImageButton) findViewById(R.id.imagebuttonOut);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MeojPart5.this,Meos.class));
            }
        });
    }
}
