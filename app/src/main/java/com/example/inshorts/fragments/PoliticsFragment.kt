package com.example.inshorts.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.inshorts.R
import com.example.inshorts.adapters.NewsFeedAdapter
import com.example.inshorts.clients.NewsMainFeedAllApiClient
import com.example.inshorts.listeners.RecyclerViewClickListener
import com.example.inshorts.models.DataModel
import com.example.inshorts.models.ResponseModel
import com.example.inshorts.network.Network
import kotlinx.android.synthetic.main.fragment_auto_moblie.*
import kotlinx.android.synthetic.main.fragment_politics2.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class PoliticsFragment : Fragment(), RecyclerViewClickListener {

    private lateinit var newsFeedAdapter: NewsFeedAdapter
    private val dataModelList = emptyList<DataModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_politics2, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setRecyclerData()
        flPolitics.visibility = View.VISIBLE
        callAutoApi()

    }

    private fun callAutoApi() {
        val politics = "politics"
        val autoClient = Network.getInstance().create(NewsMainFeedAllApiClient::class.java)
        val call = autoClient.getNewsAllMainData(politics)
        call.enqueue(object : Callback<ResponseModel> {
            override fun onResponse(call: Call<ResponseModel>, response: Response<ResponseModel>) {
                response.body().let {
                    flPolitics.visibility = View.GONE
                    newsFeedAdapter.updateNewsFeedList(it?.data as List<DataModel>)
                }
            }

            override fun onFailure(call: Call<ResponseModel>, t: Throwable) {
                flPolitics.visibility = View.GONE
            }

        })
    }

    private fun setRecyclerData() {
        newsFeedAdapter = NewsFeedAdapter(dataModelList, this)
        val linearLayoutManager = LinearLayoutManager(context)
        politicsRecyclerView.apply {
            layoutManager = linearLayoutManager
            adapter = newsFeedAdapter
        }
    }


    override fun onReadMoreIsClicked(position: Int, dataModel: DataModel) {
        TODO("Not yet implemented")
    }

}