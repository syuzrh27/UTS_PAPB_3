package com.example.uts_papb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.uts_papb.databinding.ActivityDetailBinding
import com.example.uts_papb.databinding.ActivityHomeBinding

class DetailActivity : AppCompatActivity() {
        lateinit var binding: ActivityDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val intent = Intent()
        val intentToPayment = Intent(this@DetailActivity, HomeActivity::class.java)

        val title = intent.getStringExtra(HomeActivity.EXTRA_TITLE)
        val rate = intent.getStringExtra(HomeActivity.EXTRA_RATE)
        val storyLine = intent.getStringExtra(HomeActivity.EXTRA_STORYLINE)
        val director = intent.getStringExtra(HomeActivity.EXTRA_DIRECTOR)

        with(binding){

            titleId.text = title
            rateId.text = rate
            storyLineId.text = storyLine
            dorectorId.text = director

        }
    }
}