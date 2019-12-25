package com.kotlin.programiz.package_2_flow_control

//https://www.programiz.com/kotlin-programming/break

class BreakClass {
}


fun main(args: Array<String>) {
    for (i in 0..10) {
        if (i == 5)
            break
        print("$i ")
    }


    var sum = 0
    var input: Int

    while (true) {
        println("Enter your digit")
        input = readLine()!!.toInt()

        sum += input
        if (input == 0)
            break

        println(sum)
    }

    first@ for (i in 0..4) {

        second@ for (j in 0..3) {
            println("i = $i; j = $j")

            if (j == 2)
                break@second
        }
    }

    println("-------------------------")

    first@ for (i in 0..4) {

        second@ for (j in 0..3) {
            println("i = $i; j = $j")

            if (i == 2)
                break@second
        }
    }
}
