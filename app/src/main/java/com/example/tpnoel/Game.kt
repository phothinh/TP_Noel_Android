package com.example.tpnoel

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Game : AppCompatActivity() {

    private lateinit var buttonWin: Button
    private lateinit var buttonLoose: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.game)

        buttonWin = findViewById(R.id.button4)
        buttonWin.setOnClickListener{
            val intent1 = Intent(this, Win::class.java)
            startActivity(intent1)
        }

        buttonLoose = findViewById(R.id.button6)
        buttonLoose.setOnClickListener{
            val intent2 = Intent(this, Loose::class.java)
            startActivity(intent2)
        }

        Log.d("Game", "onCreate() method called" )
    }

    override fun onStart()
    {
        super.onStart()
        Log.d("Game", "onStart() method called" )
    }

    override fun onResume()
    {
        super.onResume()
        Log.d("Game", "onResume() method called" )
    }

    override fun onPause()
    {
        super.onPause()
        Log.d("Game", "onPause() method called" )
    }

    override fun onStop()
    {
        super.onStop()
        Log.d("Game", "onStop() method called" )
    }
}