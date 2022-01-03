package com.example.tpnoel

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class WaitingRoom : AppCompatActivity() {

    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.waiting_room)

        button = findViewById(R.id.button3)
        button.setOnClickListener{
            val intent = Intent(this, WaitingRoomFull::class.java)
            startActivity(intent)
        }

        Log.d("WaitingRoom", "onCreate() method called" )
    }

    override fun onStart()
    {
        super.onStart()
        Log.d("WaitingRoom", "onStart() method called" )
    }

    override fun onResume()
    {
        super.onResume()
        Log.d("WaitingRoom", "onResume() method called" )
    }

    override fun onPause()
    {
        super.onPause()
        Log.d("WaitingRoom", "onPause() method called" )
    }

    override fun onStop()
    {
        super.onStop()
        Log.d("WaitingRoom", "onStop() method called" )
    }
}