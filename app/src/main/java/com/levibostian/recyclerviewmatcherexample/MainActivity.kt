package com.levibostian.recyclerviewmatcherexample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.levibostian.recyclerviewmatcherexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onStart() {
        super.onStart()

        val data: List<String> = listOf(
            "bears",
            "beets",
            "battlestar galactica"
        )

        binding.actMainRecyclerview.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = MainRecyclerViewAdapter(data)
        }
    }

}
