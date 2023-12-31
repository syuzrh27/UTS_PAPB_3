package com.example.uts_papb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.uts_papb.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_USERNAME = "username"
    }

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val intentToHome = Intent(this@LoginActivity, HomeActivity::class.java)

        with(binding) {
            started.setOnClickListener {
                val usernameTxt = username.text.toString()

                intentToHome.putExtra(EXTRA_USERNAME, usernameTxt)

                startActivity(intentToHome)
            }
        }
    }
}
