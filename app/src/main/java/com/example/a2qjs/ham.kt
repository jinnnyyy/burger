package com.example.a2qjs

class Ham {
    fun ham(num2: Int) {
        when (num2) {
            1 -> println("불고기 버거를 주문하셨습니다.")
            2 -> println("새우 버거를 주문하셨습니다.")
            3 -> println("치킨 버거를 주문하셨습니다.")
            else -> println("잘못된 메뉴 번호입니다.")
        }
    }
}
