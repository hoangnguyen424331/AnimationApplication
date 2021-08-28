package com.example.animationapplication.model

data class Product(var name: String?)

fun initProductData() = mutableListOf<Product>().apply {
    add(Product("Product 1"))
    add(Product("Product 2"))
    add(Product("Product 3"))
    add(Product("Product 4"))
    add(Product("Product 5"))
    add(Product("Product 6"))
    add(Product("Product 7"))
    add(Product("Product 8"))
    add(Product("Product 9"))
    add(Product("Product 10"))
}
