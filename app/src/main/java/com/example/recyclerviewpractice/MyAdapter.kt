package com.example.recyclerviewpractice

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView

class MyAdapter(val context : Activity,val userArrayList : ArrayList<User>) :
    RecyclerView.Adapter<MyAdapter.MyViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(context).inflate(R.layout.each_item,parent,false)
        return MyViewHolder(itemView)
    }

    override fun getItemCount(): Int {
       return userArrayList.size
    }


    //populate items with data
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        val currentItem = userArrayList[position]
        holder.uImage.setImageResource(currentItem.userImage)
        holder.uName.text = currentItem.userName
    }


    //it holds the view so views are not created everytime ,so memory can be saved
    class MyViewHolder (itemView :View ): RecyclerView.ViewHolder(itemView) {

        val uImage = itemView.findViewById<ShapeableImageView>(R.id.userImage)
        val uName = itemView.findViewById<TextView>(R.id.userName)

    }
}