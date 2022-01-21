package com.example.pengalatdite.aplikasisederhana;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class ViewMVCImpl implements ViewMVC {
    private final View rootView;
    private RecyclerView recyclerView;
    private Adapter adapter;

    public ViewMVCImpl(LayoutInflater layoutInflater, ViewGroup parent) {
        rootView = layoutInflater.inflate(R.layout.activity_main, parent, false);

        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter = new Adapter();
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void setDataNews(List<DataNews> dataNews) {
        adapter.bindNews(dataNews);
    }

    @Override
    public View getRootView() {
        return rootView;
    }

    protected <T extends View> T findViewById(int id) {
        return getRootView().findViewById(id);
    }

    protected Context getContext() {
        return getRootView().getContext();
    }
}
