package com.example.jaredjantjies_st10456871_practicum

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.Scanner

class InputActivity : AppCompatActivity() {

    lateinit var NextButton: Button
    lateinit var ExitButton2: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_input)

        NextButton = findViewById<Button>(R.id.nextButton)
        ExitButton2 = findViewById<Button>(R.id.exitButton2)
        val scanner = Scanner(System.`in`)
        var minTemperatures = IntArray(7)
        var maxTemperatures = IntArray(7)
        //initialsise days of the week array
        val days = arrayOf<String>(
            "Monday",
            "Tuesday",
            "Wednesday",
            "Thursday",
            "Friday",
            "Saturday",
            "Sunday"
        )


        NextButton.setOnClickListener {
            // create the explicit intent
            val intent = Intent(this, DetailedActivity::class.java)

            // start your next activity
            startActivity(intent)

            ExitButton2.setOnClickListener {
                // exit the application
            }
        }

        // Input temperatures for each day
        for (i in days.indices) {
            println("Enter temperatures for ${days[i]}:")
            print("Minimum temperature: ")
            minTemperatures[i] = scanner.nextInt()
            print("Maximum temperature: ")
            maxTemperatures[i] = scanner.nextInt()
        }

    }
}