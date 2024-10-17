package com.example.pengalatdite.aplikasisederhana

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.ImageView
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object {
        const val NEWS_DATA = "newsData"
        const val POSITION = "position"
    }

    private lateinit var adapter: Adapter
    private lateinit var newsData: List<DataNews>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        newsData = DummyData.getData()

        val recyclerView: RecyclerView = findViewById(R.id.recylerView)
        recyclerView.layoutManager =
            LinearLayoutManager(
                this,
                RecyclerView.VERTICAL,
                false
            )

        adapter = Adapter()
        recyclerView.adapter = adapter
        adapter.setOnClickRecyclerAdapter(object : Adapter.OnClickAdapter {
            override fun onItemClicked(news: DataNews, position: Int) {
                resultLauncher.launch(DetailActivity.newIntent(this@MainActivity, news, position))
            }

            override fun onLikesClicked(position: Int) {
                if (!newsData[position].liked) {
                    newsData[position].liked = true
                    newsData[position].likes++
                } else {
                    newsData[position].liked = false
                    newsData[position].likes--
                }
            }
        })

        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        val profilePic = findViewById<ImageView>(R.id.toolbar_profile)

        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayShowTitleEnabled(true)

        profilePic.setOnClickListener {
            startActivity(Intent(this@MainActivity, ProfileActivity::class.java))
        }
    }

    override fun onStart() {
        super.onStart()
        fetchNewsData()
    }

    private fun fetchNewsData() {
        adapter.clearList()
        adapter.setList(newsData)
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

            fetchNewsData()

            Log.d(
                "onLoveImageClicked",
                "position $position, data likes ${data?.likes}, newsData likes ${newsData[position!!].likes}"
            )
        }
    }
}
