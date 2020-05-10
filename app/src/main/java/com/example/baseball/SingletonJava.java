package com.example.baseball;

public class SingletonJava {
    private SingletonJava() {}

    private static SingletonJava instance = new SingletonJava();
    public static SingletonJava getInstance( ) {
        return instance;
    }

    public void log(String text) {
        System.out.println(text);
    }
}

