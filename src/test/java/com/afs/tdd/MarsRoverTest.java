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
}
