package com.example.tpnoel
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.example.tpnoel.R

class MyListAdapter(var mCtx:Context , var resource:Int,var items:List<Model>)
    :ArrayAdapter<Model>( mCtx , resource , items ){




    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val layoutInflater :LayoutInflater = LayoutInflater.from(mCtx)

        val view : View = layoutInflater.inflate(resource , null )
        var textView : TextView = view.findViewById(R.id.titleTv)
        var textView1 : TextView = view.findViewById(R.id.descTv)


        var person : Model = items[position]

        textView.text = person.title
        textView1.text = person.desc


        return view
    }

}