package com.example.tpnoel

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Win : AppCompatActivity() {

    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.winner)

        button = findViewById(R.id.button)
        button.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        Log.d("Win", "onCreate() method called" )
    }

    override fun onStart()
    {
        super.onStart()
        Log.d("Win", "onStart() method called" )
    }

    override fun onResume()
    {
        super.onResume()
        Log.d("Win", "onResume() method called" )
    }

    override fun onPause()
    {
        super.onPause()
        Log.d("Win", "onPause() method called" )
    }

    override fun onStop()
    {
        super.onStop()
        Log.d("Win", "onStop() method called" )
    }
}