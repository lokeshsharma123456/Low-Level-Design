package org.example.vehicle;

import org.example.strategy.DriveStrategy;

public class NormalCar extends Vehicle {

    public  NormalCar(DriveStrategy ds) {
        super(ds);
    }
}
