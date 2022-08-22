package com.example.pengalatdite.aplikasisederhana;

public class DataNews {
    public String judulBerita;
    public String namaPenulis;
    public String deskripsiBerita;
    public int gambarBerita;
    public int gambarPenulis;
    public boolean isLiked = false;


    public DataNews(String judulBerita, String namaPenulis, String deskripsiBerita, int gambarBerita, int gambarPenulis) {
        this.deskripsiBerita = deskripsiBerita;
        this.namaPenulis = namaPenulis;
        this.gambarBerita = gambarBerita;
        this.gambarPenulis = gambarPenulis;
        this.judulBerita = judulBerita;
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