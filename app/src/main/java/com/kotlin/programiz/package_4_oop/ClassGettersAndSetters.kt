package com.kotlin.programiz.package_4_oop

//https://www.programiz.com/kotlin-programming/getters-setters

class ClassGettersAndSetters {

    var name:String = "default value"

    get() = field

    set(value) {

        field = if(value == "Royal")
            "Royal"
        else if(value == "Xedish"){
            "Xedish"
        }else{
            "Turkan"
        }
    }
}


fun main(args: Array<String>) {
    var classGettersAndSetters = ClassGettersAndSetters()
    classGettersAndSetters.name = "Xedish"
    println(classGettersAndSetters.name)
}