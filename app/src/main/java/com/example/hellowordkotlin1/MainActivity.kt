package com.example.hellowordkotlin1

import androidx.appcompat.app.AppCompatActivity
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import kotlin.math.log
import android.os.Bundle as Bundle1
import kotlin.io.println

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle1?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var num1= 10
        var num2= 5
        //var op = listOf<String>("+","-","*","/")
        val editText = findViewById<EditText>(R.id.edittext22)
        val  userInput = editText.text.toString()


       if(userInput=="+") {
            Log.d("MainActivity", " $num1 + $num2 = ${num1+num2}")

        }
        if(userInput=="-") {
           Log.d("MainActivity", " $num1 - $num2 = ${num1-num2}")
       }
        if(userInput=="*") {
           Log.d("MainActivity", " $num1 * $num2 = ${num1*num2}")
       }
       if(userInput=="/") {
           Log.d("MainActivity", " $num1 / $num2 = ${num1 / num2}")
       }

        fun remainder (): Int {
            return num1%num2
        }
        Log.d("MainActivity", "onCreate() called with: remainder is  = ${remainder()}")

}}

