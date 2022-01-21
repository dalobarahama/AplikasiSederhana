package com.example.pengalatdite.aplikasisederhana;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import de.hdodenhof.circleimageview.CircleImageView;

public class ItemViewMvcImpl implements ItemViewMvc {

    private View rootView;

    private final TextView deskripsiBerita;
    private final TextView namaPenulis;
    private final ImageView gambarBerita;
    private final CircleImageView gambarPenulis;

    private String position;

    public ItemViewMvcImpl(LayoutInflater inflater, ViewGroup parent) {
        setRootView(inflater.inflate(R.layout.card_view, parent, false));

        deskripsiBerita = findViewById(R.id.deskripsi);
        namaPenulis = findViewById(R.id.authorName);
        gambarBerita = findViewById(R.id.thumbnail);
        gambarPenulis = findViewById(R.id.circleImage);
    }

    @Override
    public View getRootView() {
        return rootView;
    }

    protected void setRootView(View rootView) {
        this.rootView = rootView;
    }

    protected <T extends View> T findViewById(int id) {
        return getRootView().findViewById(id);
    }

    @Override
    public void bindData(DataNews dataNews, String position) {
        this.position = position;
        deskripsiBerita.setText(dataNews.getDeskripsiBerita());
        namaPenulis.setText(dataNews.getNamaPenulis());

        Glide.with(getRootView().getContext())
                .asBitmap()
                .load(dataNews.getGambarBerita())
                .into(gambarBerita);

        Glide.with(getRootView().getContext())
                .asBitmap()
                .load(dataNews.getGambarBerita())
                .into(gambarPenulis);
    }
}
