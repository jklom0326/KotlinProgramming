package com.example.jklom0326.chap02.section1

import com.example.jklom0326.Person as User

fun main(){
    val user1 = User("kildong",30)
    val user2 = Person("a123","kildong")

    println(user1.name)
    println(user1.age)

    println(user2.id)
    println(user2.name)
}

class Person(val id:String,val name: String)

