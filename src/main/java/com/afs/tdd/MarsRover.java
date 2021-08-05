package com.afs.tdd;

public class MarsRover {
    private RoverStatus roverStatus;
    public MarsRover(RoverStatus roverStatus) {
        this.roverStatus=roverStatus;
    }

    public void executeCommand(String command) {
        if (command.equals("M"))
        {
            move();
        }
        if(command.equals("L"))
        {
            turnLeft();
        }
        if(command.equals("R"))
        {
            turnRight();
        }
    }

    private void turnRight() {
        roverStatus.setDirection("E");
    }

    private void turnLeft() {
        roverStatus.setDirection("W");
    }

    private void move() {
        roverStatus.setLocationY(roverStatus.getLocationY()+1);
    }

    public RoverStatus getRoverStatus() {
        return roverStatus;
    }
}
