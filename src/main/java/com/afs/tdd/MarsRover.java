package com.afs.tdd;

public class MarsRover {
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
        if (command.equals("R")) {
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
}
