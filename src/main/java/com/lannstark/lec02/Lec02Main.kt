package com.lannstark.lec02

// null을 다루는 방법
fun main() {
    // Safe Call ' ? ' -> null 아니면 실행 O null 이면 실행 X (그대로 null)
    var str: String? = "ABC" // str.length 불가능
    println(str?.length)

    // Elvis 연산자 ' ?: ' -> 앞의 연산 결과가 null이면 뒤의 값을 사용
    str = null // str.length 불가능
    println(str?.length ?: 0)

    val person = Person("테스트")
    // 코틀린이 java class @Nullable 를 이해한다.
    // 플랫폼 타입 (코틀린이 null 관련 정보를 알 수 없는 타입)
    // -> runtime 시 Exception 발생가능
     startsWith(person.name)

}

fun startsWith(str: String): Boolean {
    return str.startsWith("A")
}

/*
* 코들린은 문맥상 null 체크를 해주면 컴파일러가 자동으로 추측해줌
* null이 가능한 타입을 완전히 다르게 취급한다.
* */
fun startsWithA1(str: String?): Boolean {
    if (str == null) {
        throw IllegalArgumentException("null이 들어왔습니다.")
    }
    return str.startsWith("A")
}

fun startsWithA1_1(str: String?): Boolean {
    return str?.startsWith("A")
        ?: throw IllegalArgumentException("null이 들어왔습니다.")
}

fun startsWithA2(str: String?): Boolean? {
    if (str == null) {
        return null
    }
    return str.startsWith("A")
}

fun startsWithA2_1(str: String?): Boolean? {
    return str?.startsWith("A")
}

fun startsWithA3(str: String?): Boolean {
    if (str == null) {
        return false
    }
    return str.startsWith("A")
}

fun startsWithA3_1(str: String?): Boolean {
    return str?.startsWith("A")
        ?: false
}

fun startsWithNeverNull(str: String?): Boolean {
    // nullable 한 필드이지만 어떤경우에도 null이 될 수 없는 경우
    // ' !! '  사용
    // 혹시나 null이 들어오면 NPE 나오기 때문에 주의
    return str!!.startsWith("A")

}