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

    @Test
    fun test1() {
        val arr:DelegatingArrayList<String> = DelegatingArrayList()
        arr.add("Test")

        assertEquals(1, arr.size)
    }

    @Test
    fun test3() {
        val user = User()
        user.nickname = "paul"
        assertEquals("PAUL", user.nickname)
    }

    @Test
    fun test4() {
        val user = User()

        println("not init")

        assertNotNull(user.httpText)
    }

    @Test
    fun test5() {
        val user = User()

        user.name = "hong"
        user.name = "paul"
    }

    @Test
    fun test6() {
        val animal = Animal(mutableMapOf(
            "name" to "cat",
            "age" to 10
            )
        )

        assertEquals("cat", animal.name)
        assertEquals(10, animal.age)

        animal.name = "dog"
        animal.age = 5

        assertEquals("dog", animal.map["name"])
        assertEquals(5, animal.map["age"])
    }

    @Test
    fun test7() {
        val fruit1 = Fruit("바나나","길어")
        val fruit2 = Fruit("바나나","길어")

        println(fruit1)
        println(fruit2)

        assertEquals(fruit1, fruit2)
        assertEquals(fruit1.hashCode(), fruit2.hashCode())

    }

    @Test
    fun test8() {
        println(sum(1,2))

        assertEquals(3, {x:Int, y:Int -> x + y}(2,1))

        val exp = {x:Int, y:Int ->
            {z:Int -> (x + y) * z}
        }

        val exp2 = exp(3,2)
        val result = exp2(4)

        println(exp2)

        assertEquals(20, result)

    }

    @Test
    fun test9() {
        val list = listOf(1, 2, 3, 4, 5, "나다", true, 1.0)

        println(list.filter { i -> i is Int })

        println(list.filter{ it is Int }.map{ "$it"})

        println(list.map { "value = $it " })

        println(list.find { it is Int })

        val map = list.groupBy { it.javaClass }
        println(map)

        val list2 = listOf(listOf(1,2), listOf(3,4))
        println(list2)

        println(list2.map { "value:${it}" })

        println(list2.flatMap { it.toList() })
    }

    @Test
    fun test10() {
        val str = "ABCDEFG"
        assertEquals("G", str.lastString())
    }

}