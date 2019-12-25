package com.kotlin.programiz.package_2_flow_control

//https://www.programiz.com/kotlin-programming/for-loop

class ForLoopClass {
}


fun main() {
    var i = 0
    for (i in 3..5)
        print("$i ")

    println()

    for (b in 5 downTo 0)
        print("$b ")

    println()

    for (b in 0 until 10)
        print("$b ")

    println()

    for (b in 0 until 10 step 2)
        print("$b ")

    println()

    val array = arrayOf(1, 2, 3, 4, 5, 6, 8, 9, 0, 23, 123, 2)
    for (i in array)
        print("$i ")

    println()

    for (item in array.indices)
        print("${array[item]} ")

    println()

    var text = "Ilikekotlin"
    for (letter in text)
        print("${letter} ")

    println()

    for (letter in text.indices)
        print("${text[letter]} ")
}