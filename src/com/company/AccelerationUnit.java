package com.company;

public final class AccelerationUnit {
    protected static double acceleration(double mass, int radius){
        return Planet.G * mass / (Math.pow(radius,2) * 1000000);
    }
}
