package com.kotlin.programiz.package_2_flow_control

//https://www.programiz.com/kotlin-programming/when-expression

class WhenExpressionClass {
}

fun main(args: Array<String>) {

    val a = 10
    val b = 5

    println("Enter operator either +, -, * or /")

    val operator1 = readLine()

    //when operator as an expression
    val result1 = when(operator1){
        "+" -> println("$a + $b = ${a+b}")
        "-" -> println("$a - $b = ${a-b}")
        "*" -> println("$a * $b = ${a*b}")
        "/" -> println("$a / $b = ${a/b}")
        else -> print("$operator1 operator is invalid operator.")
    }

    println("result is $result1")


    println("Enter operator either +, -, * or /")

    val operator2 = readLine()
    val result2 = when(operator2){
        "+" -> a+b
        "-" -> a-b
        "*" -> a*b
        "/" -> a/b
        else -> print("$operator2 operator is invalid operator.")
    }
    println(result2)

    val c = 10

    when(c){
        1,2,3,4 -> println("c is either 1,2,3 or 4")
        0 -> println("c is zero")
        -1,-2 -> println("c is negative number")
        in 5..10 -> println("c is in between 5 and 10")
    }

}