package com.lannstark.lec06
// 반복문
fun main() {
    val numbers = listOf(1L, 2L, 3L)

    // 콜론(:) 대신 in
    for (number in numbers) {
        println(number)
    }

    // .. -> Range를 상속받아 등차수열을 만들어줌
    for (i in 1..3) { // 1~3 까지
        println(i)
    }

    for (i in 3 downTo 1) { // 3~1 까지
        // downTo, step -> 중위 함수
        println(i)
    }

    for (i in 1..5 step 2) { // 2씩 증가
        println(i)
    }


}



