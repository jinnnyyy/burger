@file:Suppress("DEPRECATED_IDENTITY_EQUALS")

package com.example.a2qjs
//[ 필요한 기능 ]
//요구사항1: 메인 메뉴판 화면
//: 메뉴 선택시 상세 메뉴화면으로 이동
//: 잘못된 번호 선택 시 예외처리
//: 프로그램 종료을 위한 번호 정의
//
//요구사항2: 다른 메뉴로 이동가능해야함
//요구사항3: 뒤로 가기 버튼도 있어야함
//요구사항4: 결제 화면
//: 기프티콘이나 할인 쿠폰을 적용할 수 있어야함
//: 카드를 넣어달라는 안내문구
//: 총 가격을 보여줘야함


fun main(){
    println("안녕하세요. 주문하시겠습니까?")
    while (true){
        println("햄버거 1, 사이드 2, 음료 3, 주문 종료 0")
        val num1=readLine()!!.toInt()
        if (num1!=0){
            when (num1){

                1-> {println("불고기 버거 1, 새우 버거 2, 치킨 버거 3")
                    var num2 = readLine()!!.toInt()
                    Ham().ham(num2)}
                2-> {println("감자 튀김 1, 양파 튀김 2, 치킨 너겟 3")
                    var num2 = readLine()!!.toInt()
                    side().Side(num2)}
                3-> {println("콜라 1, 제로 콜라 2, 사이다 3, 제로 사이다 4")
                    var num2 = readLine()!!.toInt()
                    drink().Drink(num2)}

            }


        }
    }
}


