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
                case NORTH: direction = EAST; break;
                case EAST: direction = SOUTH; break;
                case SOUTH: direction = WEST; break;
                case WEST: direction = NORTH; break;
            }
        }
        if (command.equals(TURN_LEFT)) {
            switch (direction) {
                case NORTH: direction = WEST; break;
                case WEST: direction = SOUTH; break;
                case SOUTH: direction = EAST; break;
                case EAST: direction = NORTH; break;
            }
        }
    }

    private void calculateLocation(String command) {
        if (command.equals(MOVE_FORWARD)) {
            RoverCommand roverCommand = new MoveForwardCommand();
            roverCommand.execute(this);
        }
        if (command.equals(MOVE_BAKCWARD)) {
            RoverCommand roverCommand = new MoveBackwardCommand();
            roverCommand.execute(this);
        }
    }

    public void executeCommands(List<String> commands) {
        for (String command : commands) {
            executeCommand(command);
        }
    }
}
