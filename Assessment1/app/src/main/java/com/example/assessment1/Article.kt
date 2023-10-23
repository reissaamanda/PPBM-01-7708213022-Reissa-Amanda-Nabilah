package com.example.assessment1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Article : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_article)

        val img_pindah= findViewById<ImageView>(R.id.imageview)

        img_pindah.setOnClickListener {
            val _intentPindah =
                Intent(this, Dashboard::class.java)

            startActivity(_intentPindah)
        }

        val img_pindah1= findViewById<ImageView>(R.id.imageview2)

        img_pindah1.setOnClickListener {
            val _intentPindah =
                Intent(this, Profile::class.java)

            startActivity(_intentPindah)
        }
    }
}