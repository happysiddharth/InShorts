package com.example.inshorts.listeners

import com.example.inshorts.models.DataModel

interface RecyclerViewClickListener {
    fun onReadMoreIsClicked(position: Int, dataModel: DataModel)
}