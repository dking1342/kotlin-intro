package com.example.kotlin2

import android.os.Build
import androidx.annotation.RequiresApi

@RequiresApi(Build.VERSION_CODES.N)
fun collections(){
    val interestingThings = arrayOf("Kotlin", "Programming", "Sports")

    // methods with arrays
    println(interestingThings.size)
    println(interestingThings[0])
    println(interestingThings.get(0))

    // looping over the array
    for (thing in interestingThings) {
        println("first loop $thing")
    }

    interestingThings.forEach {
        println("second loop $it")
    }

    interestingThings.forEach { thing ->
        println("third loop $thing")
    }

    // index in the function
    interestingThings.forEachIndexed { index, thing ->
        println("$thing is at index $index")
    }


    // lists
    val interestingAnimals = listOf("Lion", "Koala", "Gator")

    // methods
    var animalCount = interestingAnimals.count()
    println("animal count is $animalCount")


    // maps
    val map = mapOf(1 to "a", 2 to "b", 3 to "c")

    // looping maps
    map.forEach { key, value ->
        println("$key -> $value")
    }


    // mutable list
    val interestingSports = mutableListOf("Soccer", "Football", "Basketball")

    val sports = mutableMapOf(1 to "a", 2 to "b", 3 to "c")
    sports.forEach { key, value ->
        println("$key is to $value")
    }


    // function with list parameter
    fun greets(greeting:String, itemsToGreet:List<String>){
        itemsToGreet.forEach { itemToGreet ->
            println("$greeting $itemToGreet")
        }
    }
    greets("Howdy", interestingAnimals)

}
