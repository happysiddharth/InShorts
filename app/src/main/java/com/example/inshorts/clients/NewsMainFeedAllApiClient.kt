package com.example.inshorts.clients

import com.example.inshorts.models.ResponseModel
import com.example.inshorts.models.SigupRequest
import com.example.inshorts.models.TokenResponse
import retrofit2.Call
import retrofit2.http.*

interface NewsMainFeedAllApiClient {

    @GET("/news")
    fun getNewsAllMainData(@Query("category") category: String): Call<ResponseModel>

    @POST("/signup")
    fun signup(@Body sigupRequest: SigupRequest):Call<TokenResponse>

}