package com.example.fitnesschallenge

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val challengeText: TextView = findViewById(R.id.challengeText)
        val startButton: Button = findViewById(R.id.startButton)

        startButton.setOnClickListener {
            challengeText.text = "Challenge Started! Stay Active!"
        }
    }
}