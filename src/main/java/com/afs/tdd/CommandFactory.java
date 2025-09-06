package com.afs.tdd;

import static com.afs.tdd.MarsRover.MOVE_FORWARD;
import static com.afs.tdd.MarsRover.MOVE_BAKCWARD;
import static com.afs.tdd.MarsRover.TURN_LEFT;
import static com.afs.tdd.MarsRover.TURN_RIGHT;

public class CommandFactory {
    public static RoverCommand createCommand(String command) {
        switch (command) {
            case MOVE_FORWARD: return new MoveForwardCommand();
            case MOVE_BAKCWARD: return new MoveBackwardCommand();
            case TURN_LEFT: return new TurnLeftCommand();
            case TURN_RIGHT: return new TurnRightCommand();
            default: throw new IllegalArgumentException("Not found command: " + command);
        }
    }
}