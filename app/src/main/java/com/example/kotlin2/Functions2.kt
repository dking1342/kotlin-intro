package com.example.kotlin2

// vararg will be treated as an array/list of the data type
// eliminates the need to enter a list as a parameter
fun sayHello(greeting:String, vararg itemsToGreet:String){
    itemsToGreet.forEach { itemToGreet ->
        println("$greeting $itemToGreet")
    }
}

fun greetPerson(greeting:String, name: String) = println("$greeting $name")

// using default values
fun greetFriend(greeting:String = "hello", name: String = "friend") = println("$greeting $name")


fun functions2(){

    val interestingAnimals = listOf<String>("Lion", "Tiger", "Bear")
    sayHello("Hey","Koala", "Gator","Buffalo","Hippo")

    // using the spread operator which is *
    // can only use spread operator on arrayOf
    val interestingThings = arrayOf("Pots","Pans","Kettle")
    sayHello("Howdy", *interestingThings)
    sayHello(greeting="salaam", itemsToGreet = *interestingThings)

    // named arguments
    // specify which order the parameters will be sequenced
    // order of the parameters do not matter when doing this
    greetPerson(greeting= "hi", name="kavooce")

    // working with function with default values
    greetFriend()
    greetFriend("hola")
    greetFriend(name="amigo")
    greetFriend("hola", "amigo")


}