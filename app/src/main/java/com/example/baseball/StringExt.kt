package com.example.baseball

fun String.lastString():String {
    return this.get(this.length - 1).toString()
}

class ExtText {
    fun String.extFunc() {
        println(this.lastString())
    }

    fun method1() {
        "TEST".extFunc()
    }
}

fun test() {
    "TEST".lastString()
    //"TEST".extFunc()
}