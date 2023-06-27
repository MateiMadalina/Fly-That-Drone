package com.codecool.ftd.logic;

import com.codecool.ftd.data.Drone;
import com.codecool.ftd.data.Position;

import java.util.List;

public class MovementEngine {
    private final MoveStrategy moveStrategy;

    public MovementEngine(MoveStrategy moveStrategy) {
        this.moveStrategy = moveStrategy;
    }


    public void move(Drone drone, String command) {
       moveStrategy.move(drone,command);
    }

    public List<String> getCommands() {
        return List.of("Forward", "Backward", "Left","Right");
    }


}
