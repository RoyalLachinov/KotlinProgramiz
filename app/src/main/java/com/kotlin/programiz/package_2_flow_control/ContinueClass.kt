package com.kotlin.programiz.package_2_flow_control

//https://www.programiz.com/kotlin-programming/continue

class ContinueClass {
}

fun main() {
    for (i in 0..10) {
        if (i == 5)
            continue
        print("$i ")
    }


    for (i in 1..5) {
        println("$i Always printed.")
        if (i in 2..4) {
            continue
        }
        println("$i Not always printed.")
    }


    var sum = 0
    var input: Int?

    while (true) {
        println(" Enter a digit")
        input = readLine()!!.toInt()

        if (input == 0)
            break //continue

        sum += input

        print(sum)

    }


    here@ for (i in 1..5) {
        for (j in 1..4) {
            if (i == 3 || j == 2)
                continue@here
            println("i = $i; j = $j")
        }
    }


}