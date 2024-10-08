package com.example.pengalatdite.aplikasisederhana

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import de.hdodenhof.circleimageview.CircleImageView

class Adapter(private val listBerita: List<DataNews>) :
    RecyclerView.Adapter<Adapter.NewsViewHolder>() {

    class NewsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var deskripsiBerita: TextView = itemView.findViewById(R.id.deskripsi)
        var namaPenulis: TextView = itemView.findViewById(R.id.authorName)
        var gambarPenulis: CircleImageView = itemView.findViewById(R.id.circleImage)
        var gambarBerita: ImageView = itemView.findViewById(R.id.thumbnail)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.card_view, parent, false)
        return NewsViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listBerita.size
    }

    override fun onBindViewHolder(holder: NewsViewHolder, position: Int) {
        val context: Context = holder.itemView.context
        val news: DataNews = listBerita[position]

        Glide.with(context)
            .asBitmap()
            .load(news.gambarBerita)
            .into(holder.gambarBerita)

        Glide.with(context)
            .asBitmap()
            .load(news.gambarPenulis)
            .into(holder.gambarPenulis)

        holder.deskripsiBerita.text = news.deskripsiBerita
        holder.namaPenulis.text = news.namaPenulis
    }
}

