package com.company;

public class Mars extends Planet implements PlanetAcceleration{
    public Mars(){
        this.mass = 6.4171 * Math.pow(10, 23);
        this.radius = 3390;
    }
    @Override
    public double acceleration() {
        return AccelerationUnit.acceleration(mass, radius);
    }

    @Override
    public String toString() {
        return "Mars";
    }
}
