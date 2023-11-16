package com.lannstark.lec10

// 코틀린에서 상속은 ' : '을 사용한다.
// 타입 -> 변수명: 타입
// 상속 -> class A() : B
class Cat(
    species: String
) : Animal(species, 4) {
    override fun move() {
        println("고양이가 사뿐 사뿐 걸어가~")
    }
}