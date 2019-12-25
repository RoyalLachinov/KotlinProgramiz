package com.kotlin.programiz.package_4_oop

//https://www.programiz.com/kotlin-programming/extension-functions

class KotlinExtentionFunctions {
}

fun String.removeFirstLastChar(): String = this.substring(1, this.length - 1)
fun main() {

    val myString = "Hello Everyone"
    val result = myString.removeFirstLastChar()
    println(result)
}