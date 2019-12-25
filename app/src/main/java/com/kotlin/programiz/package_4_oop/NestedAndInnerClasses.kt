package com.kotlin.programiz.package_4_oop

import android.os.Build.VERSION_CODES.N

//https://www.programiz.com/kotlin-programming/inner-nested-class

class NestedAndInnerClasses {

    val outsideProp = "Outside Nested Class"

    class NestedClass {
        val nestedProp = "Inside nested class"
        fun nested() {
            println("Function from a nested class")
        }
    }

   inner class InnerClass{
       //Without initializing a class "inner" we can't access outer class members
        fun foo() = outsideProp
    }
}

fun main() {

    println(NestedAndInnerClasses().outsideProp)
    println(NestedAndInnerClasses.NestedClass().nestedProp)
    println(NestedAndInnerClasses.NestedClass().nested())
    println(NestedAndInnerClasses().InnerClass().foo())
}