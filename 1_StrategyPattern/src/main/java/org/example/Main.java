package org.example;

import org.example.strategy.SpecialStrategy;
import org.example.vehicle.SportsBike;
import org.example.vehicle.Vehicle;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Vehicle vehicle = new SportsBike(new SpecialStrategy());
        vehicle.drive();
    }
}