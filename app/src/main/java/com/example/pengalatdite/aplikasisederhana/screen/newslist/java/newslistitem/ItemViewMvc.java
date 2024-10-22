package com.example.pengalatdite.aplikasisederhana.screen.newslist.java.newslistitem;

import android.view.View;

import com.example.pengalatdite.aplikasisederhana.data.DataNews;
import com.example.pengalatdite.aplikasisederhana.screen.common.ViewMvc;

public interface ItemViewMvc extends ViewMvc {
    View getRootView();

    void bindData(DataNews dataNews, String position);
}
