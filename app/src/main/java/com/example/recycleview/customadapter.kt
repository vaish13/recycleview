package com.example.recycleview


import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class customadapter(val userList: ArrayList<user>) : RecyclerView.Adapter<customadapter.ViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.user_item, parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.tvname.text = userList[position].name
        holder.tvmobile.text = userList[position].mobile
        if(userList[position].img==1)
        {
            holder.ivuser.setImageResource(R.drawable.businessman)
        }
        else if(userList[position].img==2)
        {
            holder.ivuser.setImageResource(R.drawable.woman)
        }
        else
        {
            holder.ivuser.setImageResource(R.drawable.man)
        }

        holder.ivuser.setOnClickListener{
            val intent = Intent(holder.ivuser.context, DetailedView::class.java)
            intent.putExtra( "user_name", userList[position].name)
            intent.putExtra( "user_mobile", userList[position].mobile)
            holder.ivuser.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return userList.size
    }
    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
          val ivuser: ImageView =itemView.findViewById(R.id.iv1)
          val tvname: TextView  =itemView.findViewById(R.id.tv1)
          val tvmobile: TextView  =itemView.findViewById(R.id.tv2)
    }
}