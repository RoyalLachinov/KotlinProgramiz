package com.kotlin.programiz.package_4_oop

//https://www.programiz.com/kotlin-programming/operator-overloading

class KotlinOperatorOverlaoding {
}


class Point(val x: Int = 0, val y: Int = 10) {
    // overloading plus function
    operator fun plus(p: Point) = Point(x - p.x, y - p.y)
}

fun main() {
    var a = 5
    var b = 5

    println(a+b)
    println(a.plus(b))// Here plus() function is a '+' operator's overloading function

    val p1 = Point(3, -8)
    val p2 = Point(2, 9)
    var sum = Point()
    sum = p1 + p2
    println("sum = (${sum.x}, ${sum.y})")

}