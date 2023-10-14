package com.example.uts_papb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.uts_papb.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailBinding

    companion object{
        const val EXTRA_TITLE = "title"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bek.setOnClickListener{
            finish()
        }

        val intentFromHome = intent

        // Mengambil data dari Intent yang dikirim dari HomeActivity
        val title = intentFromHome.getStringExtra(HomeActivity.EXTRA_TITLE)
        val rate = intentFromHome.getStringExtra(HomeActivity.EXTRA_RATE)
        val storyLine = intentFromHome.getStringExtra(HomeActivity.EXTRA_STORYLINE)
        val director = intentFromHome.getStringExtra(HomeActivity.EXTRA_DIRECTOR)

        with(binding) {
            // Menetapkan data ke tampilan TextView di layout
            titleId.text = title
            rateId.text = rate
            storyLineId.text = storyLine
            directorId.text = director

            // Menetapkan ClickListener untuk tombol lanjut ke PaymentActivity
            getticket.setOnClickListener {
                val intentToPayment = Intent(this@DetailActivity, PaymentActivity::class.java)

                intentToPayment.putExtra(EXTRA_TITLE,title)

                // Mengirim data tambahan ke PaymentActivity jika diperlukan
                // Contoh: intentToPayment.putExtra("KEY", "VALUE")

                startActivity(intentToPayment)
            }

        }
    }
}