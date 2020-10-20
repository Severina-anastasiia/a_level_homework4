package com.company;

public class Jupiter extends Planet implements PlanetAcceleration{
    public Jupiter(){
        this.mass = 1.898 * Math.pow(10, 27);
        this.radius = 69911;
    }
    @Override
    public double acceleration() {
        return AccelerationUnit.acceleration(mass, radius);
    }

    @Override
    public String toString() {
        return "Jupiter";
    }
}
