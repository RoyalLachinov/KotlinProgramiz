package com.kotlin.programiz.package_4_oop

import android.media.midi.MidiOutputPort

//https://www.programiz.com/kotlin-programming/object-singleton

object KotlinSingleton {
    private var a: Int = 0
    var b: Int = 1

    fun make12(): Int {
        a = 12;
        return a
    }
}

open class ExpessionClass{
    fun eat() = println("Eating food.")
    fun talk() = println("Talking with people.")
    open fun pray() = println("Praying god.")
}

open class ExpessionClass2 constructor(val age:Int, val name:String){
    fun eat() = println("Eating food.")
    fun talk() = println("Talking with people.")
    open fun pray() = println("Praying god.")
}

fun main() {
    var result:Int
    result = KotlinSingleton.make12()
    println("b = ${KotlinSingleton.b}")
    println("result = ${result}")

    val ateist = object : ExpessionClass(){
        override fun pray()  = print("Atesit does not pray")
    }

    ateist.eat()
    ateist.talk()
    ateist.pray()

    println()

    var ateist2 = object : ExpessionClass2(40,"John"){
        override fun pray() =  println("John is not praying, coz he is ateist")
    }
    ateist2.eat()
    ateist2.talk()
    ateist2.pray()
}