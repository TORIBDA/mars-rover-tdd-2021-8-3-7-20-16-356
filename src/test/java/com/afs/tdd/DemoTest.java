package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DemoTest {
    @Test
    public void should_return_01N_when_execute_command_given_00N_M() {
        //given
        MarsRover marsRover = new MarsRover(new RoverStatus(0, 0, 'N'));
        RoverStatus expectedRoverStatus = new RoverStatus(0, 1, 'N');
        //when
        marsRover.executeCommands("M");
        //then
        assertEquals(expectedRoverStatus.getLocationX(), marsRover.getRoverStatus().getLocationX());
        assertEquals(expectedRoverStatus.getLocationY(), marsRover.getRoverStatus().getLocationY());
        assertEquals(expectedRoverStatus.getDirection(), marsRover.getRoverStatus().getDirection());
    }

    @Test
    public void should_return_00W_when_execute_command_given_00N_L() {
        //given
        MarsRover marsRover = new MarsRover(new RoverStatus(0, 0, 'N'));
        RoverStatus expectedRoverStatus = new RoverStatus(0, 0, 'W');
        //when
        marsRover.executeCommands("L");
        //then
        assertEquals(expectedRoverStatus.getLocationX(), marsRover.getRoverStatus().getLocationX());
        assertEquals(expectedRoverStatus.getLocationY(), marsRover.getRoverStatus().getLocationY());
        assertEquals(expectedRoverStatus.getDirection(), marsRover.getRoverStatus().getDirection());
    }

    @Test
    public void should_return_00E_when_execute_command_given_00N_R() {
        //given
        MarsRover marsRover = new MarsRover(new RoverStatus(0, 0, 'N'));
        RoverStatus expectedRoverStatus = new RoverStatus(0, 0, 'E');
        //when
        marsRover.executeCommands("R");
        //then
        assertEquals(expectedRoverStatus.getLocationX(), marsRover.getRoverStatus().getLocationX());
        assertEquals(expectedRoverStatus.getLocationY(), marsRover.getRoverStatus().getLocationY());
        assertEquals(expectedRoverStatus.getDirection(), marsRover.getRoverStatus().getDirection());
    }

    @Test
    public void should_return_neg10W_when_execute_command_given_00W_M() {
        //given
        MarsRover marsRover = new MarsRover(new RoverStatus(0, 0, 'W'));
        RoverStatus expectedRoverStatus = new RoverStatus(-1, 0, 'W');
        //when
        marsRover.executeCommands("M");
        //then
        assertEquals(expectedRoverStatus.getLocationX(), marsRover.getRoverStatus().getLocationX());
        assertEquals(expectedRoverStatus.getLocationY(), marsRover.getRoverStatus().getLocationY());
        assertEquals(expectedRoverStatus.getDirection(), marsRover.getRoverStatus().getDirection());
    }

    @Test
    public void should_return_00S_when_execute_command_given_00W_L() {
        //given
        MarsRover marsRover = new MarsRover(new RoverStatus(0, 0, 'W'));
        RoverStatus expectedRoverStatus = new RoverStatus(0, 0, 'S');
        //when
        marsRover.executeCommands("L");
        //then
        assertEquals(expectedRoverStatus.getLocationX(), marsRover.getRoverStatus().getLocationX());
        assertEquals(expectedRoverStatus.getLocationY(), marsRover.getRoverStatus().getLocationY());
        assertEquals(expectedRoverStatus.getDirection(), marsRover.getRoverStatus().getDirection());
    }

    @Test
    public void should_return_00N_when_execute_command_given_00W_R() {
        //given
        MarsRover marsRover = new MarsRover(new RoverStatus(0, 0, 'W'));
        RoverStatus expectedRoverStatus = new RoverStatus(0, 0, 'N');
        //when
        marsRover.executeCommands("R");
        //then
        assertEquals(expectedRoverStatus.getLocationX(), marsRover.getRoverStatus().getLocationX());
        assertEquals(expectedRoverStatus.getLocationY(), marsRover.getRoverStatus().getLocationY());
        assertEquals(expectedRoverStatus.getDirection(), marsRover.getRoverStatus().getDirection());
    }

    @Test
    public void should_return_10E_when_execute_command_given_00E_M() {
        //given
        MarsRover marsRover = new MarsRover(new RoverStatus(0, 0, 'E'));
        RoverStatus expectedRoverStatus = new RoverStatus(1, 0, 'E');
        //when
        marsRover.executeCommands("M");
        //then
        assertEquals(expectedRoverStatus.getLocationX(), marsRover.getRoverStatus().getLocationX());
        assertEquals(expectedRoverStatus.getLocationY(), marsRover.getRoverStatus().getLocationY());
        assertEquals(expectedRoverStatus.getDirection(), marsRover.getRoverStatus().getDirection());
    }

    @Test
    public void should_return_00N_when_execute_command_given_00E_L() {
        //given
        MarsRover marsRover = new MarsRover(new RoverStatus(0, 0, 'E'));
        RoverStatus expectedRoverStatus = new RoverStatus(0, 0, 'N');
        //when
        marsRover.executeCommands("L");
        //then
        assertEquals(expectedRoverStatus.getLocationX(), marsRover.getRoverStatus().getLocationX());
        assertEquals(expectedRoverStatus.getLocationY(), marsRover.getRoverStatus().getLocationY());
        assertEquals(expectedRoverStatus.getDirection(), marsRover.getRoverStatus().getDirection());
    }

    @Test
    public void should_return_00S_when_execute_command_given_00E_R() {
        //given
        MarsRover marsRover = new MarsRover(new RoverStatus(0, 0, 'E'));
        RoverStatus expectedRoverStatus = new RoverStatus(0, 0, 'S');
        //when
        marsRover.executeCommands("R");
        //then
        assertEquals(expectedRoverStatus.getLocationX(), marsRover.getRoverStatus().getLocationX());
        assertEquals(expectedRoverStatus.getLocationY(), marsRover.getRoverStatus().getLocationY());
        assertEquals(expectedRoverStatus.getDirection(), marsRover.getRoverStatus().getDirection());
    }

    @Test
    public void should_return_0neg1S_when_execute_command_given_00S_M() {
        //given
        MarsRover marsRover = new MarsRover(new RoverStatus(0, 0, 'S'));
        RoverStatus expectedRoverStatus = new RoverStatus(0, -1, 'S');
        //when
        marsRover.executeCommands("M");
        //then
        assertEquals(expectedRoverStatus.getLocationX(), marsRover.getRoverStatus().getLocationX());
        assertEquals(expectedRoverStatus.getLocationY(), marsRover.getRoverStatus().getLocationY());
        assertEquals(expectedRoverStatus.getDirection(), marsRover.getRoverStatus().getDirection());
    }

    @Test
    public void should_return_00E_when_execute_command_given_00S_L() {
        //given
        MarsRover marsRover = new MarsRover(new RoverStatus(0, 0, 'S'));
        RoverStatus expectedRoverStatus = new RoverStatus(0, 0, 'E');
        //when
        marsRover.executeCommands("L");
        //then
        assertEquals(expectedRoverStatus.getLocationX(), marsRover.getRoverStatus().getLocationX());
        assertEquals(expectedRoverStatus.getLocationY(), marsRover.getRoverStatus().getLocationY());
        assertEquals(expectedRoverStatus.getDirection(), marsRover.getRoverStatus().getDirection());
    }

    @Test
    public void should_return_00W_when_execute_command_given_00S_R() {
        //given
        MarsRover marsRover = new MarsRover(new RoverStatus(0, 0, 'S'));
        RoverStatus expectedRoverStatus = new RoverStatus(0, 0, 'W');
        //when
        marsRover.executeCommands("R");
        //then
        assertEquals(expectedRoverStatus.getLocationX(), marsRover.getRoverStatus().getLocationX());
        assertEquals(expectedRoverStatus.getLocationY(), marsRover.getRoverStatus().getLocationY());
        assertEquals(expectedRoverStatus.getDirection(), marsRover.getRoverStatus().getDirection());
    }

    @Test
    public void should_return_1neg2S_when_execute_command_given_00N_MRMRMMM() {
        //given
        MarsRover marsRover = new MarsRover(new RoverStatus(0, 0, 'N'));
        RoverStatus expectedRoverStatus = new RoverStatus(1, -2, 'S');
        //when
        marsRover.executeCommands("MRMRMMM");
        //then
        assertEquals(expectedRoverStatus.getLocationX(), marsRover.getRoverStatus().getLocationX());
        assertEquals(expectedRoverStatus.getLocationY(), marsRover.getRoverStatus().getLocationY());
        assertEquals(expectedRoverStatus.getDirection(), marsRover.getRoverStatus().getDirection());
    }

    @Test
    public void should_return_AReport_when_execute_command_with_report_given_full_instructions() {
        //given
        MarsRover marsRover = new MarsRover(new RoverStatus(0, 0, 'N'));
        RoverStatus expectedRoverStatus = new RoverStatus(1, -2, 'S');
        //when
        String report = marsRover.executeInstructionWithReport("0 0 N MRMRMMM");
        //then
        assertEquals(expectedRoverStatus.getLocationX(), marsRover.getRoverStatus().getLocationX());
        assertEquals(expectedRoverStatus.getLocationY(), marsRover.getRoverStatus().getLocationY());
        assertEquals(expectedRoverStatus.getDirection(), marsRover.getRoverStatus().getDirection());
        assertEquals("X: 1 Y: -2 D: S", report);
    }
}
