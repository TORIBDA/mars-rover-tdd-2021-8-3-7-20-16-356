package com.afs.tdd;

public class MarsRover {
    private RoverStatus roverStatus;
    public MarsRover(RoverStatus n) {
        roverStatus=n;
    }

    public void executeCommand(String m) {
    }

    public RoverStatus getRoverStatus() {
        return roverStatus;
    }
}
