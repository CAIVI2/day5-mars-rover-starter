package com.afs.tdd;

import java.util.List;

public class MarsRover {
    public static final String TURN_RIGHT = "R";
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
            if (direction.equals("N")) {
                direction = "E";
            } else if (direction.equals("E")) {
                direction = "S";
            } else if (direction.equals("S")) {
                direction = "W";
            } else {
                direction = "N";
            }
        }
        if (command.equals("L")) {
            if (direction.equals("N")) {
                direction = "W";
            } else if (direction.equals("W")) {
                direction = "S";
            } else if (direction.equals("S")) {
                direction = "E";
            } else {
                direction = "N";
            }
        }
    }

    private void calculateLocation(String command) {
        if (command.equals("M")) {
            if (direction.equals("N")) {
                y++;
            } else if (direction.equals("S")) {
                y--;
            }
            if (direction.equals("E")) {
                x++;
            } else if (direction.equals("W")) {
                x--;
            }
        }
        if (command.equals("B")) {
            if (direction.equals("N")) {
                y--;
            } else if (direction.equals("S")) {
                y++;
            }
            if (direction.equals("E")) {
                x--;
            } else if (direction.equals("W")) {
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
