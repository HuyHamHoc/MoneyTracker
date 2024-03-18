package com.example.moneytracker.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.moneytracker.databinding.AdapterLetterBinding

class LetterAdapter(val dataSet:List<Letter>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    class VH(private val binding: AdapterLetterBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(letter: Letter) {
            binding.run {
                tvLetter.text = letter.name
                itemView.setBackgroundColor(letter.color)
            }
        }
    }

    // nơi định nghĩa template và view của chúng ta
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val binding = AdapterLetterBinding.inflate(LayoutInflater.from(parent.context)
            ,parent,
            false)

        return VH(binding)
    }

    // định nghĩa view có bao nhiêu phần tử
    override fun getItemCount() = dataSet.size


    // nơi đẩy dữ liệu của vào viewHolder
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as VH).bind(dataSet[position])
    }
}