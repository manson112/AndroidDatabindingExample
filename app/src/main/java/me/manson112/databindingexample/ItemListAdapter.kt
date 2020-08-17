package me.manson112.databindingexample

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import me.manson112.databindingexample.databinding.ItemBinding

class ItemListAdapter(var items: List<Item>): RecyclerView.Adapter<ItemListAdapter.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(items[position])
    }

    class ViewHolder(val binding: ItemBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(item: Item) {
            binding.it = item
        }
    }

}