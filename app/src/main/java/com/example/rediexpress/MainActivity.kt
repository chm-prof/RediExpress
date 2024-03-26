package com.example.rediexpress

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.example.rediexpress.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)
    }

    fun onClickSkip(view: View){
        val intent = Intent(this, Holder::class.java)
        startActivity(intent)
    }

    fun onClickNext(view: View){
        val intent = Intent(this, Onboarding4::class.java)
        startActivity(intent)
    }
}