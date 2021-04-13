package com.example.inshorts.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import com.example.inshorts.R
import kotlinx.android.synthetic.main.activity_select_language.*

class SelectLanguage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_select_language)

        btnSelectEnglish.setOnClickListener {
            swipeUpText.text="Swipe Up"
            swipeUpLanguage.setAnimation("arrow_swipe_up.json")
            swipeUpLanguage.playAnimation()
        }
        
        btnSelectHindi.setOnClickListener {
            swipeUpText.text="ऊपर स्वाइप करें"
            swipeUpLanguage.setAnimation("arrow_swipe_up.json")
            swipeUpLanguage.playAnimation()
        }
    }
}