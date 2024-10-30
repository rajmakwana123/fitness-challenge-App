package com.example.fitnesschallenge


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class WorkoutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_workout)

        val workoutName = findViewById<EditText>(R.id.editWorkoutName)
        val workoutDuration = findViewById<EditText>(R.id.editWorkoutDuration)
        val btnSaveWorkout = findViewById<Button>(R.id.btnSaveWorkout)

        btnSaveWorkout.setOnClickListener {
            val name = workoutName.text.toString()
            val duration = workoutDuration.text.toString()

            // Placeholder for saving workout data
            Toast.makeText(this, "Workout Saved: $name for $duration mins", Toast.LENGTH_SHORT).show()
        }
    }
}