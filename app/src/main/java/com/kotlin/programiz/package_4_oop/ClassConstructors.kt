package com.kotlin.programiz.package_4_oop


//https://www.programiz.com/kotlin-programming/constructors

class ClassConstructors(var name: String, var age: Int) {

    val firstName: String
    val mAge: Int

    init {
        firstName = name.capitalize()
        mAge = age
        println("Name is ${firstName} and age is ${mAge}")

    }
}

class SecondaryConstructor {

    var mName: String = ""
    var mAge: Int = 0
    var mAddress: String = ""

    constructor(name: String, age: Int) {

    }

    constructor(address: String, name: String, age: Int) {
        mName = name
        mAge = age
        mAddress = address
    }
}


fun main(args: Array<String>) {
    val classConstructors = ClassConstructors("Royal", 32)
    println("Name of user is ${classConstructors.name} and his age is ${classConstructors.age}")

    val secondaryConstructor = SecondaryConstructor("Toronto", name = "Royal", age = 32)
    println(secondaryConstructor.mName + "  " + secondaryConstructor.mAge + " and " + secondaryConstructor.mAddress)
}