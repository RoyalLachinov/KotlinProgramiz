package com.kotlin.programiz.package_4_oop

//https://www.programiz.com/kotlin-programming/companion-objects

class KotlinCompanianObject {

    companion object{
        fun print(){
            println("This lesson is about companion object")
        }
    }
}

fun main() {
    KotlinCompanianObject.print()
}