package com.example.kotlin2

// global variables
// can be accessed anywhere, in global scope
val lastName: String = "Jones"
var age: Int = 30
var location: String? = "Italy" // ? is an optional that could make it a null value
var company = "IBM"

fun variables(){
    // variables
    // mutable -- var
    // local readonly -- val
    // all variables are non null initially
    // types can be inferred if Kotlin can determine it unless it is null
    // scoping is important depending on the placement of the variable

    val name: String = "Kavooce"
    var firstName: String = "Jack"

    println(name)
    println(String.format("%s %s is my name and I am %s years old and I live in %s and I work at %s",firstName, lastName, age, location, company))

}