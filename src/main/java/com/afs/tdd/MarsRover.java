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
        if (direction.equals("N")) {
            y++;
        } else if (direction.equals("S")) {
            y--;
        }
        if (direction.equals("E")) {
            x++;
        }
    }
}
