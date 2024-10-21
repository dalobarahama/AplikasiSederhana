package com.example.pengalatdite.aplikasisederhana.screen.newslist.newslistitem;

import android.view.View;

import com.example.pengalatdite.aplikasisederhana.DataNews;
import com.example.pengalatdite.aplikasisederhana.screen.common.ViewMvc;

public interface ItemViewMvc extends ViewMvc {
    View getRootView();

    void bindData(DataNews dataNews, String position);
}
