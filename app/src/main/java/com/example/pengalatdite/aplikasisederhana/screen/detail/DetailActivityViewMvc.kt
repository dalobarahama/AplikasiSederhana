package com.example.pengalatdite.aplikasisederhana.screen.detail

import android.view.View
import com.example.pengalatdite.aplikasisederhana.data.DataNews
import com.example.pengalatdite.aplikasisederhana.screen.detail.DetailActivityViewMvcImpl.Listener

interface DetailActivityViewMvc {
    fun getRootView(): View
    fun registerListener(listener: Listener)
    fun unregisterListener(listener: Listener)
    fun setCommentList(commentList: List<String>)
    fun bindData(dataNews: DataNews)
}