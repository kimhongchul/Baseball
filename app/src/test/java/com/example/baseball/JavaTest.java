package com.example.baseball;

import junit.framework.Assert;

import org.junit.Test;

public class JavaTest {
    @Test
    public void test() {
        Person person = new Person("Paul");

    }

    @Test
    public void test1() {
        FruitJava fruitJava = new FruitJava();
        fruitJava.fruitName = "사과";
        fruitJava.description = "빨간맛";

        System.out.println(fruitJava);


    }

    @Test
    public void test2() {
        String lastString = StringExtKt.lastString("apple");
        Assert.assertEquals("e", lastString);
    }

    @Test
    public void test3() {
        NPE npe = new NPE();

        Assert.assertEquals(3, npe.strLen("abc"));
        Assert.assertEquals(false, null instanceof String);
        //Assert.assertEquals(0, npe.strLen(null));
        Assert.assertEquals(0, npe.strLen(""));

    }

    @Test
    public void testGetterSetter() {
        PersonJava personJava = new PersonJava("john");
        personJava.setAge(20);

        Assert.assertEquals(20, personJava.getAge());
        Assert.assertEquals("john", personJava.getName());

        Person person = new Person("john");
        person.setAge(20);

        Assert.assertEquals(20, person.getAge());
        Assert.assertEquals("john", person.getName());
    }

    @Test
    public void testMoveObject() {
        MoveObject moveObject = new MoveObject();
        int accuracy = Calculator.calcAccuracy(moveObject, 3);
        
        Assert.assertEquals(1, moveObject.getSpeed());

        MoveObject cantMoveObject = new CantMoveObject();
        accuracy = Calculator.calcAccuracy(cantMoveObject, 3);
        Assert.assertEquals(1, cantMoveObject.getSpeed());
    }
}