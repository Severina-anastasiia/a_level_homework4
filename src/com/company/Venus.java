package com.company;

public class Venus extends Planet implements PlanetAcceleration{
    public Venus(){
        this.mass = 4.867 * Math.pow(10, 24);
        this.radius = 6052;
    }
    @Override
    public double acceleration() {
        return AccelerationUnit.acceleration(mass, radius);
    }

    @Override
    public String toString() {
        return "Venus";
    }
}
