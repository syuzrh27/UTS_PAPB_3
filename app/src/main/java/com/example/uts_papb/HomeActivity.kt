package com.example.uts_papb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.uts_papb.LoginActivity.Companion.EXTRA_USERNAME
import com.example.uts_papb.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding

    companion object {
        const val EXTRA_TITLE = "username"
        const val EXTRA_RATE = "rate"
        const val EXTRA_STORYLINE = "storyline"
        const val EXTRA_DIRECTOR = "director"
        const val EXTRA_GENRE1 = "genre1"
        const val EXTRA_GENRE2 = "genre2"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val intent = Intent()

        val exteUsername = intent.getStringExtra(EXTRA_USERNAME)

        lateinit var title : String
        lateinit var rate : String
        lateinit var storyLine : String
        lateinit var director : String

        binding.usernameId.text = exteUsername

        with(binding){

            val intentToDetail = Intent(this@HomeActivity, DetailActivity::class.java)
            val name = intent.getStringExtra(LoginActivity.EXTRA_USERNAME)

            usernameId.text = name


            img1.setOnClickListener{

                title = "ini judul satu"
                rate = "4"
                storyLine = "ini cerita Kontil"
                director = "Syujakon"

                intentToDetail.putExtra(EXTRA_TITLE,title.toString())
                intentToDetail.putExtra(EXTRA_RATE,rate.toString())
                intentToDetail.putExtra(EXTRA_STORYLINE,storyLine.toString())
                intentToDetail.putExtra(EXTRA_DIRECTOR,director.toString())

                startActivity(intentToDetail)
            }
        }

    }
}