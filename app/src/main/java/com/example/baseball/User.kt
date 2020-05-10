package com.example.baseball

import java.io.InputStreamReader
import java.net.URL
import kotlin.properties.Delegates

class User {
    var nickname by DelegateString()

    val httpText by lazy {
        println("lazy init start")

        InputStreamReader(URL("https://www.google.com").openConnection().getInputStream()).readText()
    }

    var name:String by Delegates.observable("") {
        property, oldValue, newValue ->
        println("property:${property}, 기존값: ${oldValue}, 새로적용될값:${newValue}")
    }
}