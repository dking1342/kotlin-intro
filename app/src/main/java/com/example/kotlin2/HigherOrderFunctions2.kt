package com.example.kotlin2

fun main(){
    val list = listOf("Kotlin", "Java", "Javascript", "Python", "Ruby", "Rust", null, null)

    // chaining
    list
        .filterNotNull()
        .filter{
            it.startsWith("J")
        }
        .map{
            it.length
        }
        .forEach {
            println("filtered list length: $it")
        }

    list
        .filterNotNull()
        .take(3)
        .forEach {
            println("first three: $it")
        }

    list
        .filterNotNull()
        .takeLast(3)
        .forEach {
            println("last three: $it")
        }

    list
        .filterNotNull()
        .associateWith { it.length }
        .forEach {
            println("length: ${it.value}, value: ${it.key}")
        }

    val mapList = list
        .filterNotNull()
        .associateWith{ it to it.length }

    println(mapList)
    println(mapList.keys)
    println(mapList.entries)

    val firstLanguage = list.first()
    val lastLanguage = list.last()
    val lastLanguageNotNull = list.filterNotNull().last()

    println(firstLanguage)
    println(lastLanguage)
    println(lastLanguageNotNull)

    val findLanguage = list
        .filterNotNull()
        .find{ it.startsWith("Javap")}
        .orEmpty()

    println(findLanguage)
}