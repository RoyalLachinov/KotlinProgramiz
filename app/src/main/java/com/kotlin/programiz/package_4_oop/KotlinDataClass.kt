package com.kotlin.programiz.package_4_oop

//https://www.programiz.com/kotlin-programming/data-class

data class KotlinDataClass(val age:Int, val name: String) {

}

fun main() {
    val kotlinDataClass = KotlinDataClass(age = 8,name = "Khadija")
    println("My daughter's age is ${kotlinDataClass.age} and her name is ${kotlinDataClass.name}")
    val kotlinDataClass2 = kotlinDataClass.copy(name = "Xedish")
    println("My daughter's age is ${kotlinDataClass2.age} and her nick name is ${kotlinDataClass2.name}")
    val kotlinDataClass3 = kotlinDataClass2.copy(age = 9,name = "Hatan")
    println("My daughter's age is ${kotlinDataClass3.age} and her nick name is ${kotlinDataClass3.name}")

    println(kotlinDataClass.toString())

    val hasCode1 = kotlinDataClass == kotlinDataClass2
    println(hasCode1)
    val hasCode2 = kotlinDataClass == kotlinDataClass3
    println(hasCode2)


    //Destructuring Declarations - destructure an object into a number of variables using destructing declaration.
    val(age,name) = kotlinDataClass
    println("Her age is ${age}")
    println("Her name is ${name}")

    //compiler generates componentN() functions all properties for a data class
    println(kotlinDataClass.component1())
    println(kotlinDataClass.component2())
}