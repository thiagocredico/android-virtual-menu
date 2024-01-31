package com.example.trybevirtualmenu.views

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.trybevirtualmenu.R
import com.example.trybevirtualmenu.adapters.DishAdapter
import com.example.trybevirtualmenu.adapters.DishListener
import com.example.trybevirtualmenu.models.DishDatabase

interface DishListener {
    fun onClick(view: View, position: Int)
}
class MainActivity : AppCompatActivity(), DishListener {

    private val dishList: RecyclerView by lazy { findViewById(R.id.main_menu) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dishes = DishDatabase.getAllDishes()

        val adapter = DishAdapter(dishes, this)

        dishList.layoutManager = LinearLayoutManager(baseContext)
        dishList.adapter = adapter
    }

    override fun onClick(view: View, position: Int) {
        val dishes = DishDatabase.getAllDishes()
        val dish = dishes[position]
        val it = Intent(this, MenuItemDetailActivity::class.java)
        it.putExtra("dish_id", dish.id)
        startActivity(it)
    }
}
