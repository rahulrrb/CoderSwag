package com.rrb.coderswag.controller

import android.content.Intent
import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.rrb.coderswag.R
import com.rrb.coderswag.adapters.ProductsAdopter
import com.rrb.coderswag.services.DataService
import com.rrb.coderswag.utilities.EXTRA_CATEGORY
import com.rrb.coderswag.utilities.EXTRA_PRODUCT
import kotlinx.android.synthetic.main.activity_product.*

class ProductActivity : AppCompatActivity() {
    lateinit var adapter: ProductsAdopter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product)

        val categoryType = intent.getStringExtra(EXTRA_CATEGORY)
        adapter = ProductsAdopter(this, DataService.getProducts(categoryType)){ product ->
            val productDetailIntent = Intent(this, ProductDetailActivity::class.java)
            productDetailIntent.putExtra(EXTRA_PRODUCT, product)
            startActivity(productDetailIntent)
        }

        //setting Orientation for the Products
        var spanCount = 2
        val orientation = resources.configuration.orientation
        if (orientation == Configuration.ORIENTATION_LANDSCAPE) {
            spanCount = 3
        }

        //If screen size is bigger then=> we are checking
        val screenSize = resources.configuration.screenWidthDp
        if (screenSize > 720) {
            spanCount = 3
        }

        val layoutManager = GridLayoutManager(this, spanCount)
        productsListView.layoutManager = layoutManager
        productsListView.adapter = adapter
    }
}
