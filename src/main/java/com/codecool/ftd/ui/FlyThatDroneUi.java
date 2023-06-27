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
        //|| choice.equals("backwar") || choice.equals("left") || choice.equals("right")
        if(choice.equals("forward") ){
            movementEngine.move(drone, choice, new MoveForward());
        } else if (choice.equals("backward")) {
            movementEngine.move(drone, choice, new MoveBackward());
        }else if (choice.equals("left")) {
            movementEngine.move(drone, choice, new MoveLeft());
        }else if (choice.equals("right")) {
            movementEngine.move(drone, choice, new MoveRight());
        }


    }
}
