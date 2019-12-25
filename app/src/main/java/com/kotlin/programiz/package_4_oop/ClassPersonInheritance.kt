package com.kotlin.programiz.package_4_oop

//https://www.programiz.com/kotlin-programming/inheritance

open class ClassPersonInheritance constructor(name: String) {

   open var age:Int = 0

    init {
        println("My name is ${name} and age is ${age}")
        talk(name)
        eat(name)
        walk(name)
    }

    fun talk(person: String) {
        println("${person} is talking")
    }

    fun eat(person: String) {
        println("${person} is eating")
    }

    fun walk(person: String) {
        println("${person} is walking")
    }
}

class Teacher(var name: String) : ClassPersonInheritance(name) {
    override var age: Int
        get() = 27
        set(value) {}
    fun teach() {
        println("I do teaching")
    }
}

class Doctor(var name: String) : ClassPersonInheritance(name) {

    override var age: Int
        get() = 8
        set(value) {}
    fun care() {
        println("I do surgery")
    }

}

class Engineer(var name: String) : ClassPersonInheritance(name) {

    override var age: Int
        get() = 32
        set(value) {}
    fun code() {
        println("I do coding")
    }
}

fun main(args: Array<String>) {
    val teacher = Teacher("Turkan")
    teacher.teach()

    println("--------------------------------")
    val doctor = Doctor("Xedish")
    doctor.care()

    println("--------------------------------")
    val engineer = Engineer("Royal")
    engineer.code()
}