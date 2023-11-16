package com.lannstark.lec07

import java.io.BufferedReader
import java.io.File
import java.io.FileReader
import java.lang.NumberFormatException

// 예외처리
fun main() {

}

fun parseIntOrThrow(str: String): Int {
    try {
        return str.toInt()
    } catch (e: NumberFormatException) {
        throw IllegalArgumentException("주어진 ${str}는 숫자가 아닙니다.")
    }
}

fun parseIntOrThrowV2(str: String): Int? {
    return try {
        str.toInt()
    } catch (e: NumberFormatException) {
        null
    }
}

fun readFile() {
    // IOException throws 구문이 없다
    // 코틀린은 모두 UnChecked Exception 이다.
    val currentFile = File(".")
    val file = File(currentFile.absolutePath + "/a.txt")
    val reader = BufferedReader(FileReader(file))
    println(reader.readLine())
    reader.close()
}

fun readFile(path: String) {
    // 코틀린에서는 try with resources 구문이 없다.
    // 언어적 특성을 이용해서 close 해준다.
    BufferedReader(FileReader(path)).use { reader ->
        println(reader.readLine())
    }
}



