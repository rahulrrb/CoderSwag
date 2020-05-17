package com.rrb.coderswag.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.rrb.coderswag.R
import com.rrb.coderswag.model.Category

class CategoryRecycleAdaptor(
    val context: Context,
    val categories: List<Category>,
    val itemClick: (Category) -> Unit
) : Adapter<CategoryRecycleAdaptor.Holder>() {

    //this class will bind  the Data
    inner class Holder(itemView: View?, val itemClick: (Category) -> Unit) :
        RecyclerView.ViewHolder(itemView!!) {
        val categoryImage = itemView?.findViewById<ImageView>(R.id.categoryimage)
        val categoryName = itemView?.findViewById<TextView>(R.id.categoryname)

        fun bindCategory(category: Category, context: Context) {
            val resourceId =
                context.resources.getIdentifier(category.image, "drawable", context.packageName)
            categoryImage?.setImageResource(resourceId)
            categoryName?.text = category.title
            itemView.setOnClickListener { itemClick(category) }
        }
    }

    //This method will be called when new ViewHolder will be needed
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view = LayoutInflater.from(context).inflate(R.layout.category_list_item, parent, false)
        return Holder(view, itemClick)
    }

    override fun getItemCount(): Int {
        return categories.count()
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder?.bindCategory(categories[position], context)
    }


}