package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.style.BackgroundColorSpan
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout


// This Kotlin file is where we're going to be handling user interaction
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Show this layout file: activity_main
        setContentView(R.layout.activity_main)

        // User can tap a button to change the text color of the label.
        // 1. Add a button to our layout


        /**
         Change text color button
         */
        // Get a reference to button
        // 2. Set up logical to know when user has tapped on button
        findViewById<Button>(R.id.buttonTextColor).setOnClickListener {
            // Handles button tap
            // 2. Change the color of the text
            Log.i("Sam", "Button is Working")
            // 1. Get a reference to the text view
            // 2. Set the color fo the text view
            findViewById<TextView>(R.id.textView).setTextColor(getResources().getColor(R.color.red))
        }

        /**
         Change view color button
         */
        findViewById<Button>(R.id.buttonViewColor).setOnClickListener {
            Log.i("Sam", "Button is Working")
            findViewById<ConstraintLayout>(R.id.background).setBackgroundColor(getResources().getColor(R.color.green))
        }
    }
}