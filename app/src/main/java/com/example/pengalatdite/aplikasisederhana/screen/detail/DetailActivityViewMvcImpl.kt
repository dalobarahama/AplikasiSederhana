package com.example.pengalatdite.aplikasisederhana.screen.detail

import android.os.Build
import android.text.Html
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.pengalatdite.aplikasisederhana.R
import com.example.pengalatdite.aplikasisederhana.Utils
import com.example.pengalatdite.aplikasisederhana.data.DataNews
import com.google.android.material.appbar.CollapsingToolbarLayout

class DetailActivityViewMvcImpl(layoutInflater: LayoutInflater, parent: ViewGroup?) :
    DetailActivityViewMvc {

    interface Listener {
        fun setToolbar(toolbar: Toolbar)
        fun onShareClicked()
        fun onLoveImageClicked(dataNews: DataNews)
    }

    private val listeners = HashSet<Listener>()

    private val rootView = layoutInflater.inflate(R.layout.activity_detail, parent, false)

    private val utils = Utils(getRootView().context)

    private val toolbar: Toolbar
    private val collapsingToolbar: CollapsingToolbarLayout
    private val bannerImage: ImageView
    private val loveImage: ImageView
    private val newsDescription: TextView
    private val totalLikes: TextView
    private val totalComments: TextView
    private val categories: TextView
    private val rvComments: RecyclerView
    private val authorPicture: ImageView
    private val authorName: TextView
    private val dateTime: TextView
    private val actionShare: ImageView

    private var commentsAdapter: CommentsAdapter

    private lateinit var dataNews: DataNews

    init {
        toolbar = findViewById(R.id.toolbar)
        collapsingToolbar = findViewById(R.id.collapsing_toolbar)
        bannerImage = findViewById(R.id.bannerImage)
        loveImage = findViewById(R.id.loveImage)
        newsDescription = findViewById(R.id.newsDescription)
        totalLikes = findViewById(R.id.totalLikes)
        totalComments = findViewById(R.id.totalComments)
        categories = findViewById(R.id.news_categories)
        rvComments = findViewById(R.id.rv_comments)
        authorPicture = findViewById(R.id.circleImage)
        authorName = findViewById(R.id.authorName)
        dateTime = findViewById(R.id.dateTime)
        actionShare = findViewById(R.id.action_share)

        rvComments.layoutManager = LinearLayoutManager(
            getRootView().context,
            RecyclerView.VERTICAL,
            false
        )
        commentsAdapter = CommentsAdapter()
        rvComments.adapter = commentsAdapter

        actionShare.setOnClickListener {
            getListener()?.onShareClicked()
        }

        loveImage.setOnClickListener {
            if (!dataNews.liked) {
                dataNews.likes++
                dataNews.liked = true

                totalLikes.text = dataNews.likes.toString()
                utils.loadImage(R.drawable.heart, loveImage)
            } else {
                dataNews.likes--
                dataNews.liked = false

                totalLikes.text = dataNews.likes.toString()
                utils.loadImage(R.drawable.heart_outline, loveImage)
            }

            getListener()?.onLoveImageClicked(dataNews)
        }
    }

    override fun getRootView(): View {
        return rootView
    }

    override fun registerListener(listener: Listener) {
        listeners.add(listener)
    }

    override fun unregisterListener(listener: Listener) {
        listeners.remove(listener)
    }

    override fun setCommentList(commentList: List<String>) {
        commentsAdapter.setList(commentList)
    }

    override fun bindData(dataNews: DataNews) {
        this.dataNews = dataNews

        collapsingToolbar.title = dataNews.judulBerita
        authorName.text = dataNews.namaPenulis
        dateTime.text = dataNews.dateTime
        totalLikes.text = dataNews.likes.toString()
        totalComments.text = dataNews.comments?.size.toString()
        newsDescription.text = setDescription(dataNews)
        categories.text = setCategories(dataNews)

        utils.loadImage(setLoveImage(dataNews), loveImage)
        utils.loadImage(dataNews.gambarBerita, bannerImage)
        utils.loadImage(dataNews.gambarPenulis, authorPicture)

        getListener()?.setToolbar(toolbar)
    }

    private fun setCategories(dataNews: DataNews): String {
        val sbCategories: StringBuilder = StringBuilder()
        dataNews.categories.forEachIndexed { index, string ->
            if (index < dataNews.categories.size.minus(1)) {
                sbCategories.append(string).append(", ")
            } else {
                sbCategories.append(string)
            }
        }

        return sbCategories.toString()
    }

    private fun setLoveImage(dataNews: DataNews): Int {
        return if (!dataNews.liked) {
            R.drawable.heart_outline
        } else {
            R.drawable.heart
        }
    }

    private fun setDescription(dataNews: DataNews): CharSequence? =
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            Html.fromHtml(dataNews.deskripsiBerita, Html.FROM_HTML_MODE_COMPACT)
        } else {
            Html.fromHtml(dataNews.deskripsiBerita)
        }

    private fun <T : View> findViewById(id: Int): T {
        return getRootView().findViewById(id)
    }

    private fun getListener(): Listener? {
        var listener: Listener? = null
        for (itemListener in listeners) {
            listener = itemListener
        }
        return listener
    }
}