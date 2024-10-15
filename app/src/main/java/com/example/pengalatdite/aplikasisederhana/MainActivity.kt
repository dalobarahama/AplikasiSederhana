package com.example.pengalatdite.aplikasisederhana

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val newsData = DummyData.getData()

        val recyclerView: RecyclerView = findViewById(R.id.recylerView)
        recyclerView.layoutManager =
            LinearLayoutManager(
                this,
                RecyclerView.VERTICAL,
                false
            )

        val adapter = Adapter()
        adapter.setList(newsData)
        recyclerView.adapter = adapter
        adapter.setOnClickRecyclerAdapter(object : Adapter.OnClickAdapter {
            override fun onItemClicked() {
                DetailActivity.newIntent(this@MainActivity)
            }

            override fun onLikesClicked(position: Int) {
                if (!newsData[position].liked) {
                    newsData[position].liked = true
                    newsData[position].likes++
                } else {
                    newsData[position].liked = false
                    newsData[position].likes--
                }

                adapter.clearList()
                adapter.setList(newsData)
            }
        })
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
}
