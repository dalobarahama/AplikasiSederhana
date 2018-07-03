package com.example.pengalatdite.aplikasisederhana;

import android.widget.ImageView;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

public class DataNews {
    public String deskripsiBerita, namaPenulis;
    public int gambarBerita;

    public DataNews(String deskripsiBerita, String namaPenulis, int gambarBerita, int gambarPenulis) {
        this.deskripsiBerita = deskripsiBerita;
        this.namaPenulis = namaPenulis;
        this.gambarBerita = gambarBerita;
        this.gambarPenulis = gambarPenulis;
    }

    public String getDeskripsiBerita() {
        return deskripsiBerita;
    }

    public void setDeskripsiBerita(String deskripsiBerita) {
        this.deskripsiBerita = deskripsiBerita;
    }

    public String getNamaPenulis() {
        return namaPenulis;
    }

    public void setNamaPenulis(String namaPenulis) {
        this.namaPenulis = namaPenulis;
    }

    public int getGambarBerita() {
        return gambarBerita;
    }

    public void setGambarBerita(int gambarBerita) {
        this.gambarBerita = gambarBerita;
    }

    public int getGambarPenulis() {
        return gambarPenulis;
    }

    public void setGambarPenulis(int gambarPenulis) {
        this.gambarPenulis = gambarPenulis;
    }

    public int gambarPenulis;

}