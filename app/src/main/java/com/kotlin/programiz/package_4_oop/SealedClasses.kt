package com.kotlin.programiz.package_4_oop

//https://www.programiz.com/kotlin-programming/sealed-class

sealed class A(val i: Int) {}
open class B(val a: Int, val b: Int) : A(a) {}
open class C(val c: Int, val d: Int, val e: Int) : A(c) {}
class SealedClasses {
}

fun main() {
    fun eval(a:A):Int = when(a){
        is B -> a.a+a.b
        is C -> a.c+a.d+a.e
    }

    val c = C(1,2,3)
    println(eval(c))
}