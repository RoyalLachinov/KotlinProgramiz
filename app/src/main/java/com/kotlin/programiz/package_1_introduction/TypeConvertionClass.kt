package com.kotlin.programiz.package_1_introduction

//https://www.programiz.com/kotlin-programming/type-conversion

class TypeConvertionClass {
}

fun main(args: Array<String>) {

    val number1:Byte = 35
    val number2:Int = number1.toInt()
    println(number2)
    val number3:Int = 444
    val numer4:Byte = number3.toByte()
    println(numer4)
}