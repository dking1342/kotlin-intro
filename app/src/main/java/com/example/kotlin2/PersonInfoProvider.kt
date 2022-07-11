package com.example.kotlin2

interface PersonInfoProvider {
    val providerInfo: String

    fun printInfo(person:Person4){
        println(providerInfo)
        person.printInfo()
    }
}

interface SessionInfoProvider {
    fun getSessionId():String
}

// open keyword allows you to extend or inhereit in another class
open class BasicInfoProvider : PersonInfoProvider, SessionInfoProvider {
    override val providerInfo: String
        get() = "BasicInfoProviders"

    // open keyword allows it to be overridden by other class
    // protected keyword protects variable from overriding outside the child class
    protected open val sessionIdPrefix = "Session"

    override fun printInfo(person: Person4) {
        super.printInfo(person)
        println("additional print statement")
    }

    override fun getSessionId(): String {
        println(sessionIdPrefix)
        return sessionIdPrefix
    }
}

fun main(){
    val provider = BasicInfoProvider()
//    provider.printInfo(Person4())
//    provider.getSessionId()
//    checkTypes(provider)

    val provider2 = FancyInfoProvider()
//    provider2.printInfo(Person4())
//    provider2.getSessionId()
//    checkTypes(provider2)

    val provider3 = object : PersonInfoProvider{
        override val providerInfo: String
            get() = "New Info Provider"

        fun getSessionId() = "id"
    }
    provider3.printInfo(Person4())
    provider3.getSessionId()
    checkTypes(provider3)

}

fun checkTypes(infoProvider: PersonInfoProvider){
    if(infoProvider is SessionInfoProvider) {
        println("is a session info provider")
    } else {
        println("not a session info provider")
    }
    if(infoProvider !is SessionInfoProvider) {
        println("not a session info provider")
    } else {
        println("is a session info provider")
        (infoProvider as SessionInfoProvider).getSessionId()
        infoProvider.getSessionId() // smart cast for type
    }
}

