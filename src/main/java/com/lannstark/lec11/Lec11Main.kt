package com.lannstark.lec11


class Car (
    internal val name: String,
    private var owner: String,
            _price : Int){
    var price = _price
        private set

}


// kotlin internal -> java public 주의
// kotlin protected != java protected 주의
