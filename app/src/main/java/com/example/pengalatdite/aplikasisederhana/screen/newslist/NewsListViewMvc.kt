package com.example.pengalatdite.aplikasisederhana.screen.newslist

import android.view.View
import com.example.pengalatdite.aplikasisederhana.data.DataNews
import com.example.pengalatdite.aplikasisederhana.screen.newslist.NewsListViewMvcImpl.Listener

interface NewsListViewMvc {
    fun getRootView(): View
    fun bindData(list: List<DataNews>)
    fun registerListener(listener: Listener)
    fun unregisterListener(listener: Listener)
}