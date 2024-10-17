package com.example.pengalatdite.aplikasisederhana

import kotlin.random.Random

object DummyData {
    fun getData(): List<DataNews> {
        return listOf(
            DataNews(
                judulBerita = "AI and Machine Learning: Shaping the Future in 2024",
                deskripsiBerita = """
            <p>The year 2024 marks a monumental shift in the world of technology. Groundbreaking innovations in artificial intelligence (AI) and machine learning (ML) are revolutionizing industries from healthcare to transportation. AI-driven systems are now capable of performing tasks once thought impossible, such as diagnosing complex diseases, piloting autonomous vehicles, and even creating original works of art.</p>
            <br/>
            <p>These advancements are not only boosting efficiency but are also opening doors to a future where technology seamlessly integrates into every aspect of daily life. However, as these technologies evolve, concerns about their impact on human labor are growing, and we are beginning to see the effects on various industries.</p>
            <br/>
            <p>Experts predict that by 2030, nearly 30% of jobs currently held by humans could be automated. But while some see this as a threat, others see it as an opportunity to upskill the workforce and create jobs in new fields.</p>
            <br/>
            <p>As AI systems become more autonomous, concerns about data privacy, job displacement, and ethical implications have intensified. The race to regulate AI is becoming urgent, with governments and corporations debating how to ensure these technologies benefit humanity while mitigating risks.</p>
            <br/>
            <p>2024 is shaping up to be a pivotal year in the tech industry, with far-reaching consequences that will shape our world for decades to come. Whether these changes will be beneficial or detrimental largely depends on how we approach the regulation and implementation of these systems.</p>
        """.trimIndent(),
                namaPenulis = "John Doe",
                gambarBerita = R.drawable.tech_news_image,
                gambarPenulis = R.drawable.author_john_doe,
                dateTime = "2024-10-03 08:30",
                likes = generateRandomLikes(),
                comments = generateRandomComments(listOf("Technology", "Science")),
                categories = listOf("Technology", "Science"),
                false
            ),
            DataNews(
                judulBerita = "Global Stock Markets Surge Amid Optimism in 2024",
                deskripsiBerita = """
            <p>The global stock markets have experienced an unexpected surge, reaching unprecedented highs in 2024. Investors are flocking back to equities, buoyed by strong earnings reports and optimism about the future of the global economy.</p>
            <br/>
            <p>Despite recent geopolitical tensions and lingering concerns about inflation, the markets have remained resilient, with major indices breaking records. Analysts believe that strong corporate earnings are driving the bullish sentiment, although the long-term sustainability of this trend remains uncertain.</p>
            <br/>
            <p>Skeptics warn that the market could be due for a correction, especially given the volatility seen in recent years. Some experts believe that the surge is a result of speculative investment rather than sustainable economic growth, and the coming months will be critical in determining the markets' future direction.</p>
            <br/>
            <p>Nevertheless, many investors are optimistic about the outlook. With interest rates remaining low, the appeal of equities continues to grow. The question on everyone’s mind is whether the current growth will persist or whether we are headed for a significant market adjustment.</p>
            <br/>
            <p>As investors continue to watch for signs of change, the coming months will be critical in determining whether the markets can maintain their upward momentum or if a downturn is on the horizon. 2024 may be a historic year for global finance, with long-term implications for investors around the world.</p>
        """.trimIndent(),
                namaPenulis = "Jane Smith",
                gambarBerita = R.drawable.market_news_image,
                gambarPenulis = R.drawable.author_jane_smith,
                dateTime = "2024-10-01 12:45",
                likes = generateRandomLikes(),
                comments = generateRandomComments(listOf("Finance", "Stock Market")),
                categories = listOf("Finance", "Stock Market"),
                false
            ),
            DataNews(
                judulBerita = "Climate Change Reaches Critical Point: Extreme Weather Events in 2024",
                deskripsiBerita = """
            <p>Climate change continues to be one of the most pressing issues of our time, with 2024 witnessing some of the most extreme weather events in recent history. From devastating wildfires in Australia to record-breaking hurricanes in the Atlantic, the effects of a warming planet are becoming impossible to ignore.</p>
            <br/>
            <p>Scientists are warning that the world is approaching a tipping point, where the damage caused by climate change could become irreversible if immediate action is not taken. However, governments and corporations worldwide are grappling with how best to combat these changes while maintaining economic growth.</p>
            <br/>
            <p>In response to these climate challenges, countries are now implementing aggressive policies aimed at reducing carbon emissions and transitioning to renewable energy sources. Unfortunately, progress has been slow, with some regions still heavily reliant on fossil fuels for their energy needs.</p>
            <br/>
            <p>The urgency for global cooperation has never been higher. As public pressure mounts, citizens around the world are calling for more robust and rapid measures to address the climate crisis and secure a livable future for the next generation.</p>
            <br/>
            <p>2024 may be the year that humanity takes the decisive steps necessary to combat climate change. With every passing day, the stakes grow higher, and the world waits to see how global leaders will respond to this unprecedented challenge.</p>
        """.trimIndent(),
                namaPenulis = "Alex Johnson",
                gambarBerita = R.drawable.climate_news_image,
                gambarPenulis = R.drawable.author_alex_johnson,
                dateTime = "2024-09-29 14:20",
                likes = generateRandomLikes(),
                comments = generateRandomComments(listOf("Environment", "Global Warming")),
                categories = listOf("Environment", "Global Warming"),
                false
            ),
            DataNews(
                judulBerita = "Post-Pandemic Travel Boom: Top Destinations to Explore in 2024",
                deskripsiBerita = """
            <p>The post-pandemic travel boom has reignited a passion for exploration, with millions of people eager to discover new destinations in 2024. As countries reopen their borders and ease restrictions, travel enthusiasts are planning trips to some of the world’s most exciting locations.</p>
            <br/>
            <p>From the tranquil beaches of Bali to the historical wonders of Rome, there are countless places that promise adventure and relaxation. Travel experts predict that 2024 will be a record-breaking year for tourism, with pent-up demand driving unprecedented growth in the sector.</p>
            <br/>
            <p>However, the travel boom also brings new challenges. Popular destinations are struggling with overcrowding, and concerns about environmental degradation are growing. Sustainable tourism is now a critical focus for many travel operators.</p>
            <br/>
            <p>As more travelers seek out eco-friendly options, airlines and tour operators are adjusting their offerings to meet the growing demand for responsible travel. For the environmentally conscious traveler, 2024 offers a wealth of opportunities to explore the world while minimizing their carbon footprint.</p>
            <br/>
            <p>Whether you're planning a luxury getaway or a backpacking adventure, 2024 is shaping up to be an exciting year for travelers. With more sustainable travel options than ever before, the world is waiting to be explored responsibly and thoughtfully.</p>
        """.trimIndent(),
                namaPenulis = "Emily Brown",
                gambarBerita = R.drawable.travel_news_image,
                gambarPenulis = R.drawable.author_emily_brown,
                dateTime = "2024-09-27 10:15",
                likes = generateRandomLikes(),
                comments = generateRandomComments(listOf("Travel", "Lifestyle")),
                categories = listOf("Travel", "Lifestyle"),
                false
            ),
            DataNews(
                judulBerita = "AI and the Future of Work: Navigating Job Displacement in 2024",
                deskripsiBerita = """
            <p>As artificial intelligence (AI) continues to evolve, its impact on the workforce is becoming increasingly apparent. AI has already begun to automate many tasks traditionally performed by humans, from customer service roles to manufacturing jobs.</p>
            <br/>
            <p>While some fear that this will lead to widespread job displacement, others argue that AI will create new opportunities in industries we have yet to imagine. The future of work in 2024 is a topic of much debate, with experts divided on whether AI will be a net positive or negative for the economy.</p>
            <br/>
            <p>In response to these changes, companies are investing heavily in reskilling programs to prepare workers for an AI-driven future. Workers will need to adapt quickly to thrive in this new landscape.</p>
            <br/>
            <p>Meanwhile, policymakers are grappling with how to regulate the use of AI to ensure that its benefits are shared widely across society. Many believe that regulation is essential to prevent the concentration of power in a few large companies.</p>
            <br/>
            <p>The role of AI in shaping the workforce will be one of the defining issues of our time. Whether it leads to a brighter future or deepens societal divides will depend largely on how these technologies are developed and implemented in the years to come.</p>
        """.trimIndent(),
                namaPenulis = "Michael Green",
                gambarBerita = R.drawable.ai_news_image,
                gambarPenulis = R.drawable.author_michael_green,
                dateTime = "2024-10-03 15:00",
                likes = generateRandomLikes(),
                comments = generateRandomComments(listOf("Technology", "Jobs")),
                categories = listOf("Technology", "Jobs"),
                false
            ),
            DataNews(
                judulBerita = "2024: A Year of Triumph and Transition in Sports",
                deskripsiBerita = """
            <p>In the world of sports, 2024 has been a year of both triumph and heartbreak. Athletes across various disciplines have broken records, while others have faced unexpected setbacks in their careers.</p>
            <br/>
            <p>The Summer Olympics, held in Paris, was the highlight of the year, with athletes from around the world competing at the highest level. Among the standout moments was the performance of sprinters who shattered records in the 100m and 200m events.</p>
            <br/>
            <p>In football, the World Cup qualifiers are heating up, with unexpected teams making it to the top of the standings. The road to the 2026 World Cup is shaping up to be one of the most competitive yet.</p>
            <br/>
            <p>Meanwhile, the world of tennis has seen a new generation of players rising to challenge the old guard. With some veteran players retiring, the sport is entering a new era.</p>
            <br/>
            <p>2024 will be remembered as a year of transition in sports, where new champions emerged and the legends of the past took their final bow. Fans are eagerly awaiting what comes next as the sporting world continues to evolve.</p>
        """.trimIndent(),
                namaPenulis = "Sarah White",
                gambarBerita = R.drawable.sports_news_image,
                gambarPenulis = R.drawable.author_sarah_white,
                dateTime = "2024-09-22 09:30",
                likes = generateRandomLikes(),
                comments = generateRandomComments(listOf("Sports", "Olympics")),
                categories = listOf("Sports", "Olympics"),
                false
            ),
            DataNews(
                judulBerita = "Sustainability in Fashion: The Eco-Friendly Movement in 2024",
                deskripsiBerita = """
            <p>2024 is shaping up to be a pivotal year for the fashion industry, as sustainability continues to take center stage. More brands than ever are focusing on eco-friendly designs, from using recycled materials to reducing water consumption in production processes.</p>
            <br/>
            <p>The shift towards sustainability is being driven by both consumers and regulators, as the environmental impact of the fashion industry has become impossible to ignore. Fast fashion brands, in particular, are facing increasing scrutiny for their wasteful practices.</p>
            <br/>
            <p>At the same time, new technologies are emerging that could revolutionize how clothes are made. From 3D printing to fabric innovations, the fashion industry is entering an exciting period of change.</p>
            <br/>
            <p>However, there are challenges ahead. Many smaller brands struggle to compete with larger companies that can afford the transition to sustainable practices. For these brands, balancing environmental responsibility with financial viability is a delicate task.</p>
            <br/>
            <p>The future of fashion in 2024 and beyond will depend on the ability of the industry to adapt to these new realities. As consumers become more environmentally conscious, the demand for sustainable fashion is only expected to grow.</p>
        """.trimIndent(),
                namaPenulis = "Laura Martinez",
                gambarBerita = R.drawable.fashion_news_image,
                gambarPenulis = R.drawable.author_laura_martinez,
                dateTime = "2024-10-01 11:00",
                likes = generateRandomLikes(),
                comments = generateRandomComments(listOf("Fashion", "Sustainability")),
                categories = listOf("Fashion", "Sustainability"),
                false
            ),
            DataNews(
                judulBerita = "Streaming Platforms Dominate the Entertainment Industry in 2024",
                deskripsiBerita = """
            <p>In 2024, the entertainment industry is undergoing a transformation as streaming platforms continue to dominate the media landscape. Traditional TV and movie theaters are struggling to compete with the convenience and variety offered by streaming services like Netflix, Disney+, and Amazon Prime.</p>
            <br/>
            <p>This shift is not just affecting how content is consumed, but also how it is produced. Major studios are now investing heavily in exclusive content for their streaming platforms, with some even bypassing theatrical releases altogether.</p>
            <br/>
            <p>Meanwhile, the rise of independent creators on platforms like YouTube and TikTok is challenging the traditional power structures of Hollywood. These platforms allow creators to reach millions of viewers without the backing of major studios, giving rise to a new wave of digital stars.</p>
            <br/>
            <p>As the entertainment landscape evolves, questions remain about the future of traditional media. Will movie theaters survive in the age of streaming, or will they become a niche experience? And how will the industry adapt to the growing power of independent creators?</p>
            <br/>
            <p>2024 is shaping up to be a year of change for entertainment, as audiences continue to shift towards digital platforms. The industry is at a crossroads, and the decisions made in the coming years will shape its future for decades to come.</p>
        """.trimIndent(),
                namaPenulis = "David Clark",
                gambarBerita = R.drawable.entertaiment_news_image,
                gambarPenulis = R.drawable.author_david_clark,
                dateTime = "2024-09-28 16:30",
                likes = generateRandomLikes(),
                comments = generateRandomComments(listOf("Entertainment", "Streaming")),
                categories = listOf("Entertainment", "Streaming"),
                false
            ),
            DataNews(
                judulBerita = "Education in 2024: The Rise of Hybrid and Online Learning Models",
                deskripsiBerita = """
            <p>In the realm of education, 2024 is a year of innovation and transformation. The pandemic accelerated the adoption of online learning, and many of these changes have persisted even as schools and universities return to in-person classes.</p>
            <br/>
            <p>Hybrid learning models are now common, blending online and traditional classroom experiences to offer more flexibility to students. These models have been particularly beneficial for non-traditional students, such as working professionals and parents.</p>
            <br/>
            <p>At the same time, new educational technologies are enhancing the learning experience. From AI-powered tutoring systems to virtual reality classrooms, technology is playing an increasingly important role in education.</p>
            <br/>
            <p>However, the shift to digital learning has not been without its challenges. Concerns about access to technology and the quality of online education have been raised, particularly for students from disadvantaged backgrounds.</p>
            <br/>
            <p>2024 marks a turning point for education, as institutions navigate the complexities of integrating technology into the learning process. The future of education is digital, but ensuring that all students have access to high-quality learning remains a critical challenge.</p>
        """.trimIndent(),
                namaPenulis = "Chris Lewis",
                gambarBerita = R.drawable.education_news_image,
                gambarPenulis = R.drawable.author_chris_lewis,
                dateTime = "2024-09-30 13:15",
                likes = generateRandomLikes(),
                comments = generateRandomComments(listOf("Education", "Technology")),
                categories = listOf("Education", "Technology"),
                false
            ),
            DataNews(
                judulBerita = "Space Exploration in 2024: New Frontiers and the Return to the Moon",
                deskripsiBerita = """
            <p>The space race is back, and 2024 is a year of major milestones for the exploration of the final frontier. Space agencies and private companies alike are making rapid progress in their missions to explore the moon, Mars, and beyond.</p>
            <br/>
            <p>NASA’s Artemis program has taken significant steps towards returning humans to the moon, with a crewed mission planned for the near future. Meanwhile, SpaceX continues to push the boundaries of space exploration with its Starship program, which aims to make interplanetary travel a reality.</p>
            <br/>
            <p>Other countries are also joining the space race. China’s space program has made impressive strides, and the European Space Agency is developing new technologies to explore distant planets.</p>
            <br/>
            <p>While the excitement around space exploration is growing, there are also concerns about the militarization of space. As more nations develop space capabilities, the risk of conflict in space is increasing, and international regulations will be essential to maintain peace.</p>
            <br/>
            <p>2024 is a landmark year for space exploration, with new missions launching and humanity getting closer than ever to becoming a multi-planetary species. The next decade could see humanity taking its first steps towards a permanent presence in space.</p>
        """.trimIndent(),
                namaPenulis = "Jessica Brown",
                gambarBerita = R.drawable.space_news_image,
                gambarPenulis = R.drawable.author_jessica_brown,
                dateTime = "2024-10-02 14:00",
                likes = generateRandomLikes(),
                comments = generateRandomComments(listOf("Science", "Space Exploration")),
                categories = listOf("Science", "Space Exploration"),
                false
            )
        )

    }

    private fun generateRandomComments(categories: List<String>): List<String> {
        val technologyComments = listOf(
            "AI is the future!",
            "This is groundbreaking!",
            "Tech is advancing so fast!",
            "Exciting times ahead for tech!",
            "This is very informative.",
            "Fascinating developments!",
            "Scary but exciting.",
            "This will change everything.",
            "Jobs will disappear.",
            "What’s next for AI?",
            "I hope it’s regulated."
        )

        val financeComments = listOf(
            "Amazing!",
            "Wow, this is big news.",
            "How long can this last?",
            "The market is unpredictable.",
            "Hope for the best.",
            "Fingers crossed."
        )

        val environmentComments = listOf(
            "This is worrying.",
            "We need to take action.",
            "The future looks bleak.",
            "It's time for change.",
            "More needs to be done.",
            "We must act now."
        )

        val travelComments = listOf(
            "Can't wait to visit these places!",
            "Great recommendations.",
            "Travel is back!",
            "Amazing destinations.",
            "Is travel really sustainable?",
            "The world is reopening!"
        )

        val sportsComments = listOf(
            "What a year for sports!",
            "Incredible performances.",
            "Sad to see legends retire.",
            "Who will be the next big star?",
            "Olympics were amazing!",
            "Looking forward to 2026."
        )

        val fashionComments = listOf(
            "Sustainable fashion is the future.",
            "Love this shift!",
            "Finally, change is happening.",
            "Big brands need to do more.",
            "Eco-friendly fashion is cool.",
            "I’m buying more sustainable clothing."
        )

        val scienceComments = listOf(
            "Sustainable fashion is the future.",
            "Love this shift!",
            "Finally, change is happening.",
            "Big brands need to do more.",
            "Eco-friendly fashion is cool.",
            "I’m buying more sustainable clothing."
        )

        val possibleComments = when {
            categories.contains("Technology") -> technologyComments
            categories.contains("Finance") -> financeComments
            categories.contains("Environment") -> environmentComments
            categories.contains("Travel") -> travelComments
            categories.contains("Sports") -> sportsComments
            categories.contains("Fashion") -> fashionComments
            categories.contains("Science") -> fashionComments
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

    private fun generateRandomLikes(): Int {
        return Random.nextInt(45, 555)
    }

    fun generateRandomName(): String {
        val nameList = listOf(
            "Olivia",
            "Liam",
            "Emma",
            "Noah",
            "Ava",
            "James",
            "Sophia",
            "Lucas",
            "Mia",
            "Elijah",
            "Amelia",
            "Benjamin",
            "Isabella",
            "Henry",
            "Charlotte",
            "Alexander",
            "Harper",
            "Ethan",
            "Evelyn",
            "Jack"
        )

        return nameList[Random.nextInt(nameList.size)]
    }
}