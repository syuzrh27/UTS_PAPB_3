package com.example.uts_papb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.uts_papb.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding

    companion object {
        const val EXTRA_TITLE = "title"
        const val EXTRA_RATE = "rate"
        const val EXTRA_STORYLINE = "storyline"
        const val EXTRA_DIRECTOR = "director"
        const val EXTRA_GENRE1 = "genre1"
        const val EXTRA_GENRE2 = "genre2"
        const val EXTRA_USERNAME = "username"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val intentFromLogin = intent
        val exteUsername = intentFromLogin.getStringExtra(EXTRA_USERNAME)

        binding.usernameId.text = exteUsername

        with(binding) {
            val intentToDetail = Intent(this@HomeActivity, DetailActivity::class.java)

            img1.setOnClickListener {
                // Set data film
                val title = "The Conjuring"
                val rate = "3.,8"
                val storyLine = "Paranormal investigators Ed and Lorraine Warren work to help a family terrorized by an evil presence in their home."
                val director = "James Wan"

                // Put extra data to intent
                intentToDetail.putExtra(EXTRA_TITLE, title)
                intentToDetail.putExtra(EXTRA_RATE, rate)
                intentToDetail.putExtra(EXTRA_STORYLINE, storyLine)
                intentToDetail.putExtra(EXTRA_DIRECTOR, director)
                intentToDetail.putExtra(EXTRA_USERNAME, exteUsername)

                // Start DetailActivity
                startActivity(intentToDetail)
            }
            img2.setOnClickListener {
                // Set data film
                val title = "A Nightmare on Elm Street"
                val rate = "3,8"
                val storyLine = "A hitman with a unique characteristic—attacking young people through their dreams."
                val director = "Wes Craven"

                // Put extra data to intent
                intentToDetail.putExtra(EXTRA_TITLE, title)
                intentToDetail.putExtra(EXTRA_RATE, rate)
                intentToDetail.putExtra(EXTRA_STORYLINE, storyLine)
                intentToDetail.putExtra(EXTRA_DIRECTOR, director)
                intentToDetail.putExtra(EXTRA_USERNAME, exteUsername)

                // Start DetailActivity
                startActivity(intentToDetail)
            }
            img3.setOnClickListener {
                // Set data film
                val title = "Get Out"
                val rate = "3,9"
                val storyLine = "An African American man visits his white girlfriend's family, where dark mysteries and hypnotism reveal horrifying racial fears."
                val director = "Jordan Peele"

                // Put extra data to intent
                intentToDetail.putExtra(EXTRA_TITLE, title)
                intentToDetail.putExtra(EXTRA_RATE, rate)
                intentToDetail.putExtra(EXTRA_STORYLINE, storyLine)
                intentToDetail.putExtra(EXTRA_DIRECTOR, director)
                intentToDetail.putExtra(EXTRA_USERNAME, exteUsername)

                // Start DetailActivity
                startActivity(intentToDetail)
            }
            img4.setOnClickListener {
                // Set data film
                val title = "Psycho"
                val rate = "4,3"
                val storyLine = "A secretary embezzles money from her employer and goes on the run, checking into a remote motel run by a disturbed innkeeper."
                val director = "Alfred Hitchcock"

                // Put extra data to intent
                intentToDetail.putExtra(EXTRA_TITLE, title)
                intentToDetail.putExtra(EXTRA_RATE, rate)
                intentToDetail.putExtra(EXTRA_STORYLINE, storyLine)
                intentToDetail.putExtra(EXTRA_DIRECTOR, director)
                intentToDetail.putExtra(EXTRA_USERNAME, exteUsername)

                // Start DetailActivity
                startActivity(intentToDetail)
            }
            img5.setOnClickListener {
                // Set data film
                val title = "The Shining"
                val rate = "4,2"
                val storyLine = "A writer and his family stay in an isolated hotel during the winter, where terrifying supernatural presences begin to haunt them."
                val director = "Stanley Kubrick"

                // Put extra data to intent
                intentToDetail.putExtra(EXTRA_TITLE, title)
                intentToDetail.putExtra(EXTRA_RATE, rate)
                intentToDetail.putExtra(EXTRA_STORYLINE, storyLine)
                intentToDetail.putExtra(EXTRA_DIRECTOR, director)
                intentToDetail.putExtra(EXTRA_USERNAME, exteUsername)

                // Start DetailActivity
                startActivity(intentToDetail)
            }
            img6.setOnClickListener {
                // Set data film
                val title = "The Exorcist"
                val rate = "4"
                val storyLine = "A young girl is suspected to be possessed by a demon, and a Catholic priest attempts an exorcism to save her."
                val director = "William Friedkin"

                // Put extra data to intent
                intentToDetail.putExtra(EXTRA_TITLE, title)
                intentToDetail.putExtra(EXTRA_RATE, rate)
                intentToDetail.putExtra(EXTRA_STORYLINE, storyLine)
                intentToDetail.putExtra(EXTRA_DIRECTOR, director)
                intentToDetail.putExtra(EXTRA_USERNAME, exteUsername)

                // Start DetailActivity
                startActivity(intentToDetail)
            }
        }
    }
}
