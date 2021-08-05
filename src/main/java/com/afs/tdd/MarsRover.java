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
        if (roverStatus.getDirection().equals("N")) {
            roverStatus.setDirection("E");
        } else if (roverStatus.getDirection().equals("W")) {
            roverStatus.setDirection("N");
        } else if (roverStatus.getDirection().equals("E")) {
            roverStatus.setDirection("S");
        } else if (roverStatus.getDirection().equals("S")) {
            roverStatus.setDirection("W");
        }
    }

    private void turnLeft() {
        if (roverStatus.getDirection().equals("N")) {
            roverStatus.setDirection("W");
        } else if (roverStatus.getDirection().equals("W")) {
            roverStatus.setDirection("S");
        } else if (roverStatus.getDirection().equals("E")) {
            roverStatus.setDirection("N");
        } else if (roverStatus.getDirection().equals("S")) {
            roverStatus.setDirection("E");
        }
    }

    private void move() {
        if (roverStatus.getDirection().equals("N")) {
            roverStatus.setLocationY(roverStatus.getLocationY() + 1);
        } else if (roverStatus.getDirection().equals("W")) {
            roverStatus.setLocationX(roverStatus.getLocationX() - 1);
        } else if (roverStatus.getDirection().equals("E")) {
            roverStatus.setLocationX(roverStatus.getLocationX() + 1);
        } else if (roverStatus.getDirection().equals("S")) {
            roverStatus.setLocationY(roverStatus.getLocationY() - 1);
        }
    }

    public RoverStatus getRoverStatus() {
        return roverStatus;
    }
}
