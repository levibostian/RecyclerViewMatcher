package com.levibostian.recyclerviewmatcherexample

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MainRecyclerViewAdapter(private val data: List<String>): RecyclerView.Adapter<MainRecyclerViewAdapter.ViewHolder>() {

    override fun getItemCount(): Int = data.size

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val titleTextView: TextView = view.findViewById(R.id.title_textview)
        val reverseButton: Button = view.findViewById(R.id.reverse_button)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainRecyclerViewAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.adapter_main_recyclerview_row, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val title = data[position]

        holder.titleTextView.text = title
        holder.reverseButton.setOnClickListener {
            holder.titleTextView.text = title.reversed()
        }
    }

}