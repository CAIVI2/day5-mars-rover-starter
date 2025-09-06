package com.afs.tdd;

import static com.afs.tdd.MarsRover.NORTH;
import static com.afs.tdd.MarsRover.SOUTH;
import static com.afs.tdd.MarsRover.EAST;
import static com.afs.tdd.MarsRover.WEST;

public class TurnLeftCommand implements RoverCommand {
    @Override
    public void execute(MarsRover rover) {
        switch (rover.getDirection()) {
            case NORTH: rover.setDirection(WEST); break;
            case WEST: rover.setDirection(SOUTH); break;
            case SOUTH: rover.setDirection(EAST); break;
            case EAST: rover.setDirection(NORTH); break;
        }
    }
}