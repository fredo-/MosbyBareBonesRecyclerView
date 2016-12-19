package com.fredo.barebonesrecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerAdapter recAdapter;
    private LinearLayoutManager layoutManager;
    private int[] data = {1, 2, 3, 4};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.list);
        recAdapter = new RecyclerAdapter(data);
        layoutManager = new LinearLayoutManager(this);

        recyclerView.setAdapter(recAdapter);
        recyclerView.setLayoutManager(layoutManager);
    }
}
