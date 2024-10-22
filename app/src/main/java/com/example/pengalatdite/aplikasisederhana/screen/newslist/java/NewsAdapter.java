package com.example.pengalatdite.aplikasisederhana.screen.newslist.java;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.pengalatdite.aplikasisederhana.data.DataNews;
import com.example.pengalatdite.aplikasisederhana.screen.newslist.java.newslistitem.ItemViewMvc;
import com.example.pengalatdite.aplikasisederhana.screen.newslist.java.newslistitem.ItemViewMvcImpl;

import java.util.ArrayList;
import java.util.List;

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.NewsViewHolder> {
    private static final String TAG = "RecyclerViewAdapter";
    private List<DataNews> listBerita;

    public static class NewsViewHolder extends RecyclerView.ViewHolder {

        private final ItemViewMvc itemViewMvc;

        public NewsViewHolder(ItemViewMvc viewMvc) {
            super(viewMvc.getRootView());
            itemViewMvc = viewMvc;
        }
    }

    public void bindNews(List<DataNews> listBerita) {
        this.listBerita = new ArrayList<>(listBerita);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public NewsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemViewMvc viewMvc = new ItemViewMvcImpl(LayoutInflater.from(parent.getContext()), parent);
        return new NewsViewHolder(viewMvc);
    }

    @Override
    public void onBindViewHolder(@NonNull NewsViewHolder holder, int position) {
        Log.d(TAG, "onBindViewHolder: called");
        holder.itemViewMvc.bindData(listBerita.get(position), String.valueOf(position));
    }

    @Override
    public int getItemCount() {
        return listBerita.size();
    }

}
