package com.example.tapcontest.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.tapcontest.R
import com.example.tapcontest.data.ContestModel
import kotlinx.android.synthetic.main.row_contest_list.view.*


class CustomAdapter(private val contestModel: ArrayList<ContestModel>) : RecyclerView.Adapter<CustomAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var title: TextView = itemView.tv_title
        var smallDescription: TextView = itemView.tv_subtext
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.row_contest_list,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int = contestModel.size

    override fun onBindViewHolder(holder: CustomAdapter.ViewHolder, position: Int) {
        holder.title.text = contestModel[position].title
        holder.smallDescription.text = contestModel[position].smallDescription
    }

}