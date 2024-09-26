package com.suanxa.passing_listview.model

import com.suanxa.passing_listview.R

data class modelbuah(
    val image: Int,
    val deskripsi : String
)

object Mocklist{
    fun getModel() : List<modelbuah>{
        val itemmodel1 = modelbuah(
            R.drawable.apple,
            "Apple",
        )
        val itemmodel2 = modelbuah(
            R.drawable.grapes,
            "Anggur",
        )
        val itemmodel3 = modelbuah(
            R.drawable.orange,
            "Jeruk",
        )
        val itemmodel4 = modelbuah(
            R.drawable.pear,
            "Pir",
        )
        val itemmodel5 = modelbuah(
            R.drawable.strawberry,
            "Stroberi",
        )

        val itemlist: ArrayList<modelbuah> = ArrayList()
        itemlist.add(itemmodel1)
        itemlist.add(itemmodel2)
        itemlist.add(itemmodel3)
        itemlist.add(itemmodel4)
        itemlist.add(itemmodel5)

        return itemlist
    }
}
