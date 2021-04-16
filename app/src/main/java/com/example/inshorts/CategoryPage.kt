package com.example.inshorts

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.inshorts.views.NewsFeedActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.collections.ArrayList

class CategoryPage : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val exampleList = generateDummyList(500)
        TopPicksRecyclerView.adapter = PicksAdapter(exampleList)
        TopPicksRecyclerView.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        TopPicksRecyclerView.setHasFixedSize(true)

        tvSkip.setOnClickListener {
            val intent = Intent(this, NewsFeedActivity::class.java)
            startActivity(intent)
        }
    }

    private fun generateDummyList(size: Int): List<DataClass> {
        val list = ArrayList<DataClass>()
        list.add(DataClass(R.drawable.ic_graph_bar, "Business"))
        list.add(DataClass(R.drawable.ic_world, "World"))
        list.add(DataClass(R.drawable.ic_radio, "Miscellaneous"))
        list.add(DataClass(R.drawable.ic_man, "Hatke"))
        list.add(DataClass(R.drawable.ic_woman_clothes, "Fashion"))
        list.add(DataClass(R.drawable.ic_science, "Science"))
        list.add(DataClass(R.drawable.ic_sports_car, "Automobile"))
        list.add(DataClass(R.drawable.ic_telescope, "Science"))
        list.add(DataClass(R.drawable.ic_startup, "Startup"))
        list.add(DataClass(R.drawable.ic_suitcases, "Travel"))
        list.add(DataClass(R.drawable.ic_trophy, "Trophy"))
        list.add(DataClass(R.drawable.ic_thinking, "Technology"))
        list.add(DataClass(R.drawable.ic_sports_car, "Automobile"))
        list.add(DataClass(R.drawable.ic_camcorder, "Entertainment"))
        list.add(DataClass(R.drawable.ic_politics_image, "Politics"))
        return list
    }

}


