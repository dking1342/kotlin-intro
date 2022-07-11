package com.example.kotlin2
import java.util.*

interface IdProvider {
    fun getId(): String
}

enum class EntityType {
    EASY,
    MEDIUM,
    HARD;

    fun getFormattedName() = name.lowercase().replaceFirstChar { char ->  char.uppercase()}
}

object EntityFactory {
//    fun create() = Entity("123","name")
    fun create(type: EntityType) : Entity {
        val id = UUID.randomUUID().toString()

//        val name = when(type){
//            EntityType.EASY -> "Easy"
//            EntityType.MEDIUM -> "Medium"
//            EntityType.HARD -> "Hard"
//        }
        val name = when(type){
            EntityType.EASY -> type.getFormattedName()
            EntityType.MEDIUM -> type.getFormattedName()
            EntityType.HARD -> type.getFormattedName()
        }
        return Entity(id, name)
    }
}

class Entity constructor(val id: String, val name:String){ // use private keyword when needed

//    companion object Factory : IdProvider{
//        override fun getId(): String {
//            return "123"
//        }
//        const val id = "id"
//        fun create() = Entity(getId())
//    }

//    companion object Factory {
//        fun create() = Entity("id")
//    }

    override fun toString(): String {
        return "{id: $id, name: $name}"
    }
}

fun main(){
//     val entity = Entity.Companion.create()
//    val entity = Entity.Factory.create()
//    Entity.id

//    val entity = EntityFactory.create()
//    println(entity)

    val mediumEntity = EntityFactory.create(EntityType.MEDIUM)
    println(mediumEntity)
}