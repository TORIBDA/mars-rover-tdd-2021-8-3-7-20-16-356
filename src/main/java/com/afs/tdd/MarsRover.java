package com.afs.tdd;

import java.text.MessageFormat;

public class MarsRover {
    private RoverStatus roverStatus;
    private final char NORTH = 'N';
    private final char WEST = 'W';
    private final char EAST = 'E';
    private final char SOUTH = 'S';

    public MarsRover(RoverStatus roverStatus) {
        this.roverStatus = roverStatus;
    }

    public String executeInstructionWithReport(String fullInstructions) {
        final String[] instructions = fullInstructions.split(" ");
        roverStatus = new RoverStatus(Integer.parseInt(instructions[0]),
                Integer.parseInt(instructions[1]),
                instructions[2].charAt(0));
        executeCommands(instructions[instructions.length - 1]);
        return MessageFormat.format("X: {0} Y: {1} D: {2}",
                this.roverStatus.getLocationX(),
                this.roverStatus.getLocationY(),
                this.roverStatus.getDirection());
    }

    public void executeCommands(String commands) {
        commands.chars().mapToObj(command -> (char)command).forEach(command ->executeCommand(command));
    }

    public void executeCommand(Character command) {
        final char commandMove = 'M';
        final char commandLeft = 'L';
        final char commandRight = 'R';
        if (command.equals(commandMove)) {
            move();
        }
        if (command.equals(commandLeft)) {
            turnLeft();
        }
        if (command.equals(commandRight)) {
            turnRight();
        }
    }

    private void turnRight() {
        switch (roverStatus.getDirection()) {
            case NORTH:
                setDirection(EAST);
                break;
            case WEST:
                setDirection(NORTH);
                break;
            case EAST:
                setDirection(SOUTH);
                break;
            case SOUTH:
                setDirection(WEST);
                break;
        }
    }

    private void turnLeft() {
        switch (roverStatus.getDirection()) {
            case NORTH:
                setDirection(WEST);
                break;
            case WEST:
                setDirection(SOUTH);
                break;
            case EAST:
                setDirection(NORTH);
                break;
            case SOUTH:
                setDirection(EAST);
                break;
        }
    }

    private void move() {
        switch (roverStatus.getDirection()) {
            case NORTH:
                roverStatus.setLocationY(Math.incrementExact(roverStatus.getLocationY()));
                break;
            case WEST:
                roverStatus.setLocationX(Math.decrementExact(roverStatus.getLocationX()));
                break;
            case EAST:
                roverStatus.setLocationX(Math.incrementExact(roverStatus.getLocationX()));
                break;
            case SOUTH:
                roverStatus.setLocationY(Math.decrementExact(roverStatus.getLocationY()));
                break;
        }
    }

    private void setDirection(Character direction) {
        roverStatus.setDirection(direction);
    }

    public RoverStatus getRoverStatus() {
        return roverStatus;
    }
}
