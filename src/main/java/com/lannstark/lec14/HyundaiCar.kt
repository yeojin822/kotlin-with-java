package com.lannstark.lec14

sealed class HyundaiCar(val name: String, val price: Long)

class Avante : HyundaiCar("아반떼", 1_000L)
class Sonata : HyundaiCar("소나타", 2_000L)
class Grandeur : HyundaiCar("그렌저", 3_000L)

// 컴파일 타임 때 하위 클래스의 타입을 모두 기억한다.
// 즉, 런카임때 클래스 타입이 추가 될 수 없다.

