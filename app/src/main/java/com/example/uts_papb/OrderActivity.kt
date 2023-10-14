package com.example.uts_papb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.uts_papb.databinding.ActivityOrderBinding

class OrderActivity : AppCompatActivity() {

    private lateinit var binding: ActivityOrderBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOrderBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val intentFromPayment = intent

        val bioskop = intentFromPayment.getStringExtra(PaymentActivity.EXTRA_BIOSKOP)
        val kursi = intentFromPayment.getStringExtra(PaymentActivity.EXTRA_KURSI)
        val payment = intentFromPayment.getStringExtra(PaymentActivity.EXTRA_PAYMENT)
        val date = intentFromPayment.getStringExtra(PaymentActivity.EXTRA_DATE)
        val title = intentFromPayment.getStringExtra(PaymentActivity.EXTRA_TITLE)

        with(binding) {
            bioskopId.text = bioskop
            kursiId.text = kursi
            pembayaranId.text = payment
            dateId.text = date
            titleId.text = title
        }

        binding.bek.setOnClickListener{
            finish()
        }
    }
}
