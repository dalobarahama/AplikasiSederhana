package com.example.pengalatdite.aplikasisederhana.screen.newslist

import android.content.Intent
import android.os.Bundle
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.example.pengalatdite.aplikasisederhana.data.DataNews
import com.example.pengalatdite.aplikasisederhana.data.DummyData
import com.example.pengalatdite.aplikasisederhana.screen.detail.DetailActivity
import com.example.pengalatdite.aplikasisederhana.screen.profile.ProfileActivity

class MainActivity : AppCompatActivity(), NewsListViewMvcImpl.Listener {

    companion object {
        const val NEWS_DATA = "newsData"
        const val POSITION = "position"
    }

    private lateinit var viewMvc: NewsListViewMvc

    private lateinit var newsData: List<DataNews>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        viewMvc = NewsListViewMvcImpl(layoutInflater, null)

        newsData = DummyData.getData()

        setContentView(viewMvc.getRootView())
    }

    override fun onStart() {
        super.onStart()
        viewMvc.registerListener(this)
        viewMvc.setNewsData(newsData)
    }

    override fun onStop() {
        viewMvc.unregisterListener(this)
        super.onStop()
    }

    override fun onItemAdapterClicked(news: DataNews, position: Int) {
        resultLauncher.launch(DetailActivity.newIntent(this@MainActivity, news, position))
    }

    override fun onLikesAdapterClicked(position: Int) {
        if (!newsData[position].liked) {
            newsData[position].liked = true
            newsData[position].likes++
        } else {
            newsData[position].liked = false
            newsData[position].likes--
        }
    }

    override fun onProfilePicClicked() {
        startActivity(Intent(this@MainActivity, ProfileActivity::class.java))
    }

    override fun setToolbar(toolbar: Toolbar) {
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayShowTitleEnabled(true)
    }

    private val resultLauncher = registerForActivityResult(
        ActivityResultContracts.StartActivityForResult()
    ) { result ->
        if (result.resultCode == RESULT_OK) {
            val dataResult = result.data
            val data: DataNews? = dataResult?.getParcelableExtra(NEWS_DATA)
            val position = dataResult?.getIntExtra(POSITION, 0)

            newsData = newsData.mapIndexed { index, dataNews ->
                (if (index == position) data else dataNews)!!
            }

            viewMvc.setNewsData(newsData)
        }
    }


}
