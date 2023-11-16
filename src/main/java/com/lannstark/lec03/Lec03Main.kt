package com.lannstark.lec03

import java.util.Objects

// Type
fun main() {
    // 기본타입
    val number1 = 3 // Int
    val number2 = 3L // Long
    val number3 = 3.0f // Float
    val number4 = 3.0 // Double

    /**
     * 기본 타입간의 변환은 java 에서 암시적으로 이루어짐
     * 코틀린에서는 명시적으로 이루어져야 한다.
     */
    val number2_Long = number1.toLong() // ' to변환타입() '

    val number5: Int? = 3 // Int
    val number6: Long = number5?.toLong() ?: 0L

    /** String indexing
     * String interpolation ' ${변수} '
     */
    val person = Person("테스트", 100)
    val log = "이름은 ${person.name}이고 나이는 ${person.age}세 입니다."
    println(log)

    val str = """
        ABC
        EFG
        ${person.name}
    """.trimIndent()

    println(str)
    println(str[0])
    println(str[2])

}

/**
 * Any : java Object
 * Unit : java void 비슷 (Unit 자체로 타입 인자 사용 가능),  단 하나의 인스턴스만 갖는 다는 의미
 * Nothing : 함수가 정상적으로 끝나지 않았다는 사실 표현 -> 무조건 예외반환 함수, 무한루프
 */
fun printAgeIfPerson(obj: Any) {
    if (obj is Person) { // is -> java instanceof
        val person = obj // as Person (생략가능) -> java (캐스팅 Type) obj
        println(person.age)

    }
}

fun printAgeIfPersonNullable(obj: Any?) {
    // value as Type ? Type캐스팅 : 예외발생
    // value as? Type ? Type캐스팅 : null
    val person = obj as? Person
    println(person?.age)
}




