package com.afs.tdd;

public class RoverStatus {
    private int locationX;
    private int locationY;
    private Character direction;

    public RoverStatus(int locationX, int locationY, Character direction) {
        this.locationX=locationX;
        this.locationY=locationY;
        this.direction=direction;
    }

    public int getLocationX() {
        return locationX;
    }

    public int getLocationY() {
        return locationY;
    }

    public Character getDirection() {
        return direction;
    }

    public void setLocationY(int value) {
        this.locationY = value;
    }

    public void setLocationX(int locationX) {
        this.locationX = locationX;
    }

    public void setDirection(Character direction) {
        this.direction = direction;
    }
}
