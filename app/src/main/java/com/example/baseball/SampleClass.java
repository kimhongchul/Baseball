package com.example.baseball;

public class SampleClass {
    int outField1 = 0;

    class InnerClass {
        int myField1 = outField1;
    }

    public static class NestedClass {
        //int myField2 = outerField1;
    }
}
