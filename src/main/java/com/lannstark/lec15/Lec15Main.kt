package com.lannstark.lec15

fun main() {
    val array = arrayOf(100, 200)
    array.plus(300) // java에서는 copy해서..

    for (i in array.indices) {
        println("${i}, ${array[i]}")
    }

    for ((idx, value) in array.withIndex()) {
        println("${idx}, ${value}")
    }

    // 불변컬렉션, 가변컬렉션
    val numbers1 = listOf(100, 200) // 불변리스트
    val numbers2 = mutableListOf(100, 200) // 가변리스트

    val emptyList = emptyList<Int>() // 타입 초기화

    //하나 가져오기
    println(numbers1.get(0))
    println(numbers1[0])

    //For Each
    for (number in numbers1) {
        println(number)
    }

    //전통적인 For문
    for ((idx, value) in numbers1.withIndex()) {
        println("${idx}, ${value}")
    }

    val set1 = setOf(1,2)
    val set2 = mutableSetOf(1,2)

    val oldMap = mutableMapOf<Int, String>()
    //put 사용 가능
    oldMap[1] = "MONDAY"
    oldMap[2] = "TUESDAY"

    mapOf(1 to "MONDAY", 2 to "TUESDAY")

    for (key in oldMap.keys) {
        println(key)
        println(oldMap[key])
    }

    for ((key, value) in oldMap.entries) {
        println(key)
        println(value)
    }

    // List<Int?> : 리스트에 null 들어갈 수 있지만, 리스트는 절대 null 아님
    // List<Int>? : 리스트에 null이 들어갈 수 없지만 리스트가 null일 수 있음
    // List<Int?>? : 리스트에 null이 들어갈 수 있고, 리스트가 null 일 수 있음







}