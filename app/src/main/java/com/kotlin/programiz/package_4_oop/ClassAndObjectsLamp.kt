package com.kotlin.programiz.package_4_oop

//https://www.programiz.com/kotlin-programming/class-objects

class ClassAndObjectsLamp {

    // property (data member)
    private var isOn: Boolean = false

    // member function
    fun turnOn() {
        isOn = true
    }

    // member function
    fun turnOff() {
        isOn = false
    }

    fun displayLightStatus() {
        if (isOn == true)
            println("lamp is on.")
        else
            println("lamp is off.")
    }
}

fun main(args: Array<String>) {
    val lamp = ClassAndObjectsLamp()
    lamp.displayLightStatus()
}