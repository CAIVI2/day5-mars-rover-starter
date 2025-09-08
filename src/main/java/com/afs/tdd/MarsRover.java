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
    public static final String MOVE_BACKWARD = "B";
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

    public void setDirection(String direction) {
        this.direction = direction;
    }

    void move(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }

    public void executeCommand(String command) {
        RoverCommand roverCommand = CommandFactory.createCommand(command);
        roverCommand.execute(this);
    }

    public void executeCommands(List<String> commands) {
        commands.forEach(this::executeCommand);
    }
}
