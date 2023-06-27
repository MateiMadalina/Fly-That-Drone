package com.codecool.ftd.logic;

import com.codecool.ftd.data.Drone;
import com.codecool.ftd.data.Position;

public class MoveDown implements MoveStrategy{
    @Override
    public void move(Drone drone, String position) {
        Position acctualPosition = drone.getPosition();
        int newY = acctualPosition.y() - 1;
        Position newPositions = new Position(acctualPosition.x(), newY, acctualPosition.z());
        drone.setPosition(newPositions);
        System.out.println("Drone moved forward. New position: " + newPositions);
    }
}
