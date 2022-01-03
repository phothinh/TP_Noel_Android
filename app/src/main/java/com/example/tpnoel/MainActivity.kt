package com.example.tpnoel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var button:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.button)
        button.setOnClickListener{
            val intent = Intent(this, WaitingRoom::class.java)
            startActivity(intent)
        }
        Log.d("Login", "onCreate() method called" )
    }

    override fun onStart()
    {
        super.onStart()
        Log.d("Login", "onStart() method called" )
    }

    override fun onResume()
    {
        super.onResume()
        Log.d("Login", "onResume() method called" )
    }

    override fun onPause()
    {
        super.onPause()
        Log.d("Login", "onPause() method called" )
    }

    override fun onStop()
    {
        super.onStop()
        Log.d("Login", "onStop() method called" )
    }
}

