package com.example.pengalatdite.aplikasisederhana;

import android.view.View;

public interface ItemViewMvc extends ViewMvc {
    View getRootView();

    void bindData(DataNews dataNews, String position);
}
