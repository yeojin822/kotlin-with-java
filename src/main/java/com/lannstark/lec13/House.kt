package com.lannstark.lec13


fun main() {

}

// 자바에서 말하는 권장되는 중첩 클래스
class JavaHouse1(
    private val address: String,
    private val livingRoom: LivingRoom,
) {
    class LivingRoom(
        private val area: Double
    )
}

// 권장되지 않는 클래스 안에 클래스 (바깥 클래스 참조)
class JavaHouse2(
    var address: String,
) {
    var livingRoom = this.LivingRoom(10.0)

    inner class LivingRoom(
        private val area: Double
    ) {
        val address: String
            get() = this@JavaHouse2.address
    }
}