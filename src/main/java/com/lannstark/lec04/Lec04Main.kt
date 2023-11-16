package com.lannstark.lec04

import java.time.temporal.TemporalAmount

fun main() {
    val money1 = JavaMoney(2_000L)
    val money2 = JavaMoney(1_000L)

    // 객체를 비교할때 비교연산자 사용 가능, 자동으로 CompareTo 호출
    if (money1 > money2) {
        println("Money1이 Money2보다 금액이 큽니다.")
    }

    /*
    * 동등성(Equality) : 두 객체의 값이 같은가
    *   java : equals, kotlin : ==
    * 동일성(Identity) : 완전히 동일한 객체인가 (즉 주소가 같은가)
    *   java: ==, kotlin : ===
    */

    val money3 = JavaMoney(2_000L)
    val money4 = money3
    val money5 = JavaMoney(2_000L)

    println(money3 === money4) //true
    println(money3 === money5) //false
    println(money3 == money5) //true

    val kotlinMoney1 = Money(1_000L)
    val kotlinMoney2 = Money(2_000L)

    println(kotlinMoney1.plus(kotlinMoney2))
    println(kotlinMoney1 + kotlinMoney2)

}

data class Money(val amount: Long) {
    operator fun plus(other: Money): Money {
        return Money(this.amount + other.amount)
    }
}

/**
 * in / in! : 컬랙션이나 범위에 포함되어 있다, 있지않다
 * a..b : a부터 b까지의 범위 객체를 생성한다.
 */

