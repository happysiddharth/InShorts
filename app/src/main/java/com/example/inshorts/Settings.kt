package com.example.inshorts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_settings.*

class Settings : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)
        btnSignIn.setOnClickListener {

            val intent = Intent(this, Signup::class.java)
            startActivity(intent)

        }
        imBack.setOnClickListener {

            val intent = Intent(this, CategoryPage::class.java)
            startActivity(intent)

        }
    }
}