package com.example.pengalatdite.aplikasisederhana.screen.detail

import android.app.Activity
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.text.Html
import android.view.MenuItem
import android.widget.ImageView
import android.widget.TextView
import android.window.OnBackInvokedDispatcher
import androidx.activity.OnBackPressedCallback
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.pengalatdite.aplikasisederhana.R
import com.example.pengalatdite.aplikasisederhana.Utils
import com.example.pengalatdite.aplikasisederhana.data.DataNews
import com.example.pengalatdite.aplikasisederhana.screen.newslist.MainActivity
import com.google.android.material.appbar.CollapsingToolbarLayout

class DetailActivity : AppCompatActivity() {

    companion object {
        private const val NEWS_DATA = "newsData"
        private const val DATA_POSITION = "dataPosition"

        fun newIntent(activity: Activity, news: DataNews, position: Int): Intent {
            val intent = Intent(activity, DetailActivity::class.java)
            intent.putExtra(NEWS_DATA, news)
            intent.putExtra(DATA_POSITION, position)

            return intent
        }
    }

    private var newsData: DataNews? = null
    private var dataPosition: Int = 0

    private lateinit var utils: Utils

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        newsData = intent.getParcelableExtra(NEWS_DATA)
        dataPosition = intent.getIntExtra(DATA_POSITION, 0)

        utils = Utils(this)

        val sbCategories: StringBuilder = StringBuilder()

        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        val collapsingToolbar = findViewById<CollapsingToolbarLayout>(R.id.collapsing_toolbar)
        val bannerImage = findViewById<ImageView>(R.id.bannerImage)
        val loveImage = findViewById<ImageView>(R.id.loveImage)
        val newsDescription = findViewById<TextView>(R.id.newsDescription)
        val totalLikes = findViewById<TextView>(R.id.totalLikes)
        val totalComments = findViewById<TextView>(R.id.totalComments)
        val categories = findViewById<TextView>(R.id.news_categories)
        val rvComments = findViewById<RecyclerView>(R.id.rv_comments)
        val authorPicture = findViewById<ImageView>(R.id.circleImage)
        val authorName = findViewById<TextView>(R.id.authorName)
        val dateTime = findViewById<TextView>(R.id.dateTime)
        val actionShare = findViewById<ImageView>(R.id.action_share)

        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)
        supportActionBar?.setDisplayShowTitleEnabled(false)
        toolbar.navigationIcon?.setTint(ContextCompat.getColor(this, R.color.colorWhite))
        collapsingToolbar.title = newsData?.judulBerita

        authorName.text = newsData?.namaPenulis
        dateTime.text = newsData?.dateTime
        totalLikes.text = newsData?.likes.toString()
        totalComments.text = newsData?.comments?.size.toString()
        newsDescription.text =
            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                Html.fromHtml(newsData?.deskripsiBerita, Html.FROM_HTML_MODE_COMPACT)
            } else {
                Html.fromHtml(newsData?.deskripsiBerita)
            }

        if (!newsData!!.liked) {
            utils.loadImage(R.drawable.heart_outline, loveImage)
        } else {
            utils.loadImage(R.drawable.heart, loveImage)
        }

        utils.loadImage(newsData!!.gambarBerita, bannerImage)
        utils.loadImage(newsData!!.gambarPenulis, authorPicture)

        newsData?.categories?.forEachIndexed { index, string ->
            if (index < (newsData?.categories?.size?.minus(1) ?: 0)) {
                sbCategories.append(string).append(", ")
            } else {
                sbCategories.append(string)
            }
        }
        categories.text = sbCategories

        rvComments.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        val adapter = CommentsAdapter()
        rvComments.adapter = adapter
        adapter.setList(newsData!!.comments!!)

        loveImage.setOnClickListener {
            if (!newsData!!.liked) {
                newsData!!.likes++
                newsData!!.liked = true
                totalLikes.text = newsData!!.likes.toString()

                utils.loadImage(R.drawable.heart, loveImage)
            } else {
                newsData!!.likes--
                newsData!!.liked = false
                totalLikes.text = newsData!!.likes.toString()

                utils.loadImage(R.drawable.heart_outline, loveImage)
            }
        }

        actionShare.setOnClickListener {
            val shareIntent = Intent().apply {
                action = Intent.ACTION_SEND
                putExtra(Intent.EXTRA_TEXT, newsData?.judulBerita)
                type = "text/plain"
            }

            startActivity(Intent.createChooser(shareIntent, "Share via"))
        }

        setOnBackPressed()
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            android.R.id.home -> {
                goBack()
                true
            }

            else -> super.onOptionsItemSelected(item)
        }
    }

    private fun goBack() {
        val returnIntent = Intent()
        returnIntent.putExtra(MainActivity.NEWS_DATA, newsData)
        returnIntent.putExtra(MainActivity.POSITION, dataPosition)

        setResult(Activity.RESULT_OK, returnIntent)
        finish()
    }

    private fun setOnBackPressed() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            onBackInvokedDispatcher.registerOnBackInvokedCallback(
                OnBackInvokedDispatcher.PRIORITY_DEFAULT
            ) {
                goBack()
            }
        } else {
            onBackPressedDispatcher.addCallback(this, object : OnBackPressedCallback(true) {
                override fun handleOnBackPressed() {
                    goBack()
                }
            })
        }
    }

}