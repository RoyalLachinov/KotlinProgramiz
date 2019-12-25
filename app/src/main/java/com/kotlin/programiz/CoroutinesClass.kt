package com.kotlin.programiz

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.newSingleThreadContext
import kotlinx.coroutines.runBlocking

class CorotuinesClass {
}

fun main(args: Array<String>) = runBlocking<Unit> {
    //Launch 200,000 coroutines//
/*    val jobs = List(200_000) {
        launch {
            delay(1000L)
            print("Hello world")
        }
    }
    jobs.forEach { it.join() }*/

    launch(newSingleThreadContext("MyThread")) {

        println("Hello from thread ${Thread.currentThread().name}")

    }


}
