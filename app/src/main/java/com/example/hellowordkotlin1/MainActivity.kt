package com.example.hellowordkotlin1

import androidx.appcompat.app.AppCompatActivity
import android.util.Log
import kotlin.math.log
import android.os.Bundle as Bundle1
import kotlin.io.println as ioPrintln

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle1?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var num1= 10
        var op = listOf<String>("+","-","*","/")
        var num2= 5

       if(op[0]=="+") {
            Log.d("MainActivity", " $num1 + $num2 = ${num1+num2}")
        }
        if(op[1]=="-") {
           Log.d("MainActivity", " $num1 - $num2 = ${num1-num2}")
       }
        if(op[2]=="*") {
           Log.d("MainActivity", " $num1 * $num2 = ${num1*num2}")
       }
       if(op[3]=="/")  {
           Log.d("MainActivity", " $num1 / $num2 = ${num1/num2}")
       }
        fun remainder (): Int {
            return num1%num2
        }
        Log.d("MainActivity", "onCreate() called with: remainder is  = ${remainder()}")
    }
}
