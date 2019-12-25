package com.kotlin.programiz.package_1_introduction

import java.util.*

//https://www.programiz.com/kotlin-programming/input-output

class InputClass {
}

fun main(args: Array<String>) {
    println("Enter your string")

    val newString: String? = readLine()
    println("You entered $newString")

    val reader = Scanner(System.`in`)
    println("Enter your first number")
    val number1 = reader.nextInt()
    println("Enter your second number")
    val  number2 = reader.nextInt()
    println("Result of these two numbers adding is ${number1+number2}")

}