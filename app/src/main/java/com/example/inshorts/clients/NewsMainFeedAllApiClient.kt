package com.example.inshorts.clients

import com.example.inshorts.models.ResponseModel
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface NewsMainFeedAllApiClient {

    @GET("/news")
    fun getNewsAllMainData(@Query("category") category: String): Call<ResponseModel>

}