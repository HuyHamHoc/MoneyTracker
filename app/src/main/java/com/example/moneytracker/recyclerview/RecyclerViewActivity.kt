package com.example.moneytracker.recyclerview

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.moneytracker.R
import com.example.moneytracker.databinding.ActivityRecyclerViewBinding

class RecyclerViewActivity : AppCompatActivity() {
    private lateinit var binding : ActivityRecyclerViewBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRecyclerViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // tạo dataset
        val dataSet = mutableListOf<Letter>()
        dataSet.add(Letter("A",Color.RED))
        dataSet.add(Letter("B",Color.BLUE))
        dataSet.add(Letter("C",Color.CYAN))
        dataSet.add(Letter("D",Color.YELLOW))
        dataSet.add(Letter("E",Color.GREEN))
        dataSet.add(Letter("G",Color.GRAY))
        dataSet.add(Letter("H",Color.DKGRAY))
        dataSet.add(Letter("I",Color.LTGRAY))
        dataSet.add(Letter("J",Color.MAGENTA))

        // khai báo adapter
        val letterAdapter = LetterAdapter(dataSet)
        val linearLayoutManager = LinearLayoutManager(this)
        binding.rcvView.apply {
            layoutManager = linearLayoutManager
            adapter = letterAdapter
        }
    }
}