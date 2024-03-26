package com.example.rediexpress

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SignUp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
    }

    fun OnClickSignIn(view: View){
        val intent = Intent(this, LogIn::class.java)
        startActivity(intent)
    }

    fun onClickSignUp(view: View){
        val intent = Intent(this, LogIn::class.java)
        startActivity(intent)
    }
}