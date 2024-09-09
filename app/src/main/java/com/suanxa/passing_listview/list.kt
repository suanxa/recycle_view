package com.suanxa.passing_listview

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class list : AppCompatActivity() {

    private lateinit var listview : ListView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

        listview = findViewById(R.id.list)

        val mahasiswa =  listOf("cinop", "Jack", "Abeng", "Bangmul")
        listview.adapter= ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1,
            mahasiswa
        )

        listview.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(this, "Anda memilih : ${mahasiswa[position]}",Toast.LENGTH_SHORT).show()
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.list)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
