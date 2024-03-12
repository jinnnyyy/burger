package com.example.a2qjs

class drink {
    fun Drink(num2: Int) {
        when (num2) {
            1 -> println("콜라를 주문하셨습니다.")
            2 -> println("제로 콜라를 주문하셨습니다.")
            3 -> println("사이다를 주문하셨습니다.")
           4-> println("제로 사이다를 주문하셨습니다.")
            else -> println("잘못된 메뉴 번호입니다.")
        }
    }
}