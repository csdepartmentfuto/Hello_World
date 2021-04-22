package com.example.android.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    // The given number
    var number: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    // Increases the count of the given number by 1
    fun increment(view: View) {
        number += 1
        display(number)
    }

    /**
     * This method displays the given [number] on the screen
     */
    private fun display(number: Int) {
        val numberView = findViewById<TextView>(R.id.number)
        numberView.setText("$number")
    }
}