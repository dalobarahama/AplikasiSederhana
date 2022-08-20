package com.example.pengalatdite.aplikasisederhana;

import android.widget.ImageView;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

public class DataNews {
    public String deskripsiBerita, namaPenulis;
    public int gambarBerita;
    public int gambarPenulis;
    public  boolean isLiked = false;


    public DataNews(String deskripsiBerita, String namaPenulis, int gambarBerita, int gambarPenulis) {
        this.deskripsiBerita = deskripsiBerita;
        this.namaPenulis = namaPenulis;
        this.gambarBerita = gambarBerita;
        this.gambarPenulis = gambarPenulis;
    }

    public boolean isLiked() {
        return isLiked;
    }

    public void setLiked(boolean liked) {
        isLiked = liked;
    }

    public String getDeskripsiBerita() {
        return deskripsiBerita;
    }

    public String getNamaPenulis() {
        return namaPenulis;
    }

    public int getGambarBerita() {
        return gambarBerita;
    }

    public int getGambarPenulis() {
        return gambarPenulis;
    }

}