package com.example.pengalatdite.aplikasisederhana.screen.newslist;

import android.view.View;

import com.example.pengalatdite.aplikasisederhana.data.DataNews;

import java.util.List;

public interface NewsListViewMvc {
    View getRootView();

    void setDataNews(List<DataNews> dataNews);
}
