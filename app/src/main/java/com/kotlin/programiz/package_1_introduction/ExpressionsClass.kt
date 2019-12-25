package com.kotlin.programiz.package_1_introduction

//https://www.programiz.com/kotlin-programming/statement-expression

class ExpressionsClass {
}

fun main(args: Array<String>) {
    val number1 = 5
    val number2 = 7

    val result = if (number1 > number2) number1 else number2
    println(result)

    // in the above example "result" is a variable and "if (number1 > number2) number1 else number2" is an expression

    val score = number1 + number2
    println(score)

    // in the above example "val score = number1+number2" is a statement
}