package com.example.inshorts.clients

import com.example.inshorts.models.ResponseModel
import retrofit2.Call
import retrofit2.http.GET

interface NewsMainFeedAllApiClient {
    @GET("/news?category=cricket")
    fun getNewsAllMainData(): Call<ResponseModel>
}