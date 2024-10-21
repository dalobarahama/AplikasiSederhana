package com.example.pengalatdite.aplikasisederhana.screen.newslist;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.pengalatdite.aplikasisederhana.DataNews;
import com.example.pengalatdite.aplikasisederhana.R;
import com.example.pengalatdite.aplikasisederhana.screen.common.BaseViewMvc;

import java.util.List;

public class NewsListViewMvcImpl extends BaseViewMvc implements NewsListViewMvc {
    private final NewsAdapter newsAdapter;

    public NewsListViewMvcImpl(LayoutInflater layoutInflater, ViewGroup parent) {
        setRootView(layoutInflater.inflate(R.layout.activity_main, parent, false));

        RecyclerView recyclerView = findViewById(R.id.recylerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        newsAdapter = new NewsAdapter();
        recyclerView.setAdapter(newsAdapter);
    }

    @Override
    public void setDataNews(List<DataNews> dataNews) {
        newsAdapter.bindNews(dataNews);
    }
}
