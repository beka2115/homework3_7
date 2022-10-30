package com.example.homework3_7

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Recycler
import com.bumptech.glide.Glide
import com.example.homework3_7.databinding.ItemMainBinding

class NavigationAdapter(
    val navList: List<NavigationComponents>,
    val onClick: (position: Int) -> Unit
) : RecyclerView.Adapter<NavigationAdapter.NavigationViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NavigationViewHolder {
        return NavigationViewHolder(
            ItemMainBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: NavigationViewHolder, position: Int) {
        holder.bind()
    }

    override fun getItemCount() = navList.size


    inner class NavigationViewHolder(private val binding: ItemMainBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind() {
            val item = navList[adapterPosition]
            itemView.setOnClickListener {
                onClick(adapterPosition)
            }
            binding.textLive.text = item.live
            binding.textName.text = item.name
            Glide.with(binding.imgMain).load(item.picture).into(binding.imgMain)

        }


    }


}