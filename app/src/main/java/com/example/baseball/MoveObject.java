package com.example.baseball;

public class MoveObject {

    protected int speed;
    public void addSpeed(int param) {
        this.speed += param;
    }

    public int getSpeed() {
        return speed;
    }
    public int x,y;
}
