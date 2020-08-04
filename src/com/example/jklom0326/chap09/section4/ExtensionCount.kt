package com.example.jklom0326.chap09.section4

fun main() {
    val list = listOf(1,2,3,4,5,6)
    val listPair = listOf(Pair("A",300), Pair("B", 200), Pair("C", 100))
    val map = mapOf(11 to "Java", 22 to "Kotlin", 33 to "C++")

    list.forEach { print("$it") }
    println()
    list.forEachIndexed { index,value -> println("index[$index] : $value") }

    val returnedList = list.onEach { print(it) }
    println()
    // 순환 처리를 위해 사용하는 forEach 와 forEachIndexed
    val returnedMap = map.onEach { println("key ${it.key}, value: ${it.value}") }
    println("returnedList = $returnedList")
    println("returnedMap = $returnedMap")
    // 특정 조건에 일치하는 요소의 개수를 반환하는 count
    println()
    println(list.count { it % 2 == 0 })

    println()
    // fold : 초기값과 정해진 식에 따라 처음 요소부터 끝 요소에 적용하며 값을 생성
    println(list.fold(4){total,next -> total + next}) // 4+1+ ... 6 = 25
    println(list.fold(1){total,next -> total * next}) // 1*1*2* ... 6 = 720
    println()
    //foldRight : fold 와 같고 마지막 요소에서 처음 요소로 반대로 적용
    println(list.foldRight(4){total,next -> total + next})
    println(list.foldRight(1){total,next -> total + next})
    println()
    //reduce : fold와 동일하지만 초기값을 사용하지않음
    println(list.reduce {total,next -> total + next})
    println(list.reduceRight {total,next -> total + next})

    val listWithNull = listOf(1, null, 3, null, 5,6)

    println()
    //filter: 식에 따라 요소를 골라내기
    println(list.filter { it % 2 == 0 })
    println(list.filterNot { it % 2 == 0 })
    println(listWithNull.filterNotNull())

    // filterIndexed: 인덱스와 함게 추출
    println("filterIndexed :" + list.filterIndexed{idx, value -> idx != 1 && value % 2 == 0})

}