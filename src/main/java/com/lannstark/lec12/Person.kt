package com.lannstark.lec12

fun main() {
    println(Singleton.a)
    Singleton.a += 10
    println(Singleton.a)
}

class Person private constructor(
    var name: String,
    var age: Int
) {
    // kotlin은 static이 없다

    //하나의 객체로 취급된다

    companion object Factory : Log {

        private const val MIN_AGE = 1 // const 라고 붙이면 컴파일 시점에 값이 할당된다.

        @JvmStatic
        fun newBaby(name: String): Person {
            return Person(name, MIN_AGE)
        }

        override fun log() {
            println("나는 Person 클래스의 동행객체 Factory에요")
        }
    }
}

// singleton 객체
object Singleton {
    var a: Int = 0
}