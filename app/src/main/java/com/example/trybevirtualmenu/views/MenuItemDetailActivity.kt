package com.example.trybevirtualmenu.views

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.trybevirtualmenu.R
import com.example.trybevirtualmenu.models.DishDatabase
import com.google.android.material.button.MaterialButton
import com.google.android.material.imageview.ShapeableImageView
import com.google.android.material.textview.MaterialTextView

class MenuItemDetailActivity : AppCompatActivity() {

    private val image: ShapeableImageView by lazy { findViewById(R.id.detail_image) }
    private val name: MaterialTextView by lazy { findViewById(R.id.detail_name) }
    private val description: MaterialTextView by lazy { findViewById(R.id.detail_description) }
    private val price: MaterialTextView by lazy { findViewById(R.id.detail_price) }
    private val returnButton: MaterialButton by lazy { findViewById(R.id.detail_back) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_item_detail)

        val dishId = intent.getIntExtra("dish_id", 0)
        val dish = DishDatabase.getDishById(dishId)

        if (dish != null) {
            image.setImageResource(dish.image)
            name.text = dish.name
            description.text = dish.description
            price.text = "R$: ${dish.price}"

            returnButton.setOnClickListener {
                finish()
            }
        }
    }
}
