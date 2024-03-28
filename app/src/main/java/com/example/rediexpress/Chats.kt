package com.example.rediexpress

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class Chats : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chats)
    }

    fun onClick(view: View){
        val intent = Intent(this, Home::class.java)
        startActivity(intent)
    }

    fun onClickRiderChats(view: View){
        val intent = Intent(this, ChatRider::class.java)
        startActivity(intent)
    }
}