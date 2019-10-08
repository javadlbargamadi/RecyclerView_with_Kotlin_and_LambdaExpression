package com.semateckotlinproject.recyclerviewwithkotlinandlambdaexpression

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        ArrayList<String> list = new ArrayList;
        val list: ArrayList<String> = ArrayList()
        list.add("C")
        list.add("C++")
        list.add("C#")
        list.add("Java")
        list.add("Kotlin")

//        val adapter = RecyclerViewAdapter(list)
        recyclerView.adapter = RecyclerViewAdapter(list) { showToast(it) }
        recyclerView.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
    }

    private fun showToast(it: String) = Toast.makeText(this, it, Toast.LENGTH_SHORT).show()

}
