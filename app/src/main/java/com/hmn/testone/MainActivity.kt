package com.hmn.testone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var recyclerView: RecyclerView
    lateinit var adapter: Adapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val list = ArrayList<Model>()
        list.add(Model(R.drawable.jenny,"Jenny"))
        list.add(Model(R.drawable.hritik_roshan,"Hiri Roshan"))
        list.add(Model(R.drawable.messi,"Messi"))
        list.add(Model(R.drawable.mother_su,"Daw Aung San Su Kyi"))

        recyclerView = findViewById(R.id.recyclerview_front)
        adapter = Adapter(this,list)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = GridLayoutManager(this,2)


    }
}