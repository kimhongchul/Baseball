package com.example.baseball

class Animal(val map:MutableMap<String, Any?>) {
    var name:String by map
    var age:Int by map
}