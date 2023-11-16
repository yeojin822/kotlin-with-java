package com.lannstark.lec05

// 조건문
fun main() {

}

fun validateScoreIsNotNegative(score: Int) {
    if (score < 0) {
        throw IllegalArgumentException("${score}는 0보다 작을 수 없습니다.")
    }
}

fun validate(score: Int) {
    if (score !in 0..100) {
        throw IllegalArgumentException("score의 범위는 0부터 100입니다.")
    }
}

fun getPassOrFail(score: Int): String {
    if (score >= 90) {
        return "P"
    } else {
        return "F"
    }
}

/**
 * Statement : 프로그램의 문장, 하나의 값으로 도출되지 않는다.
 * Expression : 하나의 값으로 도출되는 문장
 */

// java에서 if_else 는 statement 이지만
// kotlin에서는 expression
// 그래서 3항 연산자가 없다. (java : return score >= 50 ? "P" : "F")
fun getPassOrFailExpression(score: Int): String {
    return if (score >= 90) {
        "P"
    } else {
        "F"
    }
}

fun getGrade(score: Int): String {
    return if (score >= 90) {
        "A"
    } else if (score >= 80) {
        "B"
    } else if (score >= 70) {
        "C"
    } else {
        "D"
    }
}

fun getGradeWithSwitch(score: Int): String {
    // when(switch)
    // ->(:)
    // else(default)
    return when (score / 10) {
        9 -> "A"
        8 -> "B"
        7 -> "C"
        else -> "D"
    }
}

fun startsWithAIf(any: Any): Boolean {
    return if (any is String) {
        any.startsWith("A")
    } else {
        false
    }
}

fun startsWithAWhen(any: Any): Boolean {
    return when (any) {
        is String -> any.startsWith("A") //스마트 캐스트
        else -> false
    }
}

fun judgeNumber(number: Int) {
    when (number) {
        1, 0, -1 -> println("어디서 많이 본 숫자입니다.")
        else -> println("1, 0, -1이 아닙니다.")
    }
}

fun judgeNumber2(number: Int) {
    when {
        number == 0 ->  println("주어진 숫자는 0입니다")
        number % 2 == 0 -> println("주어진 숫자는 짝수입니다.")
        else -> println("주어진 숫자는 홀수입니다.")
    }
}