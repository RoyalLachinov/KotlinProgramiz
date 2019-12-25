package com.kotlin.programiz.package_3_functions

//https://www.programiz.com/kotlin-programming/default-named-arguments

class DefaulArguments {
}

//In the below example we used default arguments and named arguments together

fun calcualte(a:Int = 5,b:Int = 6) = println(a*b)
fun main() {
    calcualte(2,5)
    calcualte(a = 4)
    calcualte(b = 10)
    calcualte()
}