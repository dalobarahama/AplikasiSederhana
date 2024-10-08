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
import kotlinx.android.synthetic.main.card_view.view.authorName
import kotlinx.android.synthetic.main.card_view.view.circleImage
import kotlinx.android.synthetic.main.card_view.view.deskripsi
import kotlinx.android.synthetic.main.card_view.view.thumbnail

class Adapter(private val listBerita: List<DataNews>) :
    RecyclerView.Adapter<Adapter.NewsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.card_view, parent, false)
        return NewsViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listBerita.size
    }

    override fun onBindViewHolder(holder: NewsViewHolder, position: Int) {
        val context: Context = holder.itemView.context
        val news: DataNews = listBerita.get(position)

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

    class NewsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var deskripsiBerita: TextView = itemView.deskripsi
        var namaPenulis: TextView = itemView.authorName
        var gambarPenulis: CircleImageView = itemView.circleImage
        var gambarBerita: ImageView = itemView.thumbnail
    }


}

