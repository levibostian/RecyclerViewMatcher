package com.levibostian.recyclerviewmatcherexample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()

        val data: List<String> = listOf(
            "bears",
            "beets",
            "battlestar galactica"
        )

        act_main_recyclerview.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = MainRecyclerViewAdapter(data)
        }
    }

}
