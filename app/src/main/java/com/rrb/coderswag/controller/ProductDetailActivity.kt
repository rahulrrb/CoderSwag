package com.rrb.coderswag.controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rrb.coderswag.R
import com.rrb.coderswag.model.Product
import com.rrb.coderswag.utilities.EXTRA_PRODUCT
import kotlinx.android.synthetic.main.activity_product_detail.*

class ProductDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_detail)

        val product = intent.getParcelableExtra<Product>(EXTRA_PRODUCT)
        val resourceId = resources.getIdentifier(product.image, "drawable", packageName)

        detailImageView.setImageResource(resourceId)
        detailProductName.text = product.title
        detailProductPrice.text = product.price
    }
}
