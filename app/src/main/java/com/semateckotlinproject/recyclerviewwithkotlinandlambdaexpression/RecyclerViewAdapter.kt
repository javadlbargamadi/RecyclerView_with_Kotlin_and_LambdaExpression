package com.semateckotlinproject.recyclerviewwithkotlinandlambdaexpression

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.recycler_view_item.view.*

class RecyclerViewAdapter(private val list: ArrayList<String>, private val activityFunction: (String) -> Unit) : RecyclerView.Adapter<RecyclerViewAdapter.RecyclerViewAdapterViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewAdapterViewHolder {
        return RecyclerViewAdapterViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.recycler_view_item, parent, false), activityFunction)
    }

    override fun getItemCount() = list.size

    override fun onBindViewHolder(holder: RecyclerViewAdapterViewHolder, position: Int) =
        holder.onBind(list[position])

    class RecyclerViewAdapterViewHolder(itemView: View, val activityFunction: (String) -> Unit) :
        RecyclerView.ViewHolder(itemView) {
        fun onBind(s: String) {
            itemView.txt.text = s
            itemView.setOnClickListener { activityFunction(s) }
        }
    }
}
