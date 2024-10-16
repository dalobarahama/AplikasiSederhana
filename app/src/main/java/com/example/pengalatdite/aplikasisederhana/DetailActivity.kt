package com.example.pengalatdite.aplikasisederhana

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.text.Html
import android.util.Log
import android.view.MenuItem
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.content.ContextCompat
import com.bumptech.glide.Glide

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

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        newsData = intent.getParcelableExtra(NEWS_DATA)
        dataPosition = intent.getIntExtra(DATA_POSITION, 0)

        val sbCategories: StringBuilder = StringBuilder()

        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        val bannerImage = findViewById<ImageView>(R.id.bannerImage)
        val loveImage = findViewById<ImageView>(R.id.loveImage)
        val newsDescription = findViewById<TextView>(R.id.newsDescription)
        val totalLikes = findViewById<TextView>(R.id.totalLikes)
        val totalComments = findViewById<TextView>(R.id.totalComments)
        val categories = findViewById<TextView>(R.id.news_categories)

        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)
        supportActionBar?.setDisplayShowTitleEnabled(false)
        toolbar.navigationIcon?.setTint(ContextCompat.getColor(this, R.color.colorWhite))

        totalLikes.text = newsData?.likes.toString()
        totalComments.text = newsData?.comments?.size.toString()
        newsDescription.text =
            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                Html.fromHtml(newsData?.deskripsiBerita, Html.FROM_HTML_MODE_COMPACT)
            } else {
                Html.fromHtml(newsData?.deskripsiBerita)
            }
        if (!newsData!!.liked) {
            Glide.with(this)
                .asBitmap()
                .load(R.drawable.heart_outline)
                .into(loveImage)
        } else {
            Glide.with(this)
                .asBitmap()
                .load(R.drawable.heart)
                .into(loveImage)
        }
        Glide.with(this)
            .asBitmap()
            .load(newsData!!.gambarBerita)
            .into(bannerImage)

        for (category in newsData!!.categories) {
            sbCategories.append(category).append(", ")
        }
        categories.text = sbCategories

        loveImage.setOnClickListener {
            if (!newsData!!.liked) {
                newsData!!.likes++
                newsData!!.liked = true
                totalLikes.text = newsData!!.likes.toString()

                Glide.with(this)
                    .asBitmap()
                    .load(R.drawable.heart)
                    .into(loveImage)
            } else {
                newsData!!.likes--
                newsData!!.liked = false
                totalLikes.text = newsData!!.likes.toString()

                Glide.with(this)
                    .asBitmap()
                    .load(R.drawable.heart_outline)
                    .into(loveImage)
            }
            Log.d("onLoveImageClicked", "clicked")
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            android.R.id.home -> {
                val returnIntent = Intent()
                returnIntent.putExtra(MainActivity.NEWS_DATA, newsData)
                returnIntent.putExtra(MainActivity.POSITION, dataPosition)

                setResult(Activity.RESULT_OK, returnIntent)
                finish()

                true
            }

            else -> super.onOptionsItemSelected(item)
        }
    }
}