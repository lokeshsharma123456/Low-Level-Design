package org.example.vehicle;

import org.example.strategy.DriveStrategy;

public class Vehicle {

    DriveStrategy driveStrategy;

    Vehicle(DriveStrategy ds){
        this.driveStrategy = ds;
    }

    public void drive(){
        driveStrategy.drive();
    }
}
