package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("changes")
    }

    fun init() {
        println("first")
    }

    fun test() {
        println("second")
    }

    fun toddo() {

    }
}
