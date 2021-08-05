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
                roverStatus.setDirection("E");
                break;
            case "W":
                roverStatus.setDirection("N");
                break;
            case "E":
                roverStatus.setDirection("S");
                break;
            case "S":
                roverStatus.setDirection("W");
                break;
        }
    }

    private void turnLeft() {
        switch (roverStatus.getDirection()) {
            case "N":
                roverStatus.setDirection("W");
                break;
            case "W":
                roverStatus.setDirection("S");
                break;
            case "E":
                roverStatus.setDirection("N");
                break;
            case "S":
                roverStatus.setDirection("E");
                break;
        }
    }

    private void move() {
        switch (roverStatus.getDirection()) {
            case "N":
                roverStatus.setLocationY(roverStatus.getLocationY() + 1);
                break;
            case "W":
                roverStatus.setLocationX(roverStatus.getLocationX() - 1);
                break;
            case "E":
                roverStatus.setLocationX(roverStatus.getLocationX() + 1);
                break;
            case "S":
                roverStatus.setLocationY(roverStatus.getLocationY() - 1);
                break;
        }
    }

    public RoverStatus getRoverStatus() {
        return roverStatus;
    }
}
