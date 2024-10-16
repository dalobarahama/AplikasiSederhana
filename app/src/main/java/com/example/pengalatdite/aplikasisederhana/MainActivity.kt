package com.example.pengalatdite.aplikasisederhana

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity(), DetailActivity.Listener {

    private lateinit var adapter: Adapter
    private lateinit var newsData: List<DataNews>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val detailActivity = DetailActivity()
        detailActivity.setListener(this)

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
                DetailActivity.newIntent(this@MainActivity, news, position)
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
    }

    override fun onStart() {
        super.onStart()
        adapter.setList(newsData)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.profile -> {
                startActivity(Intent(this@MainActivity, ProfileActivity::class.java))
                true
            }

            else -> super.onOptionsItemSelected(item)
        }
    }

    override fun onLoveImageClicked(dataPosition: Int) {
        Toast.makeText(this, "Position $dataPosition", Toast.LENGTH_SHORT).show()
    }
}
