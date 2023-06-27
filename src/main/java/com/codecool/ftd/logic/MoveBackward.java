package com.codecool.ftd.logic;

import com.codecool.ftd.data.Drone;
import com.codecool.ftd.data.Position;

public class MoveBackward implements MoveStrategy{
    @Override
    public void move(Drone drone, String position) {
        Position acctualPosition = drone.getPosition();
        int newZ = acctualPosition.z() - 1;
        Position newPositions = new Position(acctualPosition.x(), acctualPosition.y(), newZ);
        drone.setPosition(newPositions);
        System.out.println("Drone moved backward. New position: " + newPositions);
    }
}
