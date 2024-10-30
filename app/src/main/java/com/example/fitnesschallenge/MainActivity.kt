package com.example.fitnesschallenge

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnLogWorkout = findViewById<Button>(R.id.btnLogWorkout)
        val btnSetChallenge = findViewById<Button>(R.id.btnSetChallenge)
        val btnViewProgress = findViewById<Button>(R.id.btnViewProgress)

        btnLogWorkout.setOnClickListener {
            startActivity(Intent(this, WorkoutActivity::class.java))
        }

        btnSetChallenge.setOnClickListener {
            startActivity(Intent(this, ChallengeActivity::class.java))
        }

        btnViewProgress.setOnClickListener {
            startActivity(Intent(this, ProgressActivity::class.java))
        }
    }
}