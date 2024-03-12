package com.example.a2qjs

class side {
    fun Side(num2: Int) {
        when (num2) {
            1 -> println("감자 튀김를 주문하셨습니다.")
            2 -> println("양파 튀김를 주문하셨습니다.")
            3 -> println("치킨 너겟를 주문하셨습니다.")
            else -> println("잘못된 메뉴 번호입니다.")
        }
    }
}