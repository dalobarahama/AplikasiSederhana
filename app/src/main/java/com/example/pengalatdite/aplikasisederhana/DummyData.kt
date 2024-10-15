package com.example.pengalatdite.aplikasisederhana

import kotlin.random.Random

object DummyData {
    fun getData(): List<DataNews> {
        return listOf(
            DataNews(
                judulBerita = "New Tech Advancements in 2024",
                deskripsiBerita = "The year 2024 marks a monumental shift in the world of technology. Groundbreaking innovations in artificial intelligence (AI) and machine learning (ML) are revolutionizing industries from healthcare to transportation. AI-driven systems are now capable of performing tasks once thought impossible, such as diagnosing complex diseases, piloting autonomous vehicles, and even creating original works of art. These advancements are not only boosting efficiency but are also opening doors to a future where technology seamlessly integrates into every aspect of daily life.\\n\\nHowever, these innovations also come with challenges. As AI systems become more autonomous, concerns about data privacy, job displacement, and ethical implications have intensified. The race to regulate AI is becoming urgent, with governments and corporations debating how to ensure these technologies benefit humanity while mitigating risks. 2024 is shaping up to be a pivotal year in the tech industry, with far-reaching consequences that will shape our world for decades to come.",
                namaPenulis = "John Doe",
                gambarBerita = R.drawable.tech_news_image,
                gambarPenulis = R.drawable.author_john_doe,
                dateTime = "2024-10-03 08:30",
                likes = 120,
                comments = generateRandomComments(listOf("Technology", "Science")),
                categories = listOf("Technology", "Science"),
                false
            ),
            DataNews(
                judulBerita = "Breaking News: Market Hits Record High",
                deskripsiBerita = "The global stock markets have experienced an unexpected surge, reaching unprecedented highs in 2024. Investors are flocking back to equities, buoyed by strong earnings reports and optimism about the future of the global economy. Despite recent geopolitical tensions and lingering concerns about inflation, the markets have remained resilient, with major indices breaking records. This bullish trend has caught many analysts off guard, leading some to predict that the rally may continue for the foreseeable future.\n\nYet, not everyone is convinced. Skeptics warn that the market could be due for a correction, especially given the volatility seen in recent years. Some experts believe that the surge is a result of speculative investment rather than sustainable economic growth. As investors continue to watch for signs of change, the coming months will be critical in determining whether the markets can maintain their upward momentum or if a downturn is on the horizon.",
                namaPenulis = "Jane Smith",
                gambarBerita = R.drawable.market_news_image,
                gambarPenulis = R.drawable.author_jane_smith,
                dateTime = "2024-10-01 12:45",
                likes = 200,
                comments = generateRandomComments(listOf("Finance", "Stock Market")),
                categories = listOf("Finance", "Stock Market"),
                false
            ),
            DataNews(
                judulBerita = "Climate Change: What You Need to Know",
                deskripsiBerita = "Climate change continues to be one of the most pressing issues of our time, with 2024 witnessing some of the most extreme weather events in recent history. From devastating wildfires in Australia to record-breaking hurricanes in the Atlantic, the effects of a warming planet are becoming impossible to ignore. Scientists are warning that the world is approaching a tipping point, where the damage caused by climate change could become irreversible if immediate action is not taken.\n\nGovernments around the world are now being forced to respond with bold policies aimed at reducing carbon emissions and transitioning to renewable energy sources. However, progress has been slow, and many fear that it may be too little, too late. The need for global cooperation is more urgent than ever as climate scientists push for a rapid reduction in greenhouse gases. Public pressure is mounting as citizens demand solutions to safeguard the planet for future generations.",
                namaPenulis = "Alex Johnson",
                gambarBerita = R.drawable.climate_news_image,
                gambarPenulis = R.drawable.author_alex_johnson,
                dateTime = "2024-09-29 14:20",
                likes = 340,
                comments = generateRandomComments(listOf("Environment", "Global Warming")),
                categories = listOf("Environment", "Global Warming"),
                false
            ),
            DataNews(
                judulBerita = "Top 10 Travel Destinations for 2024",
                deskripsiBerita = "The post-pandemic travel boom has reignited a passion for exploration, with millions of people eager to discover new destinations in 2024. As countries reopen their borders and ease restrictions, travel enthusiasts are planning trips to some of the world’s most exciting locations. From the tranquil beaches of Bali to the historical wonders of Rome, there are countless places that promise adventure and relaxation. Travel experts are predicting that 2024 will be a record-breaking year for tourism, with pent-up demand driving unprecedented growth in the sector.\n\nBut with the surge in travel comes a new set of challenges. Sustainable tourism has become a critical topic, as popular destinations struggle with overcrowding and environmental degradation. As more travelers seek out eco-friendly options, tour operators and airlines are adjusting their offerings to cater to the growing demand for responsible travel. Whether you're looking for a luxury getaway or a backpacking adventure, 2024 offers endless possibilities for those with a case of wanderlust.",
                namaPenulis = "Emily Brown",
                gambarBerita = R.drawable.travel_news_image,
                gambarPenulis = R.drawable.author_emily_brown,
                dateTime = "2024-09-27 10:15",
                likes = 450,
                comments = generateRandomComments(listOf("Travel", "Lifestyle")),
                categories = listOf("Travel", "Lifestyle"),
                false
            ),
            DataNews(
                judulBerita = "AI Revolution: Impact on Future Jobs",
                deskripsiBerita = "As artificial intelligence (AI) continues to evolve, its impact on the workforce is becoming increasingly apparent. AI has already begun to automate many tasks traditionally performed by humans, from customer service roles to manufacturing jobs. While some fear that this will lead to widespread job displacement, others argue that AI will create new opportunities in industries we have yet to imagine. The future of work in 2024 is a topic of much debate, with experts divided on whether AI will be a net positive or negative for the economy.\n\nIn response to these changes, companies are investing heavily in reskilling programs to prepare workers for an AI-driven future. Many believe that the key to success will be adaptability, as employees must learn to work alongside AI systems to remain competitive in the job market. Meanwhile, policymakers are grappling with how to regulate the use of AI to ensure that its benefits are shared widely across society. As we move forward, the role of AI in shaping the workforce will be one of the defining issues of our time.",
                namaPenulis = "Michael Green",
                gambarBerita = R.drawable.ai_news_image,
                gambarPenulis = R.drawable.author_michael_green,
                dateTime = "2024-10-03 15:00",
                likes = 175,
                comments = generateRandomComments(listOf("Technology", "Jobs")),
                categories = listOf("Technology", "Jobs"),
                false
            ),
            DataNews(
                judulBerita = "New Discoveries in Space Exploration",
                deskripsiBerita = "The mysteries of the universe continue to unfold in 2024, as space exploration reaches new heights. NASA and private companies like SpaceX have made significant strides in uncovering the secrets of our solar system and beyond. This year, groundbreaking discoveries have been made, including the detection of new exoplanets that may be capable of supporting life. These findings are reshaping our understanding of the universe and sparking renewed interest in the possibility of extraterrestrial life.\n\nAt the same time, advances in space technology are making space travel more accessible than ever before. With plans to establish a permanent human presence on the Moon and Mars, the dream of living beyond Earth is slowly becoming a reality. As scientists continue to explore the far reaches of space, the question remains: Are we alone in the universe? The answers we find could change the course of humanity forever.",
                namaPenulis = "Sarah White",
                gambarBerita = R.drawable.space_news_image,
                gambarPenulis = R.drawable.author_sarah_white,
                dateTime = "2024-09-22 09:30",
                likes = 220,
                comments = generateRandomComments(listOf("Science", "Space")),
                categories = listOf("Science", "Space"),
                false
            ),
            DataNews(
                judulBerita = "Health Benefits of a Plant-Based Diet",
                deskripsiBerita = "A growing body of research shows that adopting a plant-based diet can have profound health benefits. From reducing the risk of heart disease to promoting weight loss, a diet rich in fruits, vegetables, and whole grains can lead to a longer, healthier life. In 2024, more people than ever are embracing plant-based eating, driven by both health concerns and ethical considerations related to animal welfare. Nutrition experts are encouraging people to make small, sustainable changes to their diet that can yield significant long-term benefits.\n\nBeyond personal health, plant-based diets are also gaining traction as a solution to environmental challenges. Livestock farming is a major contributor to greenhouse gas emissions, deforestation, and water scarcity. By reducing our reliance on animal products, we can lessen our environmental impact and help mitigate climate change. Whether you're a lifelong vegan or just starting to explore plant-based options, 2024 is a great year to start making healthier, more sustainable choices.",
                namaPenulis = "Laura Martinez",
                gambarBerita = R.drawable.health_news_image,
                gambarPenulis = R.drawable.author_laura_martinez,
                dateTime = "2024-10-01 11:00",
                likes = 300,
                comments = generateRandomComments(listOf("Health", "Nutrition")),
                categories = listOf("Health", "Nutrition"),
                false
            ),
            DataNews(
                judulBerita = "New Trends in Fashion for 2024",
                deskripsiBerita = "Fashion in 2024 is all about bold choices and sustainability. Designers are embracing innovative materials and eco-friendly production methods, resulting in collections that are not only stunning but also kind to the planet. Sustainable fashion has moved from the fringes to the mainstream, with major brands showcasing collections made from recycled materials and ethically sourced fabrics. This year, we're seeing a resurgence of bright colors, bold prints, and avant-garde designs that push the boundaries of traditional fashion.\n\nBut sustainability is not just a trend — it's becoming a necessity. With consumers increasingly concerned about the environmental impact of their wardrobe choices, fashion brands are being forced to rethink their production processes. Many are investing in circular fashion, where garments are designed to be reused, recycled, or repurposed. As the fashion industry evolves, 2024 is proving to be a year of exciting changes that could redefine how we think about style and sustainability.",
                namaPenulis = "David Clark",
                gambarBerita = R.drawable.fashion_news_image,
                gambarPenulis = R.drawable.author_david_clark,
                dateTime = "2024-09-28 16:30",
                likes = 140,
                comments = generateRandomComments(listOf("Fashion", "Lifestyle")),
                categories = listOf("Fashion", "Lifestyle"),
                false
            ),
            DataNews(
                judulBerita = "How to Save Money in a Tough Economy",
                deskripsiBerita = "With economic uncertainty on the rise, saving money has become a top priority for many households in 2024. As inflation continues to impact the cost of living, more people are looking for ways to cut expenses and boost their savings. This article offers practical tips on how to manage your finances, from creating a budget to reducing unnecessary spending. Whether you're saving for a big purchase or just trying to make ends meet, these strategies can help you stay on track.\n\nIn addition to budgeting tips, financial experts are also recommending ways to invest wisely during uncertain times. With the stock market experiencing volatility, diversifying your investment portfolio can help protect your assets and provide long-term financial security. By following these simple steps, you can build a solid financial foundation that will see you through both good times and bad.",
                namaPenulis = "Chris Lewis",
                gambarBerita = R.drawable.economy_news_image,
                gambarPenulis = R.drawable.author_chris_lewis,
                dateTime = "2024-09-30 13:15",
                likes = 280,
                comments = generateRandomComments(listOf("Finance", "Economy")),
                categories = listOf("Finance", "Economy"),
                false
            ),
            DataNews(
                judulBerita = "Top 5 Gadgets to Look Out for in 2024",
                deskripsiBerita = "2024 is shaping up to be an exciting year for tech enthusiasts, with a slew of new gadgets hitting the market. From foldable smartphones with revolutionary display technology to smart home devices that integrate seamlessly into daily life, the latest tech innovations are pushing the boundaries of what’s possible. These gadgets not only offer convenience but also introduce new ways of interacting with technology, making life easier and more connected. Whether you're looking for the latest smartwatch or a cutting-edge gaming console, 2024 has something for everyone.\n\nHowever, with so many new gadgets on the market, it can be tough to decide which ones are worth the investment. This article breaks down the top five must-have devices of the year, covering everything from specs to user experience. Whether you're a tech enthusiast or just looking for a new gadget to enhance your daily routine, this guide will help you make an informed choice.",
                namaPenulis = "Jessica Brown",
                gambarBerita = R.drawable.gadgets_news_image,
                gambarPenulis = R.drawable.author_jessica_brown,
                dateTime = "2024-10-02 14:00",
                likes = 320,
                comments = generateRandomComments(listOf("Technology", "Gadgets")),
                categories = listOf("Technology", "Gadgets"),
                false
            )
        )

    }

    fun generateRandomComments(categories: List<String>): List<String> {
        val technologyComments = listOf(
            "AI is the future!",
            "This is groundbreaking!",
            "Tech is advancing so fast!",
            "Exciting times ahead for tech!",
            "This is very informative.",
            "Fascinating developments!"
        )

        val financeComments = listOf(
            "Amazing financial insight!", "Interesting stock market update.",
            "This could be huge for investors.", "I'm following this closely.",
            "Very informative, thanks!", "Great read for market enthusiasts."
        )

        val environmentComments = listOf(
            "This is worrying.", "Climate change needs immediate action!",
            "We need more sustainable solutions.", "This article raises serious concerns.",
            "It's time to take this seriously.", "A very pressing issue."
        )

        val travelComments = listOf(
            "These travel tips are great!", "I want to visit these places!",
            "Can't wait to book my next trip!", "This is inspiring wanderlust!",
            "Traveling is back in style.", "Great recommendations!"
        )

        val healthComments = listOf(
            "I'm switching to plant-based!", "This is great for health-conscious readers.",
            "Good health tips, thanks!", "Very useful advice on healthy living.",
            "Going plant-based is the future!", "Thanks for promoting healthy eating."
        )

        val possibleComments = when {
            categories.contains("Technology") -> technologyComments
            categories.contains("Finance") -> financeComments
            categories.contains("Environment") -> environmentComments
            categories.contains("Travel") -> travelComments
            categories.contains("Health") -> healthComments
            else -> listOf(
                "Great article!",
                "Informative!",
                "Interesting read!",
                "Loved this post!"
            )
        }

        val randomNumber = Random.nextInt(4, 11)
        return List(randomNumber) { possibleComments.random() }
    }


}