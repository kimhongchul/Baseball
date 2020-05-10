package com.example.baseball;

public class CantMoveObject extends MoveObject {

    public CantMoveObject() {
        this.speed = 0;
    }

    @Override
    public void addSpeed(int param) {}
}
