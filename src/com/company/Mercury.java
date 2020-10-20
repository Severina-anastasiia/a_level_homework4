package com.company;

public class Mercury extends Planet implements PlanetAcceleration{
    public Mercury(){
        this.mass = 3.285 * Math.pow(10, 23);
        this.radius = 2440;
    }
    @Override
    public double acceleration() {
        return AccelerationUnit.acceleration(mass, radius);
    }

    @Override
    public String toString() {
        return "Mercury";
    }
}
