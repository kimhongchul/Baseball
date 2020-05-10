package com.example.baseball;

public class Calculator {
    public static int calcAccuracy(MoveObject moveObject, int attackerAccuracy) {
        if(moveObject.getSpeed() == 0) {
            moveObject.addSpeed(1);
        }

        double resultAccuracy = attackerAccuracy / moveObject.getSpeed();
        return (int) resultAccuracy;
    }
}
