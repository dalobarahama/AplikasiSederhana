package com.example.pengalatdite.aplikasisederhana.screen.newslist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.pengalatdite.aplikasisederhana.R
import com.example.pengalatdite.aplikasisederhana.data.DataNews

class NewsListViewMvcImpl(layoutInflater: LayoutInflater, parent: ViewGroup?) : NewsListViewMvc {

    interface Listener {
        fun onItemAdapterClicked(news: DataNews, position: Int)
        fun onLikesAdapterClicked(position: Int)
        fun onProfilePicClicked()
        fun setToolbar(toolbar: Toolbar)
    }

    private val listeners = HashSet<Listener>()

    private val rootView = layoutInflater.inflate(R.layout.activity_main, parent, false)

    private var adapter: Adapter
    private val toolbar: Toolbar

    init {
        toolbar = findViewById(R.id.toolbar)
        val profilePic = findViewById<ImageView>(R.id.toolbar_profile)
        val recyclerView = findViewById<RecyclerView>(R.id.recylerView)

        profilePic.setOnClickListener {
            getListener()?.onProfilePicClicked()
        }

        recyclerView.layoutManager = LinearLayoutManager(
            getRootView().context,
            RecyclerView.VERTICAL,
            false
        )

        adapter = Adapter()
        recyclerView.adapter = adapter
        adapter.setOnClickRecyclerAdapter(object : Adapter.OnClickAdapter {
            override fun onItemClicked(news: DataNews, position: Int) {
                for (listener in listeners) {
                    listener.onItemAdapterClicked(news, position)
                }
            }

            override fun onLikesClicked(position: Int) {
                for (listener in listeners) {
                    listener.onLikesAdapterClicked(position)
                }
            }
        })
    }

    override fun getRootView(): View {
        return rootView
    }

    override fun bindData(list: List<DataNews>) {
        adapter.setList(list)
        getListener()?.setToolbar(toolbar)
    }

    override fun registerListener(listener: Listener) {
        listeners.add(listener)
    }

    override fun unregisterListener(listener: Listener) {
        listeners.remove(listener)
    }

    private fun <T : View?> findViewById(id: Int): T {
        return getRootView().findViewById(id)
    }

    private fun getListener(): Listener? {
        var listener: Listener? = null
        for (itemListener in listeners) {
            listener = itemListener
        }
        return listener
    }
}