package com.example.less3_dz_1_part;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rv_chat;
    private ArrayList<String> nameList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv_chat = findViewById(R.id.rv_name);
        loadData();
        ChatAdapter adapter = new ChatAdapter(nameList);
        rv_chat.setAdapter(adapter);
    }

    private void loadData() {
        nameList.add("1");
        nameList.add("2");
        nameList.add("3");
        nameList.add("3");
        nameList.add("3");
        nameList.add("3");
        nameList.add("3");
        nameList.add("3");
        nameList.add("3");
        nameList.add("3");
        nameList.add("3");
        nameList.add("3");
        nameList.add("3");
        nameList.add("3");
        nameList.add("3");
        nameList.add("3");
        nameList.add("3");
        nameList.add("3");
        nameList.add("3");
        nameList.add("3");
        nameList.add("3");
        nameList.add("3");
        nameList.add("3");
        nameList.add("3");
        nameList.add("3");
        nameList.add("3");
        nameList.add("3");
        nameList.add("3");
        nameList.add("3");
    }
}
