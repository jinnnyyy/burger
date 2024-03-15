package com.example.a2qjs

open class Food(name:String, price:Int) {

    var name:String = ""
    var price:Int =0
    init {
        this.name = name
        this.price = price
    }
    fun displayInfo() {
        println("${name}의 가격은 ${price}입니다")
    }
}