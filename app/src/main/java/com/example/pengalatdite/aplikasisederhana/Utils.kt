package com.example.pengalatdite.aplikasisederhana

import android.content.Context
import android.widget.ImageView
import com.bumptech.glide.Glide

class Utils(private val context: Context) {
    fun loadImage(imageId: Int, imageView: ImageView) {
        Glide.with(context)
            .asBitmap()
            .load(imageId)
            .into(imageView)
    }
}