package com.example.kotlin2

//    first way of init
class Person1(_firstName:String, _lastName:String) {
    val firstName: String = _firstName
    val lastName: String = _lastName

}

//    second way of init
class Person2(_firstName: String, _lastName: String){
    val firstName: String
    val lastName: String
    init {
        firstName = _firstName
        lastName = _lastName
    }
}

//  third way of init
class Person3(val firstName:String, val lastName:String) {

    init {
        println("init 1")
    }

    constructor():this("Peter","Parker"){
        // secondary constructors
        println("secondary constructor")
    }

    init {
        println("init 2")
    }
}

// fourth way of init
class Person4(val firstName: String = "Peter", val lastName: String = "Parker"){
    var nickName:String? = null
        set(value) {
            field = value
            println("the new nick name is $value")
        }
        get(){
            println("the returned value is $field")
            return field
        }

    fun printInfo(){
        // checks for null
        val nickNameToPrint = if(nickName != null) nickName else "no nickname"

        // check for null shorthand
        val nickNameShorthand = nickName ?: "no nickname"

        println("$firstName ($nickNameToPrint) $lastName is my name")
        println("$firstName ($nickNameShorthand) $lastName is my alternative name")
    }

}

// visibility modifiers
// public - means that your declarations will be visible everywhere
// private - will only be visible inside the file that contains the declaration
// protected - is not available for top-level declarations
// internal - will be visible everywhere in the same module


fun main(){
    val person = Person1("jack","jones")
    println("${person.firstName} ${person.lastName} is my name")

    val person3 = Person3()
    person3.firstName
    person3.lastName

    val person4 = Person4()
    person4.printInfo()
    person4.nickName = "Shades"
    person4.nickName = "My Man"
    person4.printInfo()
}

