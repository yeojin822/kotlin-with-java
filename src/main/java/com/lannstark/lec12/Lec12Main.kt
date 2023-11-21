package com.lannstark.lec12

fun main() {
    //  익명 클래스
  moveSomething(object : Movable{
      override fun fly() {
          println("난다.")
      }

      override fun move() {
         println("움직인다.")
      }
  })
}

private fun moveSomething(movable: Movable) {
    movable.move()
    movable.fly()
}