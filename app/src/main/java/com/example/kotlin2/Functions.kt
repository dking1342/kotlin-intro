package com.example.kotlin2

fun function() {
    println(greeting())
    sayHello()
    println(singleExpressionFunction())
    println(greetPerson("Kavooce"))
    println(inlineGreen("Jack"))
}


fun greeting():String{
    return "Hello Kotlin from basic functions"
}

fun sayHello():Unit {
    println("say hello is a void return")
}

fun singleExpressionFunction(): String = "Inline function"

fun greetPerson(name:String): String {
    return "Hello $name"
}

fun inlineGreen(name:String): String = "Howdy $name"