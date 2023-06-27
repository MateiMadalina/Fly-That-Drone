package com.codecool.ftd.logic;

import com.codecool.ftd.data.Drone;
import com.codecool.ftd.data.Position;

public class MoveLeft implements MoveStrategy{
    @Override
    public void move(Drone drone, String position) {
            Position acctualPosition = drone.getPosition();
            int newX = acctualPosition.x() - 1;
            Position newPositions = new Position(newX, acctualPosition.y(), acctualPosition.z());
            drone.setPosition(newPositions);
            System.out.println("Drone moved forward. New position: " + newPositions);
    }
}
