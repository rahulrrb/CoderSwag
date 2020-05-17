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
        Category("DIGITAL", "digitalgoodsimage"),
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage")
    )

    val hats = listOf(
        Product("Graphic Beanie", "₹152", "hat01"),
        Product("Black Hat", "₹110", "hat02"),
        Product("White Hat", "₹115", "hat03"),
        Product("Snapback Hat", "₹140", "hat04")
    )

    val hodies = listOf(
        Product("Red Hoodie", "₹252", "hoodie01"),
        Product("Black Hoodie", "₹210", "hoodie02"),
        Product("White Hoodie", "₹215", "hoodie03"),
        Product("Gray Hoodie", "₹240", "hoodie04")
    )

    val shirts = listOf(
        Product("Red Shirt", "₹452", "shirt01"),
        Product("Black Shirt", "₹410", "shirt02"),
        Product("White Shirt", "₹415", "shirt03"),
        Product("Badge Light Gray Shirt", "₹440", "shirt04"),
        Product("Hustle Shirt", "₹540", "shirt05")
    )


}