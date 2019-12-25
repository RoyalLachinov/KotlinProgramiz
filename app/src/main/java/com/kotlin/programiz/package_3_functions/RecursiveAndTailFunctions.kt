package com.kotlin.programiz.package_3_functions

import java.math.BigInteger

//https://www.programiz.com/kotlin-programming/recursion

class RecursiveAndTailFunctions {
}

fun main(args: Array<String>) {
    val number:Int = 5
    var result: Long

    result = fuctorial(5)
    println("Factorial of $number = $result")

    val n = 10
    val first = BigInteger("0")
    val second = BigInteger("1")
    println(fibonacci(n, first, second))

}

fun fuctorial(number: Int): Long {
    return if (number == 1) number.toLong() else number * fuctorial(number - 1)
}

tailrec fun fibonacci(n: Int, a: BigInteger, b: BigInteger): BigInteger {
    return if (n == 0) a else fibonacci(n-1, b, a+b)
}
