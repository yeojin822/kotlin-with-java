package com.lannstark.lec10

class Penguin(
    species: String
) : Animal(species, 2), Swimable, Flyable {
    val wingCount: Int = 2
    override fun move() {
        println("펭귄이 움직입니다~ 꿱꿱")
    }

    // 코틀린은 자바와 달리 프로퍼티를 오버라이드 할대 open 키워드를 붙여줘야함.
    override val legCount: Int
        get() = super.legCount + this.wingCount

    override fun act() {
        //중복되는 인터페이스를 추론할때는 <> 사용
        super<Swimable>.act()
        super<Flyable>.act()
    }

}