package org.example.strategy;

public class SpecialStrategy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("Special Strategy");
    }
}
