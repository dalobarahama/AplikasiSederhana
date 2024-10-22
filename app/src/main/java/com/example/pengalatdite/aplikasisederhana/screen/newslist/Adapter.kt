package com.example.pengalatdite.aplikasisederhana.screen.newslist

import android.content.Context
import android.text.Html
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.pengalatdite.aplikasisederhana.R
import com.example.pengalatdite.aplikasisederhana.Utils
import com.example.pengalatdite.aplikasisederhana.data.DataNews
import de.hdodenhof.circleimageview.CircleImageView

class Adapter : RecyclerView.Adapter<Adapter.NewsViewHolder>() {

    class NewsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var judulBerita: TextView = itemView.findViewById(R.id.judul)
        var deskripsiBerita: TextView = itemView.findViewById(R.id.deskripsi)
        var namaPenulis: TextView = itemView.findViewById(R.id.authorName)
        var gambarPenulis: CircleImageView = itemView.findViewById(R.id.circleImage)
        var totalLikes: TextView = itemView.findViewById(R.id.totalLikes)
        var totalCommets: TextView = itemView.findViewById(R.id.totalComments)
        var dateTimes: TextView = itemView.findViewById(R.id.dateTime)
        var spacer: View = itemView.findViewById(R.id.lineSpacer)
        var likesImage: ImageView = itemView.findViewById(R.id.loveImage)
    }

    private var listBerita: List<DataNews> = emptyList()
    private lateinit var onClickAdapter: OnClickAdapter

    fun setList(list: List<DataNews>) {
        this.listBerita = list
        notifyDataSetChanged()
    }

    fun clearList() {
        listBerita = emptyList()
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
        val totalComments = if (news.comments != null) {
            news.comments!!.size
        } else {
            0
        }

        Glide.with(context)
            .asBitmap()
            .load(news.gambarPenulis)
            .into(holder.gambarPenulis)

        holder.judulBerita.text = news.judulBerita
        holder.deskripsiBerita.text =
            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                Html.fromHtml(news.deskripsiBerita, Html.FROM_HTML_MODE_COMPACT)
            } else {
                Html.fromHtml(news.deskripsiBerita)
            }
        holder.namaPenulis.text = news.namaPenulis
        holder.totalLikes.text = news.likes.toString()
        holder.totalCommets.text = totalComments.toString()
        holder.dateTimes.text = news.dateTime

        if (position == listBerita.size - 1) {
            holder.spacer.visibility = View.INVISIBLE
        } else {
            holder.spacer.visibility = View.VISIBLE
        }

        if (!news.liked) {
            Utils(context).loadImage(R.drawable.heart_outline, holder.likesImage)
        } else {
            Utils(context).loadImage(R.drawable.heart, holder.likesImage)
        }

        holder.itemView.setOnClickListener {
            onClickAdapter.onItemClicked(news, position)
        }
        holder.likesImage.setOnClickListener {
            onClickAdapter.onLikesClicked(position)
            notifyDataSetChanged()
        }
    }

    fun setOnClickRecyclerAdapter(onClickAdapter: OnClickAdapter) {
        this.onClickAdapter = onClickAdapter
    }

    interface OnClickAdapter {
        fun onItemClicked(news: DataNews, position: Int)
        fun onLikesClicked(position: Int)
    }
}

