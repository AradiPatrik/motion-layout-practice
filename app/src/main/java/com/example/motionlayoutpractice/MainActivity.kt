package com.example.motionlayoutpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<RecyclerView>(R.id.theRecyclerView).layoutManager = LinearLayoutManager(this)
        findViewById<RecyclerView>(R.id.theRecyclerView).adapter = CatAdapter().apply {
            submitList(
                listOf(
                    "The endpoint to set purroduct options on a cart can be called multipawle times fur the same cart. Aftepurr the first call, subsequent calls can be used to introduce additional purroduct option settings",
                    "The endpoint to set purroduct options on a cart can be called multipawle times fur the same cart. Aftepurr the first call, subsequent calls can be used to introduce additional purroduct option settings",
                    "The endpoint to set purroduct options on a cart can be called multipawle times fur the same cart. Aftepurr the first call, subsequent calls can be used to introduce additional purroduct option settings",
                    "The endpoint to set purroduct options on a cart can be called multipawle times fur the same cart. Aftepurr the first call, subsequent calls can be used to introduce additional purroduct option settings",
                    "The endpoint to set purroduct options on a cart can be called multipawle times fur the same cart. Aftepurr the first call, subsequent calls can be used to introduce additional purroduct option settings",
                    "The endpoint to set purroduct options on a cart can be called multipawle times fur the same cart. Aftepurr the first call, subsequent calls can be used to introduce additional purroduct option settings",
                    "The endpoint to set purroduct options on a cart can be called multipawle times fur the same cart. Aftepurr the first call, subsequent calls can be used to introduce additional purroduct option settings"
                )
            )
        }
    }
}

class CatAdapter : ListAdapter<String, CatAdapter.ViewHolder>(
    object : DiffUtil.ItemCallback<String>() {
        override fun areItemsTheSame(p0: String, p1: String) = p0 == p1
        override fun areContentsTheSame(p0: String, p1: String) = p0 == p1
    }
) {
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        fun bind(item: String) {
            itemView.findViewById<TextView>(R.id.textView).text = item
        }
    }

    override fun onCreateViewHolder(viewHolder: ViewGroup, position: Int) = ViewHolder(
        LayoutInflater.from(viewHolder.context).inflate(R.layout.list_item_card, viewHolder, false)
    )
    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        viewHolder.bind(getItem(position))
    }
}