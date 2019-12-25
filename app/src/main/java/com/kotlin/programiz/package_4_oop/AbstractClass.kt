package com.kotlin.programiz.package_4_oop

//https://www.programiz.com/kotlin-programming/abstract-class

abstract class AbstractClass constructor(name:String){

    init {
        print("My name is ${name}")
    }
    fun displaySIN(sinNumber:Int){
        println("My SIN is ${sinNumber}")
    }

    abstract fun displayJob(description:String);
}

class MainDoctor(name: String):AbstractClass(name){
    override fun displayJob(description: String) {
        println(" and I do ${description}")
    }
}

fun main() {
    // We have passed "Khadija" as a parameter to the primary constructor while creating it.
    // This executes the initializer block of the AbstractClass class.
    val doctor = MainDoctor("Khadija")
    doctor.displayJob("Medicine")
    doctor.displaySIN(2323)
}