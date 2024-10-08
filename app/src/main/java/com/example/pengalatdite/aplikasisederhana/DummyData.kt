package com.example.pengalatdite.aplikasisederhana

object DummyData {
    fun getData(): List<DataNews> {
        return listOf(
            DataNews(
                "Lamborghini Aventador Direcall karena Kerusakan Kemudi",
                "Iron Man",
                R.drawable.lamborghini,
                R.drawable.ironman
            ),
            DataNews(
                "Twice Bakal Konser di Indonesia 25 Agustus 2018",
                "Wonder Woman",
                R.drawable.twice_logo,
                R.drawable.wonderwoman
            ),
            DataNews(
                "Masa Depan Tiki-taka Usai Kepergian Iniesta",
                "Robinhood",
                R.drawable.iniesta,
                R.drawable.robinhood
            ),
            DataNews(
                "Roket Jepang Meledak dan Terbakar saat Diluncurkan",
                "Batman",
                R.drawable.rocket,
                R.drawable.batman
            ),
            DataNews(
                "Gunung Agung Semburkan Lava Pijar 2 Ribu Meter",
                "Superman",
                R.drawable.gunung_agung,
                R.drawable.superman
            )
        )
    }
}