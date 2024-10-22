package com.example.pengalatdite.aplikasisederhana.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
class DataNews(
    var judulBerita: String,
    var deskripsiBerita: String,
    var namaPenulis: String,
    var gambarBerita: Int,
    var gambarPenulis: Int,
    var dateTime: String,
    var likes: Int = 0,
    var comments: List<String>? = null,
    var categories: List<String>,
    var liked: Boolean = false,
) : Parcelable

/**
 * https://id.pinterest.com/pin/296956169191471520/
 * https://id.pinterest.com/pin/20266267063390212/
 * https://id.pinterest.com/pin/593067844707759835/
 * https://id.pinterest.com/pin/523965737910945211/
 */