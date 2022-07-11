package com.example.kotlin2

import java.util.*

enum class Entity2Type {
    HELP,
    EASY,
    MEDIUM,
    HARD;

    fun getFormattedName() = name.lowercase().replaceFirstChar { char ->  char.uppercase()}
}


object EntityFactory2 {
    fun create(type: Entity2Type) : Entity2 {
        val id = UUID.randomUUID().toString()

        val name = when(type){
            Entity2Type.HELP -> type.getFormattedName()
            Entity2Type.EASY -> type.getFormattedName()
            Entity2Type.MEDIUM -> type.getFormattedName()
            Entity2Type.HARD -> type.getFormattedName()
        }
        return when(type){
            Entity2Type.HELP -> Entity2.Help
            Entity2Type.EASY -> Entity2.Easy(id, name)
            Entity2Type.MEDIUM -> Entity2.Medium(id, name)
            Entity2Type.HARD -> Entity2.Hard(id, name, 2f)
        }
    }
}


sealed class Entity2(){

    object Help : Entity2() {
        val name = "Help"
    }

//    data class Easy(val id: String, val name: String) : Entity2() {
//        override fun equals(other: Any?): Boolean {
//            return super.equals(other)
//        }
//
//        override fun hashCode(): Int {
//            return super.hashCode()
//        }
//    }
    data class Easy(val id: String, val name: String) : Entity2()
    data class Medium(val id: String, val name: String) : Entity2()
    data class Hard(val id: String, val name: String, val multiplier: Float) : Entity2()

}

fun Entity2.Medium.printInfo(){
    println("Medium class: $id")
}

val Entity2.Medium.info : String
    get() = "some info"

fun main(){

    val entity = EntityFactory2.create(Entity2Type.EASY)
    val msg = when (entity) {
        Entity2.Help -> "help class"
        is Entity2.Easy -> "easy class"
        is Entity2.Medium -> "medium class"
        is Entity2.Hard -> "hard class"
    }
    println(msg)

    val entity1 = EntityFactory2.create(Entity2Type.EASY)
    val entity2 = EntityFactory2.create(Entity2Type.EASY)

    // equality comparators

    // not equal because of the random UUIDs
    if (entity1 == entity2){
        println("entity1 and entity2 are equal")
    } else {
        println("entity1 and entity2 are not equal")
    }

    val entity3 = Entity2.Easy("id","name")
    val entity4 = Entity2.Easy("id","name")

    if (entity3 == entity4){
        println("entity3 and entity4 are equal")
    } else {
        println("entity3 and entity4 are not equal")
    }

    // referential using triple equals
    if (entity3 === entity4){
        println("entity3 and entity4 are referentially equal")
    } else {
        println("entity3 and entity4 are not referentially equal")
    }


    val entity5 = Entity2.Easy("id", "name")
    val entity6 = entity5.copy(name = "new name")

    if (entity5 == entity6){
        println("entity5 and entity6 are equal")
    } else {
        println("entity5 and entity6 are not equal")
    }

    //////////////////////////////////////////////////

    Entity2.Medium("id","name").printInfo()

    val entity10 = EntityFactory2.create(Entity2Type.MEDIUM)
    if (entity10 is Entity2.Medium){
        entity10.printInfo()
        entity10.info
    }
}