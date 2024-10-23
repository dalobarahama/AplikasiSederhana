package com.example.pengalatdite.aplikasisederhana.screen.detail

import android.app.Activity
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import android.window.OnBackInvokedDispatcher
import androidx.activity.OnBackPressedCallback
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.content.ContextCompat
import com.example.pengalatdite.aplikasisederhana.R
import com.example.pengalatdite.aplikasisederhana.data.DataNews
import com.example.pengalatdite.aplikasisederhana.screen.newslist.NewsListActivity

class DetailActivity : AppCompatActivity(), DetailActivityViewMvcImpl.Listener {

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

    private lateinit var viewMvc: DetailActivityViewMvc

    private var newsData: DataNews? = null
    private var dataPosition: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        viewMvc = DetailActivityViewMvcImpl(layoutInflater, null)

        setContentView(viewMvc.getRootView())

        newsData = intent.getParcelableExtra(NEWS_DATA)
        dataPosition = intent.getIntExtra(DATA_POSITION, 0)

        setOnBackPressed()
    }

    override fun onStart() {
        super.onStart()
        viewMvc.registerListener(this)
        newsData?.let { viewMvc.bindData(it) }
        newsData?.comments?.let { viewMvc.setCommentList(it) }
    }

    override fun onStop() {
        viewMvc.unregisterListener(this)
        super.onStop()
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

    override fun setToolbar(toolbar: Toolbar) {
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)
        supportActionBar?.setDisplayShowTitleEnabled(false)
        toolbar.navigationIcon?.setTint(ContextCompat.getColor(this, R.color.colorWhite))
    }

    override fun onShareClicked() {
        val shareIntent = Intent().apply {
            action = Intent.ACTION_SEND
            putExtra(Intent.EXTRA_TEXT, newsData?.judulBerita)
            type = "text/plain"
        }

        startActivity(Intent.createChooser(shareIntent, "Share via"))
    }

    override fun onLoveImageClicked(dataNews: DataNews) {
        this.newsData = dataNews
    }

    private fun goBack() {
        val returnIntent = Intent()
        returnIntent.putExtra(NewsListActivity.NEWS_DATA, newsData)
        returnIntent.putExtra(NewsListActivity.POSITION, dataPosition)

        setResult(Activity.RESULT_OK, returnIntent)
        finish()
    }

    // TODO onbackpressed not working on api level 34
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