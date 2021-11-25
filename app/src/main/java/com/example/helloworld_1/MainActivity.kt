package com.example.helloworld_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val msg = "Hello, we will perform the basic calculations"
        Log.d("MainActivity", msg)

        val op = listOf("+", "-", "*", "/")

        for (item in op) {
            val result = calculate(item)
            Log.d("MainActivity", result)
        }
    }

    private fun calculate(op : String) : String {

        val num1 = 5
        val num2 = 25
        val sum: Int

        if (op == "+") {
            sum = num1 + num2
        } else if (op == "-") {
            sum = num1 - num2
        } else if (op == "*"){
            sum = num1 * num2
        } else {
            sum = num1 / num2
        }

        return "$num1 $op $num2 = $sum "
    }
}