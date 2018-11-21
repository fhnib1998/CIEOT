package com.example.fhnib.fhnibcieot;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txtToeic;
    Button btnStart;
    ImageView ivToeic;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Anhxa();
        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ListPart.class);
                startActivity(intent);
            }
        });
    }
    public void Anhxa(){
        txtToeic = (TextView) findViewById(R.id.textviewToeic);
        btnStart = (Button) findViewById(R.id.buttonStart);
    }
}
