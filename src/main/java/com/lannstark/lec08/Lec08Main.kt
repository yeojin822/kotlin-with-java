package com.lannstark.lec08
// 함수
/**
 * 접근지시어 fun 함수이름(파라미터: 타입): 반환타입 { }
 */
fun main() {
    repeat("Hello World", 3, true)
    //default parameter
    repeat("Hello World")

    // named argument
    // builder 장점을 가진다.
    // Kotlin에서 java 함수를 가져다 사용할 때는 named argument를 사용할 수 없다.
    repeat("Hello World", useNewLine = true)

    //가변인자
    printAll("A", "B", "C")

    val array = arrayOf("A", "B", "C")
    // spread 연산자 : 배열안에 있는 것들을 , 쓰는것처럼 꺼내준다.
    printAll(*array)
}

fun max(a: Int, b: Int): Int {
    //블록 안에서는 반환한다.
    return if (a > b) {
        a
    } else {
        b
    }
}

fun maxV2(a: Int, b: Int): Int =
    if (a > b) {
        a
    } else {
        b
    }

// body가 하나의 값으로 간주되는 경우 block을 없앨수도 있고,
// block이 없다면 반환타입을 없앨 수도 있다.
fun maxV3(a: Int, b: Int) = if (a > b) a else b

// default parameter
// 밖에서 파라미터를 넣어주지 않으면 기본값을 사용한다.
fun repeat(
    str: String,
    num: Int = 3,
    useNewLine: Boolean = true
) {
    for (i in 1..num) {
        if (useNewLine) {
            println(str)
        } else {
            print(str)
        }
    }
}

fun printNameAndGender(name: String, gender: String) {
    println(name)
    println(gender)
}

//가변인자
fun printAll(vararg strings: String) {
    for (string in strings) {
        println(string)
    }
}