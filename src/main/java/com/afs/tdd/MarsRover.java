package com.afs.tdd;

public class MarsRover {
    private RoverStatus roverStatus;

    public MarsRover(RoverStatus roverStatus) {
        this.roverStatus = roverStatus;
    }

    public void executeCommands(String commands) {
        for (Character command : commands.toCharArray()) {
            executeCommand(command);
        }
    }

    public void executeCommand(Character command) {
        if (command.equals('M')) {
            move();
        }
        if (command.equals('L')) {
            turnLeft();
        }
        if (command.equals('R')) {
            turnRight();
        }
    }

    private void turnRight() {
        switch (roverStatus.getDirection()) {
            case "N":
                setDirection("E");
                break;
            case "W":
                setDirection("N");
                break;
            case "E":
                setDirection("S");
                break;
            case "S":
                setDirection("W");
                break;
        }
    }

    private void turnLeft() {
        switch (roverStatus.getDirection()) {
            case "N":
                setDirection("W");
                break;
            case "W":
                setDirection("S");
                break;
            case "E":
                setDirection("N");
                break;
            case "S":
                setDirection("E");
                break;
        }
    }

    private void move() {
        switch (roverStatus.getDirection()) {
            case "N":
                roverStatus.setLocationY(Math.incrementExact(roverStatus.getLocationY()));
                break;
            case "W":
                roverStatus.setLocationX(Math.decrementExact(roverStatus.getLocationX()));
                break;
            case "E":
                roverStatus.setLocationX(Math.incrementExact(roverStatus.getLocationX()));
                break;
            case "S":
                roverStatus.setLocationY(Math.decrementExact(roverStatus.getLocationY()));
                break;
        }
    }

    private void setDirection(String direction) {
        roverStatus.setDirection(direction);
    }

    public RoverStatus getRoverStatus() {
        return roverStatus;
    }
}
