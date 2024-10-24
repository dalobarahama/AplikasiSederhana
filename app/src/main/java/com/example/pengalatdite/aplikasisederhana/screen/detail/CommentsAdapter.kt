package com.example.pengalatdite.aplikasisederhana.screen.detail

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.pengalatdite.aplikasisederhana.R
import com.example.pengalatdite.aplikasisederhana.data.DummyData

class CommentsAdapter : RecyclerView.Adapter<CommentsAdapter.CommentViewHolder>() {

    class CommentViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val name: TextView = itemView.findViewById(R.id.authorName)
        val comment: TextView = itemView.findViewById(R.id.comment)
    }

    private var comments: List<String> = emptyList()

    fun setList(comments: List<String>) {
        this.comments = comments
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CommentViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.comments_card_view, parent, false)
        return CommentViewHolder(view)
    }

    override fun getItemCount(): Int {
        return comments.size
    }

    override fun onBindViewHolder(holder: CommentViewHolder, position: Int) {
        val comment = comments[position]

        holder.name.text = DummyData.generateRandomName()
        holder.comment.text = comment
    }
}