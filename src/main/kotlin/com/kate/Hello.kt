package com.kate

fun main(args: Array<String>) {
//    println("Hello kotlin")
//    Human().hello()
    val h =Human()
    h.hello()
    var age =19
    age = 20
    var weight = 66.5f //kotlin會自動判斷為double，如果希望資料型態為Float可以在最後打f
    var wei : Float =66.5f //或是左邊給資料型態
    var name : String //先定義變數名稱要先給資料型態
    name = "Kate"
}

class Human{
    fun hello() {
        println("Hello kotlin")
    }
}
