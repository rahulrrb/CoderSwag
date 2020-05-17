package com.rrb.coderswag.controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rrb.coderswag.R
import com.rrb.coderswag.utilities.EXTRA_CATEGORY

class ProductActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product)

        val categoryType = intent.getStringExtra(EXTRA_CATEGORY)
        print(categoryType)
    }
}
