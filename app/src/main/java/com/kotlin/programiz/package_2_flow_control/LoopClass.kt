package com.kotlin.programiz.package_2_flow_control

//https://www.programiz.com/kotlin-programming/while-loop

class LoopClass {
}


fun main(args: Array<String>) {
    var i = 10

    while (i >= 0) {
        --i//i--
        print("$i ")
        //i--
    }

    var b = 100
    var sum = 0
    while (b != 0) {
        sum += b
        b--
    }
    println(sum)

    var sum2 = 0;
    var intput: String;
    do {
        println("Input an integer")
        intput = readLine()!!
        sum += intput.toInt()

    } while (intput != "0")

    println(sum2)
}