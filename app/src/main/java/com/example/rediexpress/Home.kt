package com.example.rediexpress

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
    }

    fun onClickProfile(view: View){
        val intent = Intent(this, Profile::class.java)
        startActivity(intent)
    }

    fun onClickWalletHome(view: View){
        val intent = Intent(this, Wallet::class.java)
        startActivity(intent)
    }

    fun onClickChatsHome(view: View){
        val intent = Intent(this, Chats::class.java)
        startActivity(intent)
    }
}