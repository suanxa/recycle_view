package com.suanxa.passing_listview

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.suanxa.passing_listview.adapter.buku_adapter
import com.suanxa.passing_listview.model.model_buku

class recycle_view : AppCompatActivity() {
    private lateinit var  rv_buku : RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_recycle_view)

        rv_buku = findViewById(R.id.rv_b)

        val listBuku = listOf(
            model_buku(title = "Happy", penulis = "suanXa"),
            model_buku(title = "Heart", penulis = "suanXa"),
            model_buku(title = "Life", penulis = "suanXa"),
            model_buku(title = "Love", penulis = "suanXa"),
            model_buku(title = "Quotes", penulis = "suanXa"),
        )
        val nBukuAdapter = buku_adapter(listBuku)
        rv_buku.apply {
            layoutManager = LinearLayoutManager(this@recycle_view)
            adapter = nBukuAdapter
        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}