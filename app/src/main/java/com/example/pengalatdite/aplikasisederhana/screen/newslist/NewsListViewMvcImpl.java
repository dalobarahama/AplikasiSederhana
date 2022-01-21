package com.example.pengalatdite.aplikasisederhana.screen.newslist;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.example.pengalatdite.aplikasisederhana.data.DataNews;
import com.example.pengalatdite.aplikasisederhana.R;
import com.example.pengalatdite.aplikasisederhana.screen.common.BaseViewMvc;

import java.util.List;

public class NewsListViewMvcImpl extends BaseViewMvc implements NewsListViewMvc {
    private final NewsAdapter newsAdapter;

    public NewsListViewMvcImpl(LayoutInflater layoutInflater, ViewGroup parent) {
        setRootView(layoutInflater.inflate(R.layout.activity_main, parent, false));

        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        newsAdapter = new NewsAdapter();
        recyclerView.setAdapter(newsAdapter);
    }

    @Override
    public void setDataNews(List<DataNews> dataNews) {
        newsAdapter.bindNews(dataNews);
    }
}
