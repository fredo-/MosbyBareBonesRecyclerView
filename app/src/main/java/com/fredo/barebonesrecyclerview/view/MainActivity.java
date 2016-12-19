package com.fredo.barebonesrecyclerview.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.fredo.barebonesrecyclerview.R;
import com.fredo.barebonesrecyclerview.RecyclerAdapter;
import com.hannesdorfmann.mosby.mvp.MvpActivity;

public class MainActivity extends MvpActivity<ActivityViewInterface Presenter> implements ActivityViewInterface {

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
