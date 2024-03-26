package com.example.rediexpress

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Onboarding4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding4)
    }

    fun onClickSkip(view: View){
        val intent = Intent(this, Holder::class.java)
        startActivity(intent)
    }

    fun onClickNext(view: View){
        val intent = Intent(this, OnBoarding3::class.java)
        startActivity(intent)
    }
}