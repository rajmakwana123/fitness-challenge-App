package com.example.fitnesschallenge

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ProgressActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_progress)

        val progressText = findViewById<TextView>(R.id.textProgress)

        // Placeholder progress data
        progressText.text = "You have completed 5 workouts this week!"
    }
}

