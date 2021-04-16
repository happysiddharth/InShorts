package com.example.inshorts.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.inshorts.R
import com.example.inshorts.clients.NewsMainFeedAllApiClient
import com.example.inshorts.models.ResponseModel
import com.example.inshorts.network.Network
import com.example.inshorts.viewpagers.ViewPagerAdapter
import kotlinx.android.synthetic.main.activity_news_feed.*
import kotlinx.android.synthetic.main.fragment_science.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class NewsFeedActivity : AppCompatActivity() {

    private var sliderItemContent = mutableListOf<SliderItemContent>()
    private val title = ArrayList<String>()
    private val content = ArrayList<String>()
    private val imageUrl = ArrayList<String>()
    private val readMoreUrl = ArrayList<String>()
    private val url = ArrayList<String>()
    private val time = ArrayList<String>()
    private val date = ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news_feed)

        flNewsFeed.visibility = View.VISIBLE
        callNewsMainFeedApi()

    }

    private fun callNewsMainFeedApi() {
        val all = "all"
        val newsFeedApiClient = Network.getInstance().create(NewsMainFeedAllApiClient::class.java)
        val call = newsFeedApiClient.getNewsAllMainData(all)
        call.enqueue(object : Callback<ResponseModel>{
            override fun onResponse(call: Call<ResponseModel>, response: Response<ResponseModel>) {
                response.body()?.let {
                    for (i in it.data?.indices!!){
                        title.add(it.data[i]?.title.toString())
                        content.add(it.data[i]?.content.toString())
                        imageUrl.add(it.data[i]?.imageUrl.toString())
                        readMoreUrl.add(it.data[i]?.readMoreUrl.toString())
                        url.add(it.data[i]?.url.toString())
                    }

                    for (i in 0 until imageUrl.size){
                        sliderItemContent.add(SliderItemContent(imageUrl[i]))
                    }
                    flNewsFeed.visibility = View.GONE
                    verticalViewPager.adapter = ViewPagerAdapter(this@NewsFeedActivity,sliderItemContent, title, content, imageUrl, readMoreUrl, url, date, time, verticalViewPager)
                }
            }
            override fun onFailure(call: Call<ResponseModel>, t: Throwable) {
            }
        })
    }

}