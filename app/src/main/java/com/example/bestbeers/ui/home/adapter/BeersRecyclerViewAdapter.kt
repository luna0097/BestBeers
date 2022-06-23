package com.example.bestbeers.ui.home.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.bestbeers.R

class BeersRecyclerViewAdapter(val actionClick: () -> Unit): RecyclerView.Adapter<BeersRecyclerViewAdapter.Holder>() {
    private var beerList: List<String> = emptyList()
    fun setData(list: List<String>){
        beerList = list
        notifyDataSetChanged()
    }

    class Holder(view: View): RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return Holder(layoutInflater.inflate(R.layout.beer_item, parent, false))
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        val beer = beerList[position]
        holder.itemView.findViewById<TextView>(R.id.tvBeerName).text = beer
    }

    override fun getItemCount(): Int {
        return beerList.size
    }
}