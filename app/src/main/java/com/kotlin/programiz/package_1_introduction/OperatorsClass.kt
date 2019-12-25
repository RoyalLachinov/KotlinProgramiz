package com.kotlin.programiz.package_1_introduction

//https://www.programiz.com/kotlin-programming/operators

class OperatorsClass {
}

fun main(args: Array<String>) {
    var number1 = 34
    val number2 = 46

    println("$number1 + $number2 = ${number1 + number2}")
    println("$number1 + $number2 = ${number1.plus(number2)}")
    number1 += number2
    println("$number1")
    val start = "Hello"
    val end = " From Canada"
    println(start + end)


    val max = if (number1 > number2) {
        println("number1 is larger than number2")
        number1
    } else {
        println("numer2 is larger than number1")
        number2
    }
    println("max = $max")

    val arr = intArrayOf(23, 434, 33, 80)
    println(number1 in arr)
    println(arr.contains(number1))
    println(arr[1])
    arr[1] =55
    println(arr[1])

    val list = listOf(33,4,12,435,21)
    println(list.get(3))
    println(list)
}

