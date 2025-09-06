package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MarsRoverTest {
    @Test
    public void should_return_y_plus_when_input_moveForward_N() {
        String command = "M";

        MarsRover marsRover = new MarsRover(0, 0, "N");
        marsRover.executeCommand(command);

        assertEquals(0, marsRover.getX());
        assertEquals(1, marsRover.getY());
        assertEquals("N", marsRover.getDirection());
    }

    @Test
    public void should_return_y_minus_when_input_moveForward_S() {
        String command = "M";

        MarsRover marsRover = new MarsRover(0, 0, "S");
        marsRover.executeCommand(command);

        assertEquals(0, marsRover.getX());
        assertEquals(-1, marsRover.getY());
        assertEquals("S", marsRover.getDirection());
    }

    @Test
    public void should_return_x_plus_when_input_moveForward_E() {
        String command = "M";

        MarsRover marsRover = new MarsRover(0, 0, "E");
        marsRover.executeCommand(command);

        assertEquals(1, marsRover.getX());
        assertEquals(0, marsRover.getY());
        assertEquals("E", marsRover.getDirection());
    }

    @Test
    public void should_return_x_minus_when_input_moveForward_W() {
        String command = "M";

        MarsRover marsRover = new MarsRover(0, 0, "W");
        marsRover.executeCommand(command);

        assertEquals(-1, marsRover.getX());
        assertEquals(0, marsRover.getY());
        assertEquals("W", marsRover.getDirection());
    }

    @Test
    public void should_return_direction_E_when_input_turnRight_N() {
        String command = "R";

        MarsRover marsRover = new MarsRover(0, 0, "N");
        marsRover.executeCommand(command);

        assertEquals(0, marsRover.getX());
        assertEquals(0, marsRover.getY());
        assertEquals("E", marsRover.getDirection());
    }

    @Test
    public void should_return_direction_S_when_input_turnRight_E() {
        String command = "R";

        MarsRover marsRover = new MarsRover(0, 0, "E");
        marsRover.executeCommand(command);

        assertEquals(0, marsRover.getX());
        assertEquals(0, marsRover.getY());
        assertEquals("S", marsRover.getDirection());
    }

    @Test
    public void should_return_direction_W_when_input_turnRight_S() {
        String command = "R";

        MarsRover marsRover = new MarsRover(0, 0, "S");
        marsRover.executeCommand(command);

        assertEquals(0, marsRover.getX());
        assertEquals(0, marsRover.getY());
        assertEquals("W", marsRover.getDirection());
    }

    @Test
    public void should_return_direction_N_when_input_turnRight_W() {
        String command = "R";

        MarsRover marsRover = new MarsRover(0, 0, "W");
        marsRover.executeCommand(command);

        assertEquals(0, marsRover.getX());
        assertEquals(0, marsRover.getY());
        assertEquals("N", marsRover.getDirection());
    }

    @Test
    public void should_return_direction_W_when_input_turnLeft_N() {
        String command = "L";

        MarsRover marsRover = new MarsRover(0, 0, "N");
        marsRover.executeCommand(command);

        assertEquals(0, marsRover.getX());
        assertEquals(0, marsRover.getY());
        assertEquals("W", marsRover.getDirection());
    }

    @Test
    public void should_return_direction_S_when_input_turnLeft_W() {
        String command = "L";

        MarsRover marsRover = new MarsRover(0, 0, "W");
        marsRover.executeCommand(command);

        assertEquals(0, marsRover.getX());
        assertEquals(0, marsRover.getY());
        assertEquals("S", marsRover.getDirection());
    }

    @Test
    public void should_return_direction_E_when_input_turnLeft_S() {
        String command = "L";

        MarsRover marsRover = new MarsRover(0, 0, "S");
        marsRover.executeCommand(command);

        assertEquals(0, marsRover.getX());
        assertEquals(0, marsRover.getY());
        assertEquals("E", marsRover.getDirection());
    }

    @Test
    public void should_return_direction_N_when_input_turnLeft_E() {
        String command = "L";

        MarsRover marsRover = new MarsRover(0, 0, "E");
        marsRover.executeCommand(command);

        assertEquals(0, marsRover.getX());
        assertEquals(0, marsRover.getY());
        assertEquals("N", marsRover.getDirection());
    }

    @Test
    public void should_return_y_minus_when_input_moveBackward_N() {
        String command = "B";

        MarsRover marsRover = new MarsRover(0, 0, "N");
        marsRover.executeCommand(command);

        assertEquals(0, marsRover.getX());
        assertEquals(-1, marsRover.getY());
        assertEquals("N", marsRover.getDirection());
    }
}
