package com.example.demo

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menu)
        val f1 = findViewById<ImageButton>(R.id.f1)
        val f2 = findViewById<ImageButton>(R.id.imageButton8)
        val f3 = findViewById<ImageButton>(R.id.imageButton9)
        val f4 = findViewById<ImageButton>(R.id.imageButton10)
        val f5 = findViewById<ImageButton>(R.id.imageButton11)
        val f6 = findViewById<ImageButton>(R.id.imageButton12)
        val f7 = findViewById<ImageButton>(R.id.imageButton13)
        val f8 = findViewById<ImageButton>(R.id.imageButton14)

        // Set click listeners and display toast messages
        f1.setOnClickListener {
            Toast.makeText(this, "Flower 1 is selected", Toast.LENGTH_SHORT).show()
            var i=Intent(this,yeah::class.java)
            startActivity(i)
        }

        f2.setOnClickListener {
            Toast.makeText(this, "Flower 2 is selected", Toast.LENGTH_SHORT).show()
            var i=Intent(this,yeah::class.java)
            startActivity(i)
        }

        f3.setOnClickListener {
            Toast.makeText(this, "Flower 3 is selected", Toast.LENGTH_SHORT).show()
            var i=Intent(this,yeah::class.java)
            startActivity(i)
        }

        f4.setOnClickListener {
            Toast.makeText(this, "Flower 4 is selected", Toast.LENGTH_SHORT).show()
            var i=Intent(this,yeah::class.java)
            startActivity(i)
        }
        f5.setOnClickListener {
            Toast.makeText(this, "Flower 7 is selected", Toast.LENGTH_SHORT).show()
            var i=Intent(this,yeah::class.java)
            startActivity(i)
        }
        f6.setOnClickListener {
            Toast.makeText(this, "Flower 5 is selected", Toast.LENGTH_SHORT).show()
            var i=Intent(this,yeah::class.java)
            startActivity(i)
        }
        f7.setOnClickListener {
            Toast.makeText(this, "Flower 6 is selected", Toast.LENGTH_SHORT).show()
            var i=Intent(this,yeah::class.java)
            startActivity(i)
        }
        f8.setOnClickListener {
            Toast.makeText(this, "Flower 8 is selected", Toast.LENGTH_SHORT).show()
            var i=Intent(this,yeah::class.java)
            startActivity(i)
        }


    }
}