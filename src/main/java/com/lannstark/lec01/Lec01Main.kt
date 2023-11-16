package com.lannstark.lec01

// 변수를 다루는 방법
fun main() {
    // 모든 변수는 우선 val 필요한 경우 var
    var number1 = 10L; // long number1 = 10L;
    val member2 = 10; // final long number2 = 10L;

    // Long / long -> 코틀린이 자동으로 변환해 준다
    var number3 = 1_000L; // Long number3 = 1_000L;

    // 초기 값을 지정해주지 않는 경우
    var number : Int // 타입 초기화

    // val Collection 이여도 element 추가 가능
    val numbers = listOf(1L, 2L, 3L)
    numbers.plus(4L)

    // null이 변수에 들어갈 수 있다면 '타입?' 사용
    var number4 : Long? = 1_000L

    // new 키워드를 사용하지 않는다.
    var Person = Person("테스트")

}