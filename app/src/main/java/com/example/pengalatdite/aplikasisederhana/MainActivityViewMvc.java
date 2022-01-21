package com.example.pengalatdite.aplikasisederhana;

import android.view.View;

import java.util.List;

public interface MainActivityViewMvc {
    View getRootView();

    void setDataNews(List<DataNews> dataNews);
}
