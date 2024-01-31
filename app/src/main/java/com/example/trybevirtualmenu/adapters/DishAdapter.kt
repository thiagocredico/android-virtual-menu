package com.example.trybevirtualmenu.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.example.trybevirtualmenu.R
import com.example.trybevirtualmenu.models.Dish
import com.google.android.material.imageview.ShapeableImageView
import com.google.android.material.textview.MaterialTextView

interface DishListener {
    fun onClick(view: View, position: Int)
}

class DishAdapter(private val dishes: List<Dish>, private val dishListener: DishListener) :
    RecyclerView.Adapter<DishAdapter.DishViewHolder>() {

    inner class DishViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val image: ShapeableImageView = view.findViewById(R.id.item_menu_image)
        val name: MaterialTextView = view.findViewById(R.id.item_menu_name)

        fun bind(dish: Dish) {
            image.setImageResource(dish.image)
            name.text = dish.name

            itemView.setOnClickListener {
                dishListener.onClick(itemView, bindingAdapterPosition)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DishViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_menu_layout, parent, false)
        return DishViewHolder(view)
    }

    override fun getItemCount(): Int = dishes.size

    override fun onBindViewHolder(holder: DishViewHolder, position: Int) {
        holder.bind(dishes[position])
    }
}
