package com.kotlin.programiz.package_3_functions

//https://www.programiz.com/kotlin-programming/functions

class FunctionClass {

    infix fun createPyramid(rows: Int) {
        var k = 0
        for (i in 1..rows) {
            k = 0
            for (space in 1..rows-i) {
                print("  ")
            }
            while (k != 2*i-1) {
                print("* ")
                ++k
            }
            println()
        }
    }
}


fun main(args: Array<String>) {
    var a  = true
    var b = false

    var result1 = a or b //a.or(b)
    var result2 = a xor b //a.xor(b)
    var result3 = a and b //a.and(b)
    println("result1 is $result1")
    println("result2 is $result2")
    println("result3 is $result3")

    val functionClass = FunctionClass()
    functionClass createPyramid 6

}
