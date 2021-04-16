package com.example.inshorts.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.example.inshorts.R
import com.example.inshorts.clients.NewsMainFeedAllApiClient
import com.example.inshorts.models.SigupRequest
import com.example.inshorts.models.TokenResponse
import com.example.inshorts.network.Network
import kotlinx.android.synthetic.main.activity_sign_up.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        val newsFeedApiClient = Network.getInstance().create(NewsMainFeedAllApiClient::class.java)
        btnSignUp.setOnClickListener(
            View.OnClickListener {
                newsFeedApiClient.signup(SigupRequest(etUserName.text.toString(),etPassword.text.toString()))
                    .enqueue(object:Callback<TokenResponse>{
                        override fun onResponse(
                            call: Call<TokenResponse>,
                            response: Response<TokenResponse>
                        ) {
                            if(response.body()!=null){
                                Log.d("Sidd",response.body().toString())
                            }
                        }

                        override fun onFailure(call: Call<TokenResponse>, t: Throwable) {
                        }

                    })
            }
        )
    }
}