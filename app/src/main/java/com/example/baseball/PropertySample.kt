package com.example.baseball

class PropertySample {
    var name:String
    set(value:String) {
        print("set")
    }
    get() {
        return "Alice"
    }
}