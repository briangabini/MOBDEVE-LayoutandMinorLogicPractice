package com.bgmobdeve.layoutandminorlogicpractice

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        window.statusBarColor = getColor(R.color.purple2)

        val fab = findViewById<FloatingActionButton>(R.id.fab)
        val fab2 = findViewById<FloatingActionButton>(R.id.fab2)

        fab.setOnClickListener {
            Toast.makeText(this, "Adding S15...", Toast.LENGTH_SHORT).show()
        }

        fab2.setOnClickListener {
            Toast.makeText(this, "Adding S16...", Toast.LENGTH_SHORT).show()
        }
    }
}