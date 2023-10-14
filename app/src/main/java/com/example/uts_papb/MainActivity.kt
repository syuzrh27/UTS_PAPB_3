package com.example.uts_papb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.uts_papb.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Simulate a delay (e.g., 2000 milliseconds) using a handler
        val splashDuration = 2000L
        val intent = Intent(this, LoginActivity::class.java)

        val handler = android.os.Handler()
        handler.postDelayed({
            startActivity(intent)
            finish()
        }, splashDuration)
    }}