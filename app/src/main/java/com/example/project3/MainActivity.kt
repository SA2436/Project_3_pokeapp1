package com.example.project3

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.button2)
        val button2 = findViewById<Button>(R.id.button)
        val button3 = findViewById<Button>(R.id.button3)
        val resultImage1 = findViewById<ImageView>(R.id.imageView2)
        val resultText1 = findViewById<TextView>(R.id.textView2)

        button.setOnClickListener(View.OnClickListener {
            resultImage1.setImageResource(R.drawable.redpoke)
            resultText1.setText("Charmander")
        })

        button2.setOnClickListener(View.OnClickListener {
            resultImage1.setImageResource(R.drawable.bluepoke)
            resultText1.setText("Squirtle")
        })

        button3.setOnClickListener(View.OnClickListener {
            resultImage1.setImageResource(R.drawable.greenpoke)
            resultText1.setText("Bulbasaur")
        })

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}