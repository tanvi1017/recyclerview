package com.tanvi.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView = findViewById(R.id.recyclerView)
        //1. layoutmanager

        recyclerView.layoutManager = LinearLayoutManager(this)
        //2. adapter
        val list = 1.rangeTo(220).toList()
        val adapter = RvAdapter(list)
        recyclerView.adapter = adapter
    }
}