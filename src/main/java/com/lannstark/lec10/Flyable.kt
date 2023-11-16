package com.lannstark.lec10

interface Flyable {
    // default 키워드 없이 구현 가능
    // 추상메서드도 가능
    fun act() {
        println("파닥 파닥")
    }
}