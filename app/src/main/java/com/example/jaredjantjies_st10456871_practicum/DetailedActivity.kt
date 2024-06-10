package com.example.jaredjantjies_st10456871_practicum

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class DetailedActivity : AppCompatActivity() {

    lateinit var BackButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detailed_table)

        BackButton = findViewById<Button>(R.id.backButton)

        BackButton.setOnClickListener {
            // create the explicit intent
            val intent = Intent(this, InputActivity::class.java)

            // start your next activity
            startActivity(intent)
        }

    }

}