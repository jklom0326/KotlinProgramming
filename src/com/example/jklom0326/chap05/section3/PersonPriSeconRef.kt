package com.example.jklom0326.chap05.section3.seconref

class Person(firstName: String, out: Unit = println("[Primary Constructor] Parameter")){// (2) 주 생성자
    val fName = println("[Primary Constructor] Person fName $firstName") // (3) 프로퍼티 할당

    init {
        println("[init] Person init block")
    }

    constructor(firstName: String, age: Int, out: Unit = println("[Secondary Constructor] Parameter")) : this(firstName){
        println("[Secondary Constructor] Body : $firstName, $age")
    }
}

fun main() {
    val p1 = Person("Kildong", 30)
    println()
    val p2 = Person("Dooly")
}