package com.example.inshorts.viewholders

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.inshorts.listeners.RecyclerViewClickListener
import com.example.inshorts.models.DataModel
import kotlinx.android.synthetic.main.item_news_container.view.*

class NewsFeedViewHolder (private val view: View, private val recyclerViewClickListener: RecyclerViewClickListener) : RecyclerView.ViewHolder(view) {

    fun setData(newsDataModel: DataModel){
        view.apply {
            tvNewsHeadlines.text = newsDataModel.title
            tvNewsDesc.text = newsDataModel.content
            Glide.with(ivNewsImg).load(newsDataModel.imageUrl).into(ivNewsImg)
            tvHeading.text = newsDataModel.title

            tvSwipeText.setOnClickListener {
                recyclerViewClickListener.onReadMoreIsClicked(adapterPosition, newsDataModel)
            }
        }
    }

}