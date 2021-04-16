package com.example.inshorts

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_layout.view.*


class PicksAdapter(private  val TopPicsList: List<DataClass>) : RecyclerView.Adapter<PicksAdapter.PicksViewHolder>() {

    class PicksViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val IVimageView : ImageView = itemView.ivTopPicks
        val TvtextView : TextView = itemView.tvtitle
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PicksViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_layout,
            parent,false)
        return PicksViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: PicksViewHolder, position: Int) {

        val currentItem = TopPicsList[position]
        holder.IVimageView.setImageResource(currentItem.image)
        holder.TvtextView.text = currentItem.title
    }

    override fun getItemCount() = TopPicsList.size
}
