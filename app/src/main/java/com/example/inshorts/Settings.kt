package com.example.inshorts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.inshorts.util.SharedPreferencesHelder
import kotlinx.android.synthetic.main.activity_settings.*

class Settings : AppCompatActivity() {
    override fun onResume() {
        super.onResume()
        if (SharedPreferencesHelder.getStringFromPreference(applicationContext,"token")!=null){
            tvSignedInUser.text = SharedPreferencesHelder.getStringFromPreference(applicationContext,"user")
            rlAfterSignIn.visibility = View.VISIBLE
            rlBeforesignIn.visibility = View.GONE
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)
        btnSignout.setOnClickListener(View.OnClickListener {
            SharedPreferencesHelder.writeStringToPreference(applicationContext,"token",null)
            SharedPreferencesHelder.writeStringToPreference(applicationContext,"user",null)
            rlAfterSignIn.visibility = View.GONE
            rlBeforesignIn.visibility = View.VISIBLE
        })
        btnSignIn.setOnClickListener {

            val intent = Intent(this, Signup::class.java)
            startActivity(intent)

        }
        imBack.setOnClickListener {
            val intent = Intent(this, CategoryPage::class.java)
            startActivity(intent)
        }
        btnShareApp.setOnClickListener {
            val myIntent = Intent(Intent.ACTION_SEND)
            myIntent.setType("text/plain")
            val sharesub = "Check out inshorts app. I found it best for reading news.\n" +
                    "http://inshorts.com/mobile"
            val shareBody = "Check out inshorts app. I found it best for reading news.\n" +
                    "http://inshorts.com/mobile"
            myIntent.putExtra(Intent.EXTRA_SUBJECT, sharesub)
            myIntent.putExtra(Intent.EXTRA_TEXT, shareBody)
            startActivity(Intent.createChooser(myIntent, "Share Using"))


        }
    }
}