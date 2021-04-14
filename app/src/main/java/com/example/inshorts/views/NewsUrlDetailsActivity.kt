package com.example.inshorts.views

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import android.webkit.WebView
import android.webkit.WebViewClient
import com.example.inshorts.R
import kotlinx.android.synthetic.main.activity_news_url_details.*

class NewsUrlDetailsActivity : AppCompatActivity() {

    private var x1: Float? = null
    private var y1: Float? = null
    private var x2: Float? = null
    private var y2: Float? = null

    private var newsUrlLink: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news_url_details)

        val newsUrlIntent: Intent = intent
        newsUrlLink = newsUrlIntent.getStringExtra("newsUrl")

        webViewLeftSwipe.webViewClient = object : WebViewClient() {
            override fun shouldOverrideUrlLoading(view: WebView?, url: String?): Boolean {
                if (url != null) {
                    webViewLeftSwipe.loadUrl(url)
                }
                return false
            }
        }

        webViewLeftSwipe.settings.javaScriptEnabled = true
        webViewLeftSwipe.loadUrl(newsUrlLink!!)
    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        when (event?.action) {
            MotionEvent.ACTION_DOWN -> {
                x1 = event.x
                y1 = event.y
            }

            MotionEvent.ACTION_UP -> {
                x2 = event.x
                y2 = event.y

                if (x1!! < x2!!) {
                    val mainIntent = Intent(this, NewsFeedActivity::class.java)
                    startActivity(mainIntent)
                }
            }
        }
        return false
    }
}