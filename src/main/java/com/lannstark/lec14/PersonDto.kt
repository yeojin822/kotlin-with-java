package com.lannstark.lec14


fun main() {
    val dto1 = PersonDto("테스트", 100)
    val dto2 = PersonDto("테스트", 200)

    println(dto1 == dto2)

}


// data class -> 자동으로 equals, hashcode, toString 을 만들어준다.
data class PersonDto (val name: String, val age: Int)