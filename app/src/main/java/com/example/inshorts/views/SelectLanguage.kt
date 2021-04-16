package com.example.inshorts.views

import android.content.Intent
import android.os.Bundle
import android.view.MotionEvent
import androidx.appcompat.app.AppCompatActivity
import com.example.inshorts.CategoryPage
import com.example.inshorts.R
import kotlinx.android.synthetic.main.activity_select_language.*

class SelectLanguage : AppCompatActivity() {

    private var x1: Float? = null
    private var y1: Float? = null
    private var x2: Float? = null
    private var y2: Float? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_select_language)

        btnSelectEnglish.setOnClickListener {
            swipeUpText.text = "Swipe Up"
            swipeUpLanguage.setAnimation("arrow_swipe_up.json")
            swipeUpLanguage.playAnimation()

//            val categoryStart = Intent(this, CategoryPage::class.java)
//            startActivity(categoryStart)
        }

        btnSelectHindi.setOnClickListener {
            swipeUpText.text = "ऊपर स्वाइप करें"
            swipeUpLanguage.setAnimation("arrow_swipe_up.json")
            swipeUpLanguage.playAnimation()
            val intent = Intent(this, NewsFeedActivity::class.java)
            startActivity(intent)
        }

    }

    override fun onTouchEvent(ev: MotionEvent?): Boolean {
        when (ev?.action) {
            MotionEvent.ACTION_DOWN -> {
                x1 = ev.x
                y1 = ev.y
            }
            MotionEvent.ACTION_UP -> {
                x2 = ev.x
                y2 = ev.y

                if (x1!! < x2!!) {
                    val intent = Intent(this, CategoryPage::class.java)
                    startActivity(intent);
                }
            }
        }
        return false;
    }
}