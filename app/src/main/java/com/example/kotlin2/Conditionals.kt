package com.example.kotlin2

fun conditionals(){

    // conditionals

    var isOpen = false
    var greeting: String? = null

    // if else statement
    if(isOpen){
        println(String.format("The store is %s", isOpen))
    } else {
        println(String.format("The store is %s", isOpen))
    }

    // when statement
    when(greeting){
        null -> println("Hi")
        else -> println(greeting)
    }

    // inline if else statement
    val greetingToPrint = if(greeting != null) greeting else "Hi"
    val greetingToPrintWhen = when(greeting){
        null -> "Hello"
        else -> greeting
    }
    println(String.format("%s and %s are the result of input value to check", greetingToPrint, greetingToPrintWhen))

}