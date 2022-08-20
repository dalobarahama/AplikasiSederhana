package com.example.pengalatdite.aplikasisederhana;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private final List<DataNews> listBerita = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recylerView);

        Adapter mAdapter = new Adapter(listBerita);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setAdapter(mAdapter);

        berita();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        startActivity(new Intent(this, ProfileActivity.class));
        return super.onOptionsItemSelected(item);
    }

    private void berita() {
        DataNews dataNews = new DataNews("Lamborghini Aventador Direcall karena Kerusakan Kemudi", "Iron Man", R.drawable.lamborghini, R.drawable.ironman);
        listBerita.add(dataNews);

        dataNews = new DataNews("Twice Bakal Konser di Indonesia 25 Agustus 2018", "Wonder Woman", R.drawable.twice_logo, R.drawable.wonderwoman);
        listBerita.add(dataNews);

        dataNews = new DataNews("Masa Depan Tiki-taka Usai Kepergian Iniesta", "Robinhood", R.drawable.iniesta, R.drawable.robinhood);
        listBerita.add(dataNews);

        dataNews = new DataNews("Roket Jepang Meledak dan Terbakar saat Diluncurkan", "Batman", R.drawable.rocket, R.drawable.batman);
        listBerita.add(dataNews);

        dataNews = new DataNews("Gunung Agung Semburkan Lava Pijar 2 Ribu Meter", "Superman", R.drawable.gunung_agung, R.drawable.superman);
        listBerita.add(dataNews);

    }
}
