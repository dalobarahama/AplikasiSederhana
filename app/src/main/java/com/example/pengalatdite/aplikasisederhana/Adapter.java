package com.example.pengalatdite.aplikasisederhana;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class Adapter extends RecyclerView.Adapter<Adapter.NewsViewHolder> {
    private static final String TAG = "RecyclerViewAdapter";
    private final List<DataNews> listBerita;

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
        holder.loveButton.setOnClickListener(view -> {
            if (!news.isLiked()) {
                Glide.with(context)
                        .asBitmap()
                        .load(R.drawable.heart)
                        .into(holder.loveButton);
                news.setLiked(true);
            } else {
                Glide.with(context)
                        .asBitmap()
                        .load(R.drawable.heart_outline)
                        .into(holder.loveButton);
                news.setLiked(false);
            }
        });

        holder.itemView.setOnClickListener(view -> Toast.makeText(holder.itemView.getContext(), "Clicked", Toast.LENGTH_SHORT).show());

    }

    @Override
    public int getItemCount() {
        return listBerita.size();
    }

    public static class NewsViewHolder extends RecyclerView.ViewHolder {

        public TextView deskripsiBerita;
        public TextView namaPenulis;
        public CircleImageView gambarPenulis;
        public ImageView gambarBerita;
        public ImageView loveButton;

        public NewsViewHolder(View itemView) {
            super(itemView);
            deskripsiBerita = itemView.findViewById(R.id.deskripsi);
            namaPenulis = itemView.findViewById(R.id.authorName);
            gambarPenulis = itemView.findViewById(R.id.circleImage);
            gambarBerita = itemView.findViewById(R.id.thumbnail);
            loveButton = itemView.findViewById(R.id.loveImage);
        }

    }

    private void loveButtonClicked(Context context, NewsViewHolder holder, int position) {

    }
}
