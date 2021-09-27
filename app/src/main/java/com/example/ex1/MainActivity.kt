package com.example.ex1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
/*
const val NAME = "com.example.ex1.MESSAGE"
const val LOCATION = "com.example.ex1.MESSAGE"
const val MOBILE = "com.example.ex1.MESSAGE"
*/

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnToast = findViewById<Button>(R.id.button)
        var btnTv = findViewById<Button>(R.id.button2)
        var btnA2 = findViewById<Button>(R.id.button3)

        var ETname = findViewById<EditText>(R.id.name)
        var ETlocation = findViewById<EditText>(R.id.location)
        var ETmobile = findViewById<EditText>(R.id.mobile)

        var Tv = findViewById<TextView>(R.id.textView)




        btnToast.setOnClickListener {
            var name = ETname.text.toString()
            var location = ETlocation.text.toString()
            var mobile = ETmobile.text.toString()
            val toast = Toast.makeText(applicationContext, "name:${name}\nlocation:${location} \nmobile:${mobile}", Toast.LENGTH_LONG)
            toast.show()
        }

        btnTv.setOnClickListener {
            var name = ETname.text.toString()
            var location = ETlocation.text.toString()
            var mobile = ETmobile.text.toString()
         Tv.setText("name:${name}\nlocation:${location}\nmobile:${mobile}")
        }

        btnA2.setOnClickListener {
            //get text from edittexts
            val name = ETname.text.toString()
            val location = ETlocation.text.toString()
            val mobile = ETmobile.text.toString()

            //intent to start activity
            val intent = Intent(this@MainActivity, A2::class.java)
            intent.putExtra("Name", name)
            intent.putExtra("Location", location)
            intent.putExtra("Mobile", mobile)
            startActivity(intent)

        }
        }


    }
