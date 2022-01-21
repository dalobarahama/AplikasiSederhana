package com.example.pengalatdite.aplikasisederhana;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.List;

public class MainActivityViewMvcImpl extends BaseViewMvc implements MainActivityViewMvc {
    private final Adapter adapter;

    public MainActivityViewMvcImpl(LayoutInflater layoutInflater, ViewGroup parent) {
        setRootView(layoutInflater.inflate(R.layout.activity_main, parent, false));

        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter = new Adapter();
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void setDataNews(List<DataNews> dataNews) {
        adapter.bindNews(dataNews);
    }
}
