package com.example.diceroller

import android.os.Bundle
import android.widget.TextView
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnRoll : Button = findViewById<Button>(R.id.Roll_Button)

        btnRoll.setOnClickListener(){

            val randomInt = (1..6).random()

            val tvResult : TextView = findViewById<TextView>(R.id.Result_TextView)

            tvResult.text = randomInt.toString()
        }


    }
}