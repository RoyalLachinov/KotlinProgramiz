package com.kotlin.programiz.package_4_oop

//https://www.programiz.com/kotlin-programming/interfaces

interface MyInterface {
    var sinNumber: Int
    fun showJobDescription()
    fun showSinNumber() {
        println("My SIN is $sinNumber")
    }

    fun callMe(){
        println("From MyInterface")
    }
}

interface YourInterface {
    fun showMyHomeCity()
    fun callMe(){
        println("From YourInterface")
    }
}

class KotlinInterfaces : MyInterface, YourInterface {
    override var sinNumber: Int = 2323

    override fun showJobDescription() {
        println("My name is Khadija nad my job is Medicine")
    }

    override fun showMyHomeCity() {
        println("I was born in Baku, Azerbaijan, but my home city is Sheki,Azerbaijan")
    }

    override fun callMe() {
        super<MyInterface>.callMe()
        super<YourInterface>.callMe()
    }
}

fun main() {
    val kotlinInterfaces = KotlinInterfaces()
    kotlinInterfaces.showSinNumber()
    kotlinInterfaces.showJobDescription()
    kotlinInterfaces.showMyHomeCity()
    kotlinInterfaces.callMe()
}