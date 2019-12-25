package com.kotlin.programiz.package_1_introduction

//https://www.programiz.com/kotlin-programming/variable-types

class DataTypes {
}

/*
* Kotlin is a statically typed language like Java. That is, the type of a variable
* is known during the compile time.
 */

fun main(args: Array<String>) {
    var language: String
    language = "test"

    /*
    In the aboove example If we take out variable type we will get compilation error.
    So the variable must either have a type annotation or must be initialized
     */

    var test: Number = 12
    // Int smart cast from Number
    println(test)

    test = 12.2
    // Double smart cast from Number
    println(test)

    test = 1212121L
    // Long smart cast from Number
    println(test)


    var letter:Char = 'C'
    println(letter)
    //Unlike Java, Char types cannot be treated as numbers, in the below example
   // letter = 45
}