package com.suanxa.passing_listview.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.suanxa.passing_listview.R
import com.suanxa.passing_listview.model.model_buku

class buku_adapter (private val buku: List<model_buku>) :
    RecyclerView.Adapter<buku_adapter.BukuAdapterHolder>() {

    class BukuAdapterHolder(view: View) : RecyclerView.ViewHolder(view){
        val Judul : TextView = view.findViewById(R.id.judulbuku)
        val Penulis : TextView = view.findViewById(R.id.penulis)
    }

    override fun onBindViewHolder(holder: BukuAdapterHolder, position: Int) {

        holder.Penulis.text = buku[position].penulis
        holder.Judul.text = buku[position].title
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BukuAdapterHolder {

        val  view = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)
        return  BukuAdapterHolder(view)
    }
    override fun getItemCount(): Int{
        return buku.size
    }

}