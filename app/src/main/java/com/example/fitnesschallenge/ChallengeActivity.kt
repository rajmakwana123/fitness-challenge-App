package com.example.fitnesschallenge

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class ChallengeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_challenge)

        val challengeName = findViewById<EditText>(R.id.editChallengeName)
        val btnSetChallenge = findViewById<Button>(R.id.btnSetChallenge)

        btnSetChallenge.setOnClickListener {
            val name = challengeName.text.toString()

            // Placeholder for saving challenge data
            Toast.makeText(this, "Challenge Set: $name", Toast.LENGTH_SHORT).show()
        }
    }
}