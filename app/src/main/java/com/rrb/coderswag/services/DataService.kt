package com.rrb.coderswag.services

import com.rrb.coderswag.model.Category
import com.rrb.coderswag.model.Product

object DataService {
    val categories = listOf(
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage"),
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage")
    )

    val hats = listOf(
        Product("Graphic Beanie", "₹152", "hat1"),
        Product("Black Hat", "₹110", "hat2"),
        Product("White Hat", "₹115", "hat3"),
        Product("Snapback Hat", "₹140", "hat4"),
        Product("Graphic Beanie", "₹152", "hat1"),
        Product("Black Hat", "₹110", "hat2"),
        Product("White Hat", "₹115", "hat3"),
        Product("Snapback Hat", "₹140", "hat4"),
        Product("Graphic Beanie", "₹152", "hat1"),
        Product("Black Hat", "₹110", "hat2"),
        Product("White Hat", "₹115", "hat3"),
        Product("Snapback Hat", "₹140", "hat4")
    )

    val hodies = listOf(
        Product("Gray Hoodie", "₹252", "hoodie1"),
        Product("Red Hoodie", "₹210", "hoodie2"),
        Product("Hoodie Grayiesh", "₹215", "hoodie3"),
        Product("Black Hoodie", "₹240", "hoodie4"),
        Product("Gray Hoodie", "₹252", "hoodie1"),
        Product("Red Hoodie", "₹210", "hoodie2"),
        Product("Hoodie Grayiesh", "₹215", "hoodie3"),
        Product("Black Hoodie", "₹240", "hoodie4"),
        Product("Gray Hoodie", "₹252", "hoodie1"),
        Product("Red Hoodie", "₹210", "hoodie2"),
        Product("Hoodie Grayiesh", "₹215", "hoodie3"),
        Product("Black Hoodie", "₹240", "hoodie4")
    )

    val shirts = listOf(
        Product("Black Shirt", "₹452", "shirt1"),
        Product("Badge Light Gray Shirt", "₹410", "shirt2"),
        Product("Logo Shirt Red", "₹415", "shirt3"),
        Product("Hustle Shirt", "₹440", "shirt4"),
        Product("Black Shirt", "₹452", "shirt1"),
        Product("Badge Light Gray Shirt", "₹410", "shirt2"),
        Product("Logo Shirt Red", "₹415", "shirt3"),
        Product("Hustle Shirt", "₹440", "shirt4"),
        Product("Black Shirt", "₹452", "shirt1"),
        Product("Badge Light Gray Shirt", "₹410", "shirt2"),
        Product("Logo Shirt Red", "₹415", "shirt3"),
        Product("Hustle Shirt", "₹440", "shirt4")
    )
    val digitalGood = listOf<Product>()

    fun getProducts(category: String): List<Product> {
        return when (category) {
            "SHIRTS" -> shirts
            "HATS" -> hats
            "HOODIES" -> hodies
            else -> digitalGood
        }
    }
}