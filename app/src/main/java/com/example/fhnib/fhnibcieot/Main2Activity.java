package com.example.fhnib.fhnibcieot;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {
    ListView lvPart;
    ArrayList<String> listPart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        lvPart = (ListView) findViewById(R.id.listviewPart);
        listPart=new ArrayList<>();
        listPart.add("Part I: Mô Tả Hình Ảnh");
        listPart.add("Part II: Hỏi Đáp");
        listPart.add("Part III: Đoạn Hội Thoại");
        listPart.add("Part IV: Độc Thoại");
        listPart.add("Part V: Câu Không Hoàn Chỉnh");
        listPart.add("Part VI: Hoàn Thành Đoạn Văn");
        listPart.add("Part VII: Đọc Hiểu");
        ArrayAdapter adapter = new ArrayAdapter(Main2Activity.this,android.R.layout.simple_list_item_1,listPart);
        lvPart.setAdapter(adapter);
        lvPart.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        startActivity(new Intent(Main2Activity.this,Part1.class));
                        break;
                    case 1:
                        startActivity(new Intent(Main2Activity.this,Part2.class));
                        break;
                    case 2:
                        startActivity(new Intent(Main2Activity.this,Part3.class));
                        break;
                    case 3:
                        startActivity(new Intent(Main2Activity.this,Part4.class));
                        break;
                    case 4:
                        startActivity(new Intent(Main2Activity.this,Part5.class));
                        break;
                    case 5:
                        startActivity(new Intent(Main2Activity.this,Part6.class));
                        break;
                    case 6:
                        startActivity(new Intent(Main2Activity.this,Part7.class));
                        break;

                }
            }
        });
    }

}
