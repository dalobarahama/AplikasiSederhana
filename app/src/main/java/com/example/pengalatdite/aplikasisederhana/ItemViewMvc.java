package com.example.pengalatdite.aplikasisederhana;

import android.view.View;

public interface ItemViewMvc {
    View getRootView();

    void bindData(DataNews dataNews, String position);
}
