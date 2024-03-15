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
    val list = arrayListOf<Food
            >()
    list.add (Drink("Coke",2000))
    list.add (Drink("ZeroCo",2000))
    list.add (Drink("Cider",2000))
    list.add (Drink("ZeroCi",2000))
    list.add (Side("Onion",6500))
    list.add (Side("Potato",5500))
    list.add (Side("Nugget",6000))
    list.add (Ham("Shake",15000))
    list.add (Ham("Shrimp",13000))
    list.add (Ham("Chicken",12000))
    println("안녕하세요. 주문하시겠습니까?")
    var num1 : Int? = null
    while (true){

        println("햄버거 1, 사이드 2, 음료 3, 주문 종료 0")
        try {
            num1=readLine()!!.toInt()
        }
        catch (e:java.lang.NumberFormatException){
            println("숫자를 입력해주세요")
        }

        if (num1!=0){

            when (num1){

                1-> {
                    list.get(7).displayInfo()
                    list.get(8).displayInfo()
                    list.get(9).displayInfo()
                    }
                2-> {
                    list.get(4).displayInfo()
                    list.get(5).displayInfo()
                    list.get(6).displayInfo()
                }

                3-> { list.get(0).displayInfo()
                    list.get(1).displayInfo()
                    list.get(2).displayInfo()
                    list.get(3).displayInfo()

                }
                else -> {
                    println("다시 선택해 주세요")
                }
            }

        }
        if (num1==0){
            break
        }
    }
}



