package com.example.baseball

class DelegatingArrayList<T>(private val innerList : MutableCollection<T> = mutableListOf()) : MutableCollection<T> by innerList {

    override fun add(element: T):Boolean {
        printItem(element)
        return innerList.add(element)
    }

    private fun printItem(item:T) {
        println(item).toString()
    }
}