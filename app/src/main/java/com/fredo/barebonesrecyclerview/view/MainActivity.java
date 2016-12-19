package com.fredo.barebonesrecyclerview.view;

import android.support.annotation.NonNull;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.fredo.barebonesrecyclerview.R;
import com.fredo.barebonesrecyclerview.presenter.Presenter;
import com.hannesdorfmann.mosby.mvp.MvpActivity;

public class MainActivity extends MvpActivity<ActivityViewInterface, Presenter> implements ActivityViewInterface {

    private RecyclerView recyclerView;
    private RecyclerAdapter recAdapter;
    private LinearLayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setUpRecyclerView();
        showNumList();
    }

    private void showNumList() {
        presenter.loadData();
    }

    @Override
    public void setUpRecyclerView() {
        recyclerView = (RecyclerView) findViewById(R.id.list);
        recAdapter = new RecyclerAdapter();
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setAdapter(recAdapter);
        recyclerView.setLayoutManager(layoutManager);
    }

    @NonNull
    @Override
    public Presenter createPresenter() {
        return new Presenter();
    }

    @Override
    public void displayData(int[] data) {
        recAdapter.setData(data);
        recAdapter.notifyDataSetChanged();
    }
}
