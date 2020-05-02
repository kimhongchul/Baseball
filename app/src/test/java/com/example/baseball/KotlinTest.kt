package com.example.baseball

import org.junit.Assert.*
import org.junit.Test

class KotlinTest {

    @Test
    fun test() {
        val person = Person("Paul")
        person.nickname = "HONG"
        assertEquals("Hong", person.nickname)
    }
}