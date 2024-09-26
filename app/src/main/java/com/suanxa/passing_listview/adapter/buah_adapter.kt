package com.suanxa.passing_listview.adapter

import android.annotation.SuppressLint
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView
import com.suanxa.passing_listview.MainActivity
import com.suanxa.passing_listview.R
import com.suanxa.passing_listview.customimage_rv
import com.suanxa.passing_listview.detail_buah
import com.suanxa.passing_listview.model.modelbuah

class buah_adapter (
    val itemList: ArrayList<modelbuah>,
    private val getActivity: customimage_rv ):

        RecyclerView.Adapter<buah_adapter.ModelViewHolder>(){

            class ModelViewHolder (itemView: View):RecyclerView.ViewHolder(itemView) {
               var itemimage : ImageView
               var itemtext : TextView

               init {
                   itemimage = itemView.findViewById(R.id.gambar)as ImageView
                   itemtext = itemView.findViewById(R.id.name)as TextView
               }
            }

    @SuppressLint("SuspiciousIndentation")
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ModelViewHolder {
      val nview = LayoutInflater.from(parent.context)
          .inflate(R.layout.item_customimage,parent, false)
        return ModelViewHolder(nview)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(holder: ModelViewHolder, position: Int) {
        holder.itemimage.setImageResource(itemList[position].image)
        holder.itemtext.setText(itemList[position].deskripsi)

        // untuk klik detail
        holder.itemView.setOnClickListener(){
            //deklarasi intent
            val intent= Intent(getActivity,detail_buah::class.java)
            //baru put extra variable yang ingin di lempar atau passed
            intent.putExtra("deskripsi",itemList[position].deskripsi)
            intent.putExtra("image",itemList[position].image)
            // intent.putExtra("Judul",itemList[position].judul)
            //passed ke datail
            getActivity.startActivity(intent)
        }

    }
}
