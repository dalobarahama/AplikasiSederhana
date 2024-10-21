package com.example.pengalatdite.aplikasisederhana.screen.newslist.newslistitem;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.pengalatdite.aplikasisederhana.DataNews;
import com.example.pengalatdite.aplikasisederhana.R;
import com.example.pengalatdite.aplikasisederhana.screen.common.BaseViewMvc;

import de.hdodenhof.circleimageview.CircleImageView;

public class ItemViewMvcImpl extends BaseViewMvc implements ItemViewMvc {

    private final TextView deskripsiBerita;
    private final TextView namaPenulis;
    private final CircleImageView gambarPenulis;

    private String position;

    public ItemViewMvcImpl(LayoutInflater inflater, ViewGroup parent) {
        setRootView(inflater.inflate(R.layout.card_view, parent, false));

        deskripsiBerita = findViewById(R.id.deskripsi);
        namaPenulis = findViewById(R.id.authorName);
        gambarPenulis = findViewById(R.id.circleImage);
    }

    public void bindData(DataNews dataNews, String position) {
        this.position = position;
        deskripsiBerita.setText(dataNews.getDeskripsiBerita());
        namaPenulis.setText(dataNews.getNamaPenulis());

        Glide.with(getRootView().getContext())
                .asBitmap()
                .load(dataNews.getGambarBerita())
                .into(gambarPenulis);
    }
}
