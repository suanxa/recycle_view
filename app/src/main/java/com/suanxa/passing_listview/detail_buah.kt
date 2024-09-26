package com.suanxa.passing_listview

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class detail_buah : AppCompatActivity() {
    private lateinit var txtdetailbuah: TextView
    private lateinit var imgdetailbuah: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detail_buah)

        txtdetailbuah = findViewById(R.id.txtdetailbuah)
        imgdetailbuah = findViewById(R.id.imgdetailbuah)

        //get data
        val detailtext = intent.getStringExtra("deskripsi")
        val detailimage = intent.getIntExtra("image",0)
        //set data ke layout
        txtdetailbuah.setText(detailtext)
        imgdetailbuah.setImageResource(detailimage)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}