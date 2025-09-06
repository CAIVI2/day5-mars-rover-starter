package com.afs.tdd;

import java.util.List;

public class MarsRover {
    public static final String TURN_RIGHT = "R";
    public static final String NORTH = "N";
    public static final String EAST = "E";
    public static final String SOUTH = "S";
    public static final String WEST = "W";
    public static final String TURN_LEFT = "L";
    public static final String MOVE_FORWARD = "M";
    public static final String MOVE_BAKCWARD = "B";
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

    void move(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }

    public void executeCommand(String command) {
        calculateLocation(command);
        calculateDirection(command);
    }

    private void calculateDirection(String command) {
        if (command.equals(TURN_RIGHT)) {
            switch (direction) {
                case "N": direction = "E"; break;
                case "E": direction = "S"; break;
                case "S": direction = "W"; break;
                case "W": direction = "N"; break;
            }
        }
        if (command.equals(TURN_LEFT)) {
            switch (direction) {
                case "N": direction = "W"; break;
                case "W": direction = "S"; break;
                case "S": direction = "E"; break;
                case "E": direction = "N"; break;
            }
        }
    }

    private void calculateLocation(String command) {
        if (command.equals(MOVE_FORWARD)) {
            switch (direction) {
                case "N": move(0, 1); break;
                case "S": move(0, -1); break;
                case "E": move(1, 0); break;
                case "W": move(-1, 0); break;
            }
        }
        if (command.equals(MOVE_BAKCWARD)) {
            switch (direction) {
                case "N": move(0, -1); break;
                case "S": move(0, 1); break;
                case "E": move(-1, 0); break;
                case "W": move(1, 0); break;
            }
        }
    }

    public void executeCommands(List<String> commands) {
        for (String command : commands) {
            executeCommand(command);
        }
    }
}
