package com.jw.trainmepractice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Q5_trainer : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_q5_trainer)

        val button = findViewById<Button>(R.id.Q4_t_nextButton)
        button.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}