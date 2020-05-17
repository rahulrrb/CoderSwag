package com.rrb.coderswag.controller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.appcompat.widget.LinearLayoutCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.rrb.coderswag.R
import com.rrb.coderswag.adapters.CategoryAdapter
import com.rrb.coderswag.adapters.CategoryRecycleAdaptor
import com.rrb.coderswag.model.Category
import com.rrb.coderswag.services.DataService
import com.rrb.coderswag.utilities.EXTRA_CATEGORY
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    //https://abhiandroid.com/ui/adapter - Read About Adapter
    lateinit var adapter: CategoryRecycleAdaptor
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryRecycleAdaptor(this, DataService.categories) {
            //For RecyclerView the onClickListener won't work so we have to write our own onClickListener
            //You will use Lambda Expression for this
                category ->
            val productIntent = Intent(this, ProductActivity::class.java)
            productIntent.putExtra(EXTRA_CATEGORY, category.title)
            startActivity(productIntent)

        }
        categoryListView.adapter = adapter


        //if you are using RcyclerView then you have to implement LayoutManager
        val layoutManager = LinearLayoutManager(this)
        categoryListView.layoutManager = layoutManager

        //for Optimization, we are adding this
        categoryListView.setHasFixedSize(true)


        /*categoryListView.setOnItemClickListener { adapterView, view, position, id ->
            val category =DataService.categories[position]
            Toast.makeText(this,"You Clicked on the ${category.title} cell ", Toast.LENGTH_SHORT).show()
        }
        //This Block won't work in Recycler View. It works with List View
        */
    }
}
