package com.kotlin.programiz.package_5_advanced_kotlin

//https://medium.com/better-programming/advanced-android-programming-with-kotlin-5e40b1be22bb

class KotlinExtentions {
}

fun main() {

    val numbers = arrayListOf("one", "two", "three", "four", "five")
    val filteredList = numbers.filter { it.length > 3 }
    println("Filtered list is: " + filteredList)
    val singleList = numbers.single { it.contains("th") }
    println("Single list is: " + singleList)
    val firstElement = numbers.first()
    println("First Element is: " + firstElement)
    val lastElement = numbers.last()
    println("Last Element is: " + lastElement)
    val firstElement2 = numbers.first { it.contains("f") }
    println("First element filtered if: " + firstElement2)

}