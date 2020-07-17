package com.example.jklom0326.chap07.section1

// 추상클래스, 주생성자에는 비추상 프로퍼티 선언의 매개변수 3개가 있음
abstract class Vehicle(val name: String,val color: String, val weight: Double){
    // 추상프로퍼티(반드시 하위클래스에서 재정의해 초기화 해야함)
    abstract var maxSpeed: Double

    //일반 프로퍼티 (초깃값인 상태를 저장할 수 있음)
    var year = "2020"

    // 추상메서드 (반드시 하위클래스에서 구현해야함)

    abstract fun start()
    abstract fun stop()

    //일반 메서트
    fun displaySpecs(){
        println("Name: $name, Color: $color, Weight: $weight,Year: $year, MaxSpeed: $maxSpeed")
    }
}

