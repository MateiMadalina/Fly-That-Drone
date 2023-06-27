package com.codecool.ftd.logic;

import com.codecool.ftd.data.Drone;
import com.codecool.ftd.data.Position;

import java.util.List;

public class MovementEngine {

    public void move(Drone drone, String command,MoveStrategy moveStrategy) {
       moveStrategy.move(drone,command);
    }

    public List<String> getCommands() {
        return List.of( "forward","backward", "left","right","up","down");
    }
}
