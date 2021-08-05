package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DemoTest {
    @Test
    public void should_return_01N_when_execute_command_given_00N_M() {
        //given
        MarsRover marsRover = new MarsRover(new RoverStatus(0, 0, "N"));
        RoverStatus expectedRoverStatus = new RoverStatus(0, 1, "N");
        //when
        marsRover.executeCommand("M");
        //then
        assertEquals(expectedRoverStatus.getLocationX(), marsRover.getRoverStatus().getLocationX());
        assertEquals(expectedRoverStatus.getLocationY(), marsRover.getRoverStatus().getLocationY());
        assertEquals(expectedRoverStatus.getDirection(), marsRover.getRoverStatus().getDirection());
    }

    @Test
    public void should_return_00W_when_execute_command_given_00N_L() {
        //given
        MarsRover marsRover = new MarsRover(new RoverStatus(0, 0, "N"));
        RoverStatus expectedRoverStatus = new RoverStatus(0, 0, "W");
        //when
        marsRover.executeCommand("L");
        //then
        assertEquals(expectedRoverStatus.getLocationX(), marsRover.getRoverStatus().getLocationX());
        assertEquals(expectedRoverStatus.getLocationY(), marsRover.getRoverStatus().getLocationY());
        assertEquals(expectedRoverStatus.getDirection(), marsRover.getRoverStatus().getDirection());
    }

    @Test
    public void should_return_00E_when_execute_command_given_00N_R() {
        //given
        MarsRover marsRover = new MarsRover(new RoverStatus(0, 0, "N"));
        RoverStatus expectedRoverStatus = new RoverStatus(0, 0, "E");
        //when
        marsRover.executeCommand("R");
        //then
        assertEquals(expectedRoverStatus.getLocationX(), marsRover.getRoverStatus().getLocationX());
        assertEquals(expectedRoverStatus.getLocationY(), marsRover.getRoverStatus().getLocationY());
        assertEquals(expectedRoverStatus.getDirection(), marsRover.getRoverStatus().getDirection());
    }

    @Test
    public void should_return_neg10W_when_execute_command_given_00W_M() {
        //given
        MarsRover marsRover = new MarsRover(new RoverStatus(0, 0, "W"));
        RoverStatus expectedRoverStatus = new RoverStatus(-1, 0, "W");
        //when
        marsRover.executeCommand("M");
        //then
        assertEquals(expectedRoverStatus.getLocationX(), marsRover.getRoverStatus().getLocationX());
        assertEquals(expectedRoverStatus.getLocationY(), marsRover.getRoverStatus().getLocationY());
        assertEquals(expectedRoverStatus.getDirection(), marsRover.getRoverStatus().getDirection());
    }

    @Test
    public void should_return_00S_when_execute_command_given_00W_L() {
        //given
        MarsRover marsRover = new MarsRover(new RoverStatus(0, 0, "W"));
        RoverStatus expectedRoverStatus = new RoverStatus(0, 0, "S");
        //when
        marsRover.executeCommand("L");
        //then
        assertEquals(expectedRoverStatus.getLocationX(), marsRover.getRoverStatus().getLocationX());
        assertEquals(expectedRoverStatus.getLocationY(), marsRover.getRoverStatus().getLocationY());
        assertEquals(expectedRoverStatus.getDirection(), marsRover.getRoverStatus().getDirection());
    }

    @Test
    public void should_return_00N_when_execute_command_given_00W_R() {
        //given
        MarsRover marsRover = new MarsRover(new RoverStatus(0, 0, "W"));
        RoverStatus expectedRoverStatus = new RoverStatus(0, 0, "N");
        //when
        marsRover.executeCommand("R");
        //then
        assertEquals(expectedRoverStatus.getLocationX(), marsRover.getRoverStatus().getLocationX());
        assertEquals(expectedRoverStatus.getLocationY(), marsRover.getRoverStatus().getLocationY());
        assertEquals(expectedRoverStatus.getDirection(), marsRover.getRoverStatus().getDirection());
    }

    @Test
    public void should_return_10E_when_execute_command_given_00E_M() {
        //given
        MarsRover marsRover = new MarsRover(new RoverStatus(0, 0, "E"));
        RoverStatus expectedRoverStatus = new RoverStatus(1, 0, "E");
        //when
        marsRover.executeCommand("M");
        //then
        assertEquals(expectedRoverStatus.getLocationX(), marsRover.getRoverStatus().getLocationX());
        assertEquals(expectedRoverStatus.getLocationY(), marsRover.getRoverStatus().getLocationY());
        assertEquals(expectedRoverStatus.getDirection(), marsRover.getRoverStatus().getDirection());
    }

    @Test
    public void should_return_00N_when_execute_command_given_00E_L() {
        //given
        MarsRover marsRover = new MarsRover(new RoverStatus(0, 0, "E"));
        RoverStatus expectedRoverStatus = new RoverStatus(0, 0, "N");
        //when
        marsRover.executeCommand("L");
        //then
        assertEquals(expectedRoverStatus.getLocationX(), marsRover.getRoverStatus().getLocationX());
        assertEquals(expectedRoverStatus.getLocationY(), marsRover.getRoverStatus().getLocationY());
        assertEquals(expectedRoverStatus.getDirection(), marsRover.getRoverStatus().getDirection());
    }

    @Test
    public void should_return_00S_when_execute_command_given_00E_R() {
        //given
        MarsRover marsRover = new MarsRover(new RoverStatus(0, 0, "E"));
        RoverStatus expectedRoverStatus = new RoverStatus(0, 0, "S");
        //when
        marsRover.executeCommand("R");
        //then
        assertEquals(expectedRoverStatus.getLocationX(), marsRover.getRoverStatus().getLocationX());
        assertEquals(expectedRoverStatus.getLocationY(), marsRover.getRoverStatus().getLocationY());
        assertEquals(expectedRoverStatus.getDirection(), marsRover.getRoverStatus().getDirection());
    }
}
