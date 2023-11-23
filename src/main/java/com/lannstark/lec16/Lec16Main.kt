package com.lannstark.lec16

fun main() {
    val str = "ABC"
    // 멤버 함수 처럼
    println(str.lastChar())

    val person = Person("A", "B", 100)
    person.nextYearAge() // 멤버함수가 우선 호출 된다

    // 해당 변수의 현재타입(정적인 타입)에 의해 어던 확장함수가 호출될지 결정된다.
    val train: Train = Train()
    train.isExpensive() // Train의 확장함수

    val srt1: Train = Srt()
    srt1.isExpensive() // Train의 확장함수

    val srt2: Srt = Srt()
    srt2.isExpensive() // Srt의 확장함수



}

// 확장 함수 fun 확장하려는 클래스.함수이름 (파라미터) : 리턴타입 { this를 이용해 실제 클래스 안에 값에 접근 }

fun String.lastChar(): Char {
    return this[this.length - 1]
}

fun Person.nextYearAge(): Int {
    println("확장 함수")
    return this.age + 1
}


// 중위 함수
fun Int.add(other: Int): Int {
    return this + other
}

infix fun Int.add2(other: Int): Int {
    return this + other
}

