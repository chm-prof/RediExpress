package com.example.rediexpress

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Wallet : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wallet)
    }

    fun onClickHomeWallet(view: View){
        val intent = Intent(this, Home::class.java)
        startActivity(intent)
    }

    fun onClickProfileWallet(view: View){
        val intent = Intent(this, Profile::class.java)
        startActivity(intent)
    }
}