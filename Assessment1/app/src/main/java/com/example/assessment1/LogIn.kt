package com.example.assessment1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class LogIn : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_in)

        val btn_pindah= findViewById<Button>(R.id.btn_login)

        btn_pindah.setOnClickListener {
            val _intentPindah =
                Intent(this, Dashboard::class.java)

            startActivity(_intentPindah)
        }

        val text_pindah= findViewById<TextView>(R.id.text_signup)

        text_pindah.setOnClickListener {
            val _intentPindahText =
                Intent(this, Registrasi::class.java)

            startActivity(_intentPindahText)
        }
    }
}