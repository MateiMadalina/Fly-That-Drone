package com.codecool.ftd.logic;

import com.codecool.ftd.data.Drone;
import com.codecool.ftd.data.Position;

public interface MoveStrategy {
    void move(Drone drone, String position);
}
