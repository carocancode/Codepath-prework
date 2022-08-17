package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView


// This Kotlin file is where we're going to be handling
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // show this layoutfile: activity_main
        setContentView(R.layout.activity_main)

        // Display customized to show 'Hello from {name}'

        // 1. add button
        // Get a reference for button
        // 2. set up logic when user has tapped on button
        findViewById<Button>(R.id.button).setOnClickListener {
            // Handle button tap
            // 3. change color of text
            Log.i("Caro", "Tapped on button")
                // Get a reference of text view
            // set color of reference view
            findViewById<TextView>(R.id.textView).setTextColor(getResources().getColor(R.color.white))
        }


    }
}