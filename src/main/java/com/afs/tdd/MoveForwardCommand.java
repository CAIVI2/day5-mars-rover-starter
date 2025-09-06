package com.afs.tdd;

import static com.afs.tdd.MarsRover.NORTH;
import static com.afs.tdd.MarsRover.SOUTH;
import static com.afs.tdd.MarsRover.EAST;
import static com.afs.tdd.MarsRover.WEST;

public class MoveForwardCommand implements RoverCommand {
    @Override
    public void execute(MarsRover rover) {
        switch (rover.getDirection()) {
            case NORTH: rover.move(0, 1); break;
            case SOUTH: rover.move(0, -1); break;
            case EAST: rover.move(1, 0); break;
            case WEST: rover.move(-1, 0); break;
        }
    }
}
