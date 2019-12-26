package com.kotlin.programiz.package_5_advanced_kotlin

//https://medium.com/better-programming/advanced-android-programming-with-kotlin-5e40b1be22bb

class ScopedFunctions {
}

fun main() {
    //Let’s see a usage of the let block:
    val name = "Royal"
    name.let {
        println(it)
        it.toLowerCase().let {
            println(it)
        }
    }

    //Same functionality without using let
    var name2:String? = "xedish"
    println(name2)
    name2?.capitalize()
    println(name2)
    name2 = null
    println(name2)


    // run - unlike the let, it does not support the it keyword
    var tutorial = "This is Kotlin Tutorial"
    println(tutorial)
    tutorial = run {
        val tutorial = "This is run functoin"
        tutorial
    }
    println(tutorial)//This is run function

    //apply
    var testApply = "This is apply function"
    println(testApply)
    testApply.apply {
        this.toLowerCase()
    }
    println(testApply)
}