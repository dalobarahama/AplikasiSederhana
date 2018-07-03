package com.example.pengalatdite.aplikasisederhana

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView : RecyclerView = findViewById(R.id.recylerView)
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)

        val dataNews = ArrayList<DataNews>()
        dataNews.add(DataNews("Lamborghini Aventador Direcall karena Kerusakan Kemudi", "Iron Man", R.drawable.lamborghini, R.drawable.ironman))
        dataNews.add(DataNews("Twice Bakal Konser di Indonesia 25 Agustus 2018", "Wonder Woman", R.drawable.twice_logo, R.drawable.wonderwoman))
        dataNews.add(DataNews("Masa Depan Tiki-taka Usai Kepergian Iniesta", "Robinhood", R.drawable.iniesta, R.drawable.robinhood))
        dataNews.add(DataNews("Roket Jepang Meledak dan Terbakar saat Diluncurkan", "Batman", R.drawable.rocket, R.drawable.batman))
        dataNews.add(DataNews("Gunung Agung Semburkan Lava Pijar 2 Ribu Meter", "Superman", R.drawable.gunung_agung, R.drawable.superman))

        var adapter = Adapter(dataNews)
        recyclerView.adapter = adapter

    }
}
