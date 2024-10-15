package com.example.pengalatdite.aplikasisederhana

object DummyData {
    fun getData(): List<DataNews> {
        return listOf(
            DataNews(
                deskripsiBerita = "New Tech Advancements in 2024",
                namaPenulis = "John Doe",
                gambarBerita = R.drawable.tech_news_image,
                gambarPenulis = R.drawable.author_john_doe,
                dateTime = "2024-10-03 08:30",
                likes = 120,
                comments = listOf("Great article!", "Very informative.", "Loved this post!"),
                categories = listOf("Technology", "Science")
            ),
            DataNews(
                deskripsiBerita = "Breaking News: Market Hits Record High",
                namaPenulis = "Jane Smith",
                gambarBerita = R.drawable.market_news_image,
                gambarPenulis = R.drawable.author_jane_smith,
                dateTime = "2024-10-01 12:45",
                likes = 200,
                comments = listOf("Amazing!", "Wow, this is big news."),
                categories = listOf("Finance", "Stock Market")
            ),
            DataNews(
                deskripsiBerita = "Climate Change: What You Need to Know",
                namaPenulis = "Alex Johnson",
                gambarBerita = R.drawable.climate_news_image,
                gambarPenulis = R.drawable.author_alex_johnson,
                dateTime = "2024-09-29 14:20",
                likes = 340,
                comments = listOf("This is worrying.", "We need to take action."),
                categories = listOf("Environment", "Global Warming")
            ),
            DataNews(
                deskripsiBerita = "Top 10 Travel Destinations for 2024",
                namaPenulis = "Emily Brown",
                gambarBerita = R.drawable.travel_news_image,
                gambarPenulis = R.drawable.author_emily_brown,
                dateTime = "2024-09-27 10:15",
                likes = 450,
                comments = listOf("Can't wait to visit these places!", "Great recommendations."),
                categories = listOf("Travel", "Lifestyle")
            ),
            DataNews(
                deskripsiBerita = "AI Revolution: Impact on Future Jobs",
                namaPenulis = "Michael Green",
                gambarBerita = R.drawable.ai_news_image,
                gambarPenulis = R.drawable.author_michael_green,
                dateTime = "2024-10-03 15:00",
                likes = 175,
                comments = listOf("AI is the future!", "Scary but exciting."),
                categories = listOf("Technology", "Jobs")
            ),
            DataNews(
                deskripsiBerita = "New Discoveries in Space Exploration",
                namaPenulis = "Sarah White",
                gambarBerita = R.drawable.space_news_image,
                gambarPenulis = R.drawable.author_sarah_white,
                dateTime = "2024-09-22 09:30",
                likes = 220,
                comments = listOf("Incredible!", "The universe is so vast."),
                categories = listOf("Science", "Space")
            ),
            DataNews(
                deskripsiBerita = "Health Benefits of a Plant-Based Diet",
                namaPenulis = "Laura Martinez",
                gambarBerita = R.drawable.health_news_image,
                gambarPenulis = R.drawable.author_laura_martinez,
                dateTime = "2024-10-01 11:00",
                likes = 300,
                comments = listOf("I'm switching to a plant-based diet!", "Great health tips."),
                categories = listOf("Health", "Nutrition")
            ),
            DataNews(
                deskripsiBerita = "New Trends in Fashion for 2024",
                namaPenulis = "David Clark",
                gambarBerita = R.drawable.fashion_news_image,
                gambarPenulis = R.drawable.author_david_clark,
                dateTime = "2024-09-28 16:30",
                likes = 140,
                comments = listOf("Love these trends!", "Fashion is always evolving."),
                categories = listOf("Fashion", "Lifestyle")
            ),
            DataNews(
                deskripsiBerita = "How to Save Money in a Tough Economy",
                namaPenulis = "Chris Lewis",
                gambarBerita = R.drawable.economy_news_image,
                gambarPenulis = R.drawable.author_chris_lewis,
                dateTime = "2024-09-30 13:15",
                likes = 280,
                comments = listOf("Very useful tips!", "I needed this."),
                categories = listOf("Finance", "Economy")
            ),
            DataNews(
                deskripsiBerita = "Top 5 Gadgets to Look Out for in 2024",
                namaPenulis = "Jessica Brown",
                gambarBerita = R.drawable.gadgets_news_image,
                gambarPenulis = R.drawable.author_jessica_brown,
                dateTime = "2024-10-02 14:00",
                likes = 320,
                comments = listOf("Can't wait to get these!", "Tech is amazing!"),
                categories = listOf("Technology", "Gadgets")
            )
        )

    }
}