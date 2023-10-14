package com.example.uts_papb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.uts_papb.databinding.ActivityPaymentBinding

class PaymentActivity : AppCompatActivity() {
    lateinit var binding: ActivityPaymentBinding

    companion object {
        const val EXTRA_TITLE = "title"
        const val EXTRA_BIOSKOP = "bioskop"
        const val EXTRA_KURSI = "kursi"
        const val EXTRA_PAYMENT = "payment"
        const val EXTRA_DATE = "date"
    }

    private val bioskop = arrayOf(
        "Ambarukmo Plaza XXI, Studio 1",
        "Pakuwon Mall CGV, Studio 2",
        "Jogja City Mall XXI, Studio 4",
        "Sleman City Hall XXI, Studio 1"
    )
    private val kursi = arrayOf(
        "Regular",
        "Premiere",
        "Velvet",
        "4DX",
        "IMAX 2D",
        "IMAX 3D"
    )
    private val payment = arrayOf(
        "BCA",
        "Mandiri",
        "BRI",
        "BNI",
        "BSI"
    )

    lateinit var selectedDate: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPaymentBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bek.setOnClickListener{
            finish()
        }

        val adapterBioskop = ArrayAdapter(
            this@PaymentActivity,
            android.R.layout.simple_spinner_dropdown_item, bioskop
        )
        val adapterKursi = ArrayAdapter(
            this@PaymentActivity,
            android.R.layout.simple_spinner_dropdown_item, kursi
        )
        val adapterPayment = ArrayAdapter(
            this@PaymentActivity,
            android.R.layout.simple_spinner_dropdown_item, payment
        )

        binding.spinnerBioskop.adapter = adapterBioskop
        binding.spinnerKursi.adapter = adapterKursi
        binding.spinnerPembayaran.adapter = adapterPayment

        binding.calendar.setOnDateChangeListener { _, year, month, dayOfMonth ->

            selectedDate = "$dayOfMonth/${month + 1}/$year"

        }

        val intentfromDetail = intent

        val title = intentfromDetail.getStringExtra(DetailActivity.EXTRA_TITLE)

        binding.order.setOnClickListener {
            val selectedBioskop = binding.spinnerBioskop.selectedItem.toString()
            val selectedKursi = binding.spinnerKursi.selectedItem.toString()
            val selectedPayment = binding.spinnerPembayaran.selectedItem.toString()


            val intentToOrder = Intent(this@PaymentActivity, OrderActivity::class.java)
            intentToOrder.putExtra(EXTRA_BIOSKOP, selectedBioskop)
            intentToOrder.putExtra(EXTRA_TITLE, title)
            intentToOrder.putExtra(EXTRA_KURSI, selectedKursi)
            intentToOrder.putExtra(EXTRA_PAYMENT, selectedPayment)
            intentToOrder.putExtra(EXTRA_DATE, selectedDate)

            startActivity(intentToOrder)


        }
    }
}
