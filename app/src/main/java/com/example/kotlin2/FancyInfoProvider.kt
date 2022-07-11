package com.example.kotlin2

class FancyInfoProvider : BasicInfoProvider() {
    override val sessionIdPrefix: String
        get() = "Fancy Session"

    override val providerInfo: String
        get() = "Fancy Info Provider"

    override fun printInfo(person: Person4) {
        super.printInfo(person)
        println("Fancy info")
    }
}