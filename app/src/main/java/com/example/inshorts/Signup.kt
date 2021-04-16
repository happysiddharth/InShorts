package com.example.inshorts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.inshorts.util.SharedPreferencesHelder
import com.example.inshorts.views.SignUpActivity
import kotlinx.android.synthetic.main.activity_signup.*

class Signup : AppCompatActivity() {
    override fun onResume() {
        super.onResume()
        if (SharedPreferencesHelder.getStringFromPreference(applicationContext,"token")!=null){
            finish()
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)
        btnSignUpWithEmail.setOnClickListener(View.OnClickListener {
            val intent = Intent(this,SignUpActivity::class.java)
            startActivity(intent)
        })
    }
}