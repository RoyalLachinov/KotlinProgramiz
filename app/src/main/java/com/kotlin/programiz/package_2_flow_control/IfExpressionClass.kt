package com.kotlin.programiz.package_2_flow_control

//https://www.programiz.com/kotlin-programming/if-expression

class IfExpressionClass {
}

fun main(args: Array<String>) {
    //The else branch is mandatory when using if as an expression.

    val number1 = 5
    val number2 = 6

    val max = if (number1 > number2) {
        println("number1 is larger than number2")
        number1
    } else {
        println("number2 is larger than number1")
        number2
    }
    println(max)

    val max2 = if (number1 > number2) "Positive number" else "Negative number"
    println(max2)

    val number = if (number1 == number2)
        println("Numbers are equal")
    else if (number1 > number2)
        println("Number1 is larger than number2")
    else
        println("Number2 is larger than number1")

    println(number)


    //Nested if expression

    val n1 = 3
    val n2 = 5
    val n3 = -2
    val max3 = if (n1 > n2) {
        if (n1 > n3)
            n1
        else
            n3
    } else {
        if (n2 > n3)
            n2
        else
            n3
    }
    println("max = $max3")

}