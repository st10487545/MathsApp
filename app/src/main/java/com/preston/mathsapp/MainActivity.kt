package com.preston.mathsapp

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }//code starts here
        val inputOne = findViewById<EditText>(R.id.edTnumberOne)
        val inputTwo = findViewById<EditText>(R.id.edTnumberTwo)
        val equal = findViewById<Button>(R.id.btnEqual)
        val tvAnswer = findViewById<TextView>(R.id.edTanswer)

        equal.setOnClickListener {
         val inputOneString = inputOne.text.toString()
         val inputTwoString = inputTwo.text.toString()
         val inputOneInt: Int

            //convert into number
         inputOneInt = inputOneString.toInt()
            val inputTwoInt: Int = inputTwoString.toInt()

         val Answer = inputOneInt + inputTwoInt
         tvAnswer.text= Answer.toString()
        }//end of equal.setOnClickListener
    }//end of onCreates
}