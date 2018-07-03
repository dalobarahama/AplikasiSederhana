package com.example.pengalatdite.aplikasisederhana;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.time.LocalDate;
import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class Adapter extends RecyclerView.Adapter<Adapter.NewsViewHolder> {
    private static final String TAG = "RecyclerViewAdapter";
    private List<DataNews> listBerita;

    public Adapter(List<DataNews> listBerita) {
        this.listBerita = listBerita;
    }

    @NonNull
    @Override
    public NewsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view, parent, false);
        return new NewsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NewsViewHolder holder, int position) {
        Log.d(TAG, "onBindViewHolder: called");
        final Context context = holder.itemView.getContext();
        final DataNews news = listBerita.get(position);

        Glide.with(context)
                .asBitmap()
                .load(news.getGambarBerita())
                .into(holder.gambarBerita);

        Glide.with(context)
                .asBitmap()
                .load(news.getGambarPenulis())
                .into(holder.gambarPenulis);

        holder.namaPenulis.setText(news.getNamaPenulis());
        holder.deskripsiBerita.setText(news.getDeskripsiBerita());

    }

    @Override
    public int getItemCount() {
        return listBerita.size();
    }

    public class NewsViewHolder extends RecyclerView.ViewHolder {
        public TextView deskripsiBerita, namaPenulis;
        public CircleImageView gambarPenulis;
        public ImageView gambarBerita;

        public NewsViewHolder(View itemView) {
            super(itemView);
            deskripsiBerita = itemView.findViewById(R.id.deskripsi);
            namaPenulis = itemView.findViewById(R.id.authorName);
            gambarPenulis = itemView.findViewById(R.id.circleImage);
            gambarBerita = itemView.findViewById(R.id.thumbnail);
        }
    }
}
