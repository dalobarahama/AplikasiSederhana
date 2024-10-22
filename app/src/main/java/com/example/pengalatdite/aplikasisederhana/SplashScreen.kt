package com.example.pengalatdite.aplikasisederhana

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.example.pengalatdite.aplikasisederhana.screen.newslist.MainActivity

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        val gifPlaceholder = findViewById<ImageView>(R.id.gif_placeholder)
        Glide.with(this)
            .asGif()
            .load(R.drawable.news_logo_dynamic)
            .into(gifPlaceholder)

        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }, 3000)
    }
}