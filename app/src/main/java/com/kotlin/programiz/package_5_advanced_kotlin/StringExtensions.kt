package com.kotlin.programiz.package_5_advanced_kotlin

import java.util.regex.Pattern

//https://medium.com/better-programming/advanced-android-programming-with-kotlin-5e40b1be22bb

class StringExtensions {
}

fun main() {
    val EMAIL_ADDRESS_PATTERN = Pattern
        .compile("[a-zA-Z0-9\\+\\.\\_\\%\\-\\+]{1,256}" + "\\@"
                + "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}" + "(" + "\\."
                + "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,25}" + ")+")
    fun String.isvalidEmail(): Boolean {
        return EMAIL_ADDRESS_PATTERN.matcher(this).matches()
    }

    println("royal@actocom".isvalidEmail())

    fun String?.checkIsNullOrEmpty() : Boolean{
        return !this.isNullOrEmpty() && !this.equals("null",ignoreCase = true)
    }

    fun String.startShowingMentions() : Boolean {
        return checkIsNullOrEmpty() && this.endsWith("@")
    }

    println(" ".checkIsNullOrEmpty())
    println("@".startShowingMentions())
}