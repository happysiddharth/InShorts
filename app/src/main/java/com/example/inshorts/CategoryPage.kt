package com.example.inshorts

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.ryan.rv_gallery.GalleryRecyclerView
import kotlinx.android.synthetic.main.activity_main.*
import java.security.AccessController.getContext
import java.util.*
import kotlin.collections.ArrayList

class CategoryPage : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val exampleList = generateDummyList(500)
        TopPicksRecyclerView.adapter = PicksAdapter(exampleList)
        TopPicksRecyclerView.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        TopPicksRecyclerView.setHasFixedSize(true)
    }



    private fun generateDummyList(size: Int): List<DataClass> {
        val list = ArrayList<DataClass>()
        list.add(DataClass(R.drawable.ic_graph_bar,"Business"))
        list.add(DataClass(R.drawable.ic_world,"World"))
        list.add(DataClass(R.drawable.ic_radio,"Miscellaneous"))
        list.add(DataClass(R.drawable.ic_man,"Hatke"))
        list.add(DataClass(R.drawable.ic_woman_clothes,"Fashion"))
        list.add(DataClass(R.drawable.ic_science,"Science"))
        list.add(DataClass(R.drawable.ic_sports_car,"Automobile"))
        list.add(DataClass(R.drawable.ic_telescope,"Science"))
        list.add(DataClass(R.drawable.ic_startup,"Startup"))
        list.add(DataClass(R.drawable.ic_suitcases,"Travel"))
        list.add(DataClass(R.drawable.ic_trophy,"Trophy"))
        list.add(DataClass(R.drawable.ic_thinking,"Technology"))
        list.add(DataClass(R.drawable.ic_sports_car,"Automobile"))
        list.add(DataClass(R.drawable.ic_camcorder,"Entertainment"))
        list.add(DataClass(R.drawable.ic_politics_image,"Politics"))
//            for (i in 0 until size) {
//                val drawable = when (i % 3) {
//                    0 -> R.drawable.ic_launcher_background
//                    1 -> R.drawable.ic_launcher_background
//                    else -> R.drawable.ic_launcher_background
//                }
//                val item = DataClass(drawable, "Item $i")
//                list += item
//            }
        return list
    }

}

//
//    private fun setRecyclerData() {
//        val linearLayoutManager =
//            LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false)
//        val picksAdapter = PicksAdapter(topPicksModelList)
//        TopPicksRecycler.setLayoutManager(linearLayoutManager)
//        TopPicksRecycler.setAdapter(picksAdapter)
//    }
//    private fun buildData()
//
//    {
//        topPicksModelList.add(TopPicksModel(R.drawable.ic_launcher_background))
//        topPicksModelList.add(TopPicksModel(R.drawable.ic_launcher_background))
//        topPicksModelList.add(TopPicksModel(R.drawable.ic_launcher_background))
//        topPicksModelList.add(TopPicksModel(R.drawable.ic_launcher_background))
//        topPicksModelList.add(TopPicksModel(R.drawable.ic_launcher_background))
//        topPicksModelList.add(TopPicksModel(R.drawable.ic_launcher_background))
//        topPicksModelList.add(TopPicksModel(R.drawable.ic_launcher_background))
//    }

