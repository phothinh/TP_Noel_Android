package com.example.tpnoel

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class WaitingRoomFull : AppCompatActivity() {

    lateinit var listView : ListView
    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.waiting_room_full)

        button = findViewById(R.id.button3)
        button.setOnClickListener{
            val intent = Intent(this, Game::class.java)
            startActivity(intent)
        }

        listView = findViewById(R.id.ListeView)
        var list = mutableListOf<Model>()

        list.add(Model("Henri (Me)",   "WAITING"))
        list.add(Model("Gauthier",   "READY" ))
        list.add(Model("Emma", "READY" ))
        list.add(Model("Autre",  "WAITING" ))

        listView.adapter = MyListAdapter(this,R.layout.joueur,list)

        listView.setOnItemClickListener{parent, view, position, id ->

            if (position==0){
                Toast.makeText(this@WaitingRoomFull, "Item One",   Toast.LENGTH_SHORT).show()
            }
            if (position==1){
                Toast.makeText(this@WaitingRoomFull, "Item Two",   Toast.LENGTH_SHORT).show()
            }
            if (position==2){
                Toast.makeText(this@WaitingRoomFull, "Item Three", Toast.LENGTH_SHORT).show()
            }
            if (position==3){
                Toast.makeText(this@WaitingRoomFull, "Item Four",  Toast.LENGTH_SHORT).show()
            }
            if (position==4){
                Toast.makeText(this@WaitingRoomFull, "Item Five",  Toast.LENGTH_SHORT).show()
            }
        }

        Log.d("WaitingRoomFull", "onCreate() method called" )
    }

    override fun onStart()
    {
        super.onStart()
        Log.d("WaitingRoomFull", "onStart() method called" )
    }

    override fun onResume()
    {
        super.onResume()
        Log.d("WaitingRoomFull", "onResume() method called" )
    }

    override fun onPause()
    {
        super.onPause()
        Log.d("WaitingRoomFull", "onPause() method called" )
    }

    override fun onStop()
    {
        super.onStop()
        Log.d("WaitingRoomFull", "onStop() method called" )
    }
}