package com.afs.tdd;

import java.util.List;

public class MarsRover {
    public static final String TURN_RIGHT = "R";
    public static final String NORTH = "N";
    public static final String EAST = "E";
    public static final String SOUTH = "S";
    public static final String WEST = "W";
    private int x;
    private int y;
    private String direction;

    public MarsRover(int x, int y, String direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }


    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }

    public String getDirection() {
        return direction;
    }

    public void executeCommand(String command) {
        calculateLocation(command);
        calculateDirection(command);
    }

    private void calculateDirection(String command) {
        if (command.equals(TURN_RIGHT)) {
            if (direction.equals(NORTH)) {
                direction = EAST;
            } else if (direction.equals(EAST)) {
                direction = SOUTH;
            } else if (direction.equals(SOUTH)) {
                direction = WEST;
            } else {
                direction = NORTH;
            }
        }
        if (command.equals("L")) {
            if (direction.equals(NORTH)) {
                direction = WEST;
            } else if (direction.equals(WEST)) {
                direction = SOUTH;
            } else if (direction.equals(SOUTH)) {
                direction = EAST;
            } else {
                direction = NORTH;
            }
        }
    }

    private void calculateLocation(String command) {
        if (command.equals("M")) {
            if (direction.equals(NORTH)) {
                y++;
            } else if (direction.equals(SOUTH)) {
                y--;
            }
            if (direction.equals(EAST)) {
                x++;
            } else if (direction.equals(WEST)) {
                x--;
            }
        }
        if (command.equals("B")) {
            if (direction.equals(NORTH)) {
                y--;
            } else if (direction.equals(SOUTH)) {
                y++;
            }
            if (direction.equals(EAST)) {
                x--;
            } else if (direction.equals(WEST)) {
                x++;
            }
        }
    }

    public void executeCommands(List<String> commands) {
        for (String command : commands) {
            executeCommand(command);
        }
    }
}
