package com.example.kotlin2

fun printFilteredString(list:List<String>, predicate: (String) -> Boolean) {
    list.forEach{
        if(predicate(it)){
            println(it)
        }
    }
}

fun printFilteredNullableString(list:List<String>, predicate: ((String) -> Boolean)?) {
    list.forEach{
        if(predicate?.invoke(it) == true){
            println(it)
        }
    }
}

val predicate: (String) -> Boolean = {
    it.startsWith("P")
}

fun getPrintPredicate(letter: String = "J"): (String) -> Boolean {
    return { it.startsWith(letter)}
}

fun main(){
    val list = listOf("Kotlin", "Java", "Javascript", "Python")
    val itemsWithK = printFilteredString(list, { it.startsWith("K")})
    val itemsWithJ = printFilteredString(list){
        it.startsWith("J")
    }
    val itemsWithP = printFilteredString(list, predicate)
    val itemsWithNull = printFilteredNullableString(list, null)
    println(itemsWithK)
    println(itemsWithJ)
    println(itemsWithP)
    println(itemsWithNull)

    printFilteredString(list,getPrintPredicate("P"))
    printFilteredString(list,getPrintPredicate())

}