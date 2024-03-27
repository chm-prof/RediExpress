package com.example.rediexpress

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
    }

    fun onClickHome(view: View){
        val intent = Intent(this, Home::class.java)
        startActivity(intent)
    }

    fun onClickWalletProfile(view: View){
        val intent = Intent(this, Wallet::class.java)
        startActivity(intent)
    }
}