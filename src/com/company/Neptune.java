package com.company;

public class Neptune extends Planet implements PlanetAcceleration{
    public Neptune(){
        this.mass = 1.024 * Math.pow(10, 26);
        this.radius = 24622;
    }
    @Override
    public double acceleration() {
        return AccelerationUnit.acceleration(mass, radius);
    }

    @Override
    public String toString() {
        return "Neptune";
    }
}
