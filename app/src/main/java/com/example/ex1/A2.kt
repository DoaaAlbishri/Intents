package com.example.ex1

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class A2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.a2)

        //get data from intent
        val intent = intent
        val name = intent.getStringExtra("Name")
        val location = intent.getStringExtra("Location")
        val mobile = intent.getStringExtra("Mobile")

        //textview
        val resultTv = findViewById<TextView>(R.id.textView2)
        //setText
        resultTv.text = "Name: "+name+"\nLocation: "+location+"\nMobile: "+mobile
    }
}