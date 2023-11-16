package com.lannstark.lec09

//코틀린 생성자는 위에 써야한다.

fun main() {
    val person = Person("테스트", 100)
    //getter
    println(person.name)
    //setter
    person.age = 10
    println(person.age)

    // 역순으로 실행된다. 초기화 -> 첫번째 -> 두번째
    val person2 = PersonV2()
    println(person2)

    // 코틀린에서는 부생성자보다 default parameter를 권장한다.
    val person3 = PersonV3()

    // converting과 같은 경우 정적 팩토리 메소드를 추천한다.


}

class Person constructor(name: String, age: Int) {
    //kotlin 에서는 필드만 만들면 자동으로 getter, setter를 만들어줌
    val name = name
    var age = age
}

class PersonV1(val name: String, var age: Int)
// constructor 생략가능
// 생성자에 프로퍼티를 만들 수 있다.
// body에 아무것도 없어서 생략 가능


class PersonV2(val name: String, var age: Int) {
    //주 생성자 : 반드시 존재해야한다.


    // 생성자 검증로직
    // 클래스가 초기화 되는 시점에 한번 호출되는 블록
    init {
        if (age <= 0) {
            throw IllegalArgumentException("나이는 ${age}일 수 없습니다.")
        }
        println("초기화 블록")
    }

    // 부 생성자
    // 최종적으로 주 생성자를 this로 호출해야한다.
    // body를 가질 수 있다.
    constructor(name: String) : this(name, 1) {
        println("첫번째 부생성자")
    }

    constructor() : this("홍길동") {
        println("두번째 부생성자")
    }
}

class PersonV3(
    name: String = "테스트",
    var age: Int = 1
) {
    // setter
    var name = name
        set(value) {
            field = value.uppercase()
        }

    /*  getter
        // 1. field custom getter
        val name = name
            get() = field.uppercase() // name.uppercase() 무한루프를 막기위해서 예약어 사용 (backing field)

        // 2
        fun getUppercase(): String {
            return this.name.uppercase()
        }
        // 3
        val uppercaseName: String
            get() = this.name.uppercase()*/

    init {
        if (age <= 0) {
            throw IllegalArgumentException("나이는 ${age}일 수 없습니다.")
        }
        println("초기화 블록")
    }

    // custom getter : 해당 클래스에 프로퍼티가 있는 것처럼 보여주는 것
    // 객체의 속성이라면 custom getter 그렇지 않다면 함수 추천

    // [함수]
//    fun isAdult(): Boolean {
//        return this.age >= 20
//    }

    // [custom getter]
    val isAdult: Boolean
        get() = this.age >= 20

    val isAdultV1: Boolean
        get() {
            return this.age >= 20
        }
}
