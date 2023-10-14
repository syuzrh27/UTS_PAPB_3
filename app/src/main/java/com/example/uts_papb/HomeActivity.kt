package com.example.uts_papb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.uts_papb.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding

    companion object {
        const val EXTRA_TITLE = "name"
        const val EXTRA_RATE = "cWeight"
        const val EXTRA_STORYLINE = "cWeightSatuan"
        const val EXTRA_TARGET_WEIGHT = "tWeight"
        const val EXTRA_TARGET_WEIGHT_SATUAN = "tWeightSatuan"
        const val EXTRA_CALORIES = "calories"
        const val EXTRA_GOALS = "goals"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityHomeBinding.inflate(layoutInflater)

        setContentView(binding.root)

        val intent = Intent()

        val exteUsername = intent.getStringExtra(LoginActivity.EXTRA_USERNAME)


        with(binding){

            username.text = exteUsername

            img1.setOnClickListener{

                val mainIntent = Intent(this@HomeActivity, DetailActivity::class.java)

            }
        }

    }
}