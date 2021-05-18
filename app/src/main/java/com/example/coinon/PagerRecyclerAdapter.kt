package com.example.coinon

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.coinon.databinding.ActivityMainBinding
import com.example.coinon.databinding.ItemViewBinding

class PagerRecyclerAdapter : RecyclerView.Adapter<PagerRecyclerAdapter.PagerRecyclerViewHolder>() {

    //viewholder로 변경할 data가지고 있기
    val num_list : List<Int> = listOf(1,2,3,4)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PagerRecyclerViewHolder {
        val binding = ItemViewBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return PagerRecyclerViewHolder(binding)
    }

    class PagerRecyclerViewHolder(
        private var binding: ItemViewBinding
    ) : RecyclerView.ViewHolder(binding.root){
        fun onBind(){
            binding.pageName.text = "Page ${position+1}"
        }

    }

    override fun onBindViewHolder(holder: PagerRecyclerViewHolder, position: Int) {
        holder.onBind(num_list[position])


    }

    override fun getItemCount(): Int = num_list.size


}