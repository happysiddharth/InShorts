package com.example.inshorts.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.inshorts.R
import com.example.inshorts.listeners.RecyclerViewClickListener
import com.example.inshorts.models.DataModel
import com.example.inshorts.viewholders.NewsFeedViewHolder

class NewsFeedAdapter(
    private var dataModelList: List<DataModel>,
    private val recyclerViewClickListener: RecyclerViewClickListener
) : RecyclerView.Adapter<NewsFeedViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsFeedViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_news_container, parent, false)
        return NewsFeedViewHolder(view, recyclerViewClickListener)
    }

    override fun onBindViewHolder(holder: NewsFeedViewHolder, position: Int) {

        val newsDataItem = dataModelList[position]
        holder.setData(newsDataItem)
    }

    override fun getItemCount(): Int {
        return dataModelList.size
    }

    fun updateNewsFeedList(dataModelList: List<DataModel>) {
        this.dataModelList = dataModelList
        notifyDataSetChanged()
    }

}