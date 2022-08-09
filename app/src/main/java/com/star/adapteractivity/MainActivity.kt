package com.star.adapteractivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {

    var arrayList:ArrayList<Adapter> = ArrayList()
    lateinit var adapter:BaseAdapterClass
    lateinit var listView:ListView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        listView = findViewById(R.id.listView)
        arrayList.add(Adapter(1,1001,"Sukh"))
                arrayList.add(Adapter(2,1002,"Reetika"))
                arrayList.add(Adapter(3,1003,"Jaspreet"))
        arrayList.add(Adapter(4,1004,"Nandani"))


        adapter = BaseAdapterClass(this, arrayList)
        listView.adapter = adapter

    }
}