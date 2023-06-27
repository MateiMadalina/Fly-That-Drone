package com.codecool.ftd.ui;

import com.codecool.ftd.data.Drone;
import com.codecool.ftd.logic.*;

import java.util.Scanner;

import static java.util.stream.Collectors.joining;

public class FlyThatDroneUi {
    private final Drone drone;
    private final MovementEngine movementEngine;
    private final Scanner scanner;

    public FlyThatDroneUi(Drone drone, MovementEngine movementEngine, Scanner scanner) {
        this.drone = drone;
        this.movementEngine = movementEngine;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            displayMenu();
            handleChoice();
        }
    }

    private void displayMenu() {
        System.out.println("\n*** Fly That Drone ***");
        System.out.println("\nCurrent drone position: " + drone.getPosition());
        System.out.println("Available movements:\n" + getMovementNames());
    }

    private String getMovementNames() {
        return movementEngine.getCommands().stream()
                .collect(joining(", "));
    }

    private void handleChoice() {
        System.out.print("\nChoice: ");
        String choice = scanner.next();
        System.out.println(choice);
        switch (choice) {
            case "forward" -> movementEngine.move(drone, choice, new MoveForward());
            case "backward" -> movementEngine.move(drone, choice, new MoveBackward());
            case "left" -> movementEngine.move(drone, choice, new MoveLeft());
            case "right" -> movementEngine.move(drone, choice, new MoveRight());
            case "up" -> movementEngine.move(drone, choice, new MoveUp());
            case "down" -> movementEngine.move(drone, choice, new MoveDown());
            case "forward-left" -> movementEngine.move(drone, choice, new MoveForwardLeft());
            case "forward-right" -> movementEngine.move(drone, choice, new MoveForwardRight());
            case "backward-left" -> movementEngine.move(drone, choice, new MoveBackwardLeft());
            case "backward-right" -> movementEngine.move(drone, choice, new MoveBackwardRight());
        }

    }
}
