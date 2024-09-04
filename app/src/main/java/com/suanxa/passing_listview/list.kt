package com.suanxa.passing_listview

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class list : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

        val mahasiswa =  listOf("cinop", "Jack", "Abeng", "Bangmul")
        val listView: ListView = findViewById(R.id.list)
        val adapter = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1,
            mahasiswa
        )
        listView.adapter = adapter

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.list)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
