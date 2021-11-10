package com.daffakhairi.dzikirapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import org.w3c.dom.Text

class DzikirDoaAdapter(val listDzikirDoa: ArrayList<DzikirDoa>): RecyclerView.Adapter<DzikirDoaAdapter.MyViewHolder>(){
    inner class MyViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val tvDesc = view.findViewById<TextView>(R.id.tv_desc)
        val tv_lafaz = view.findViewById<TextView>(R.id.tv_lafaz)
        val tv_terjemah: TextView = view.findViewById(R.id.tv_terjemah)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    )  = MyViewHolder(
         LayoutInflater.from(parent.context).inflate(R.layout.row_item_dzikir_doa, parent, false)
    )


    override fun onBindViewHolder(holder: DzikirDoaAdapter.MyViewHolder, position: Int) {
        holder.tvDesc.text = listDzikirDoa[position].desc
        holder.tv_lafaz.text = listDzikirDoa[position].lafaz
        holder.tv_terjemah.text = listDzikirDoa[position].terjemah

    }

    override fun getItemCount() = listDzikirDoa.size

}