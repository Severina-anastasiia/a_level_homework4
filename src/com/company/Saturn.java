package com.company;

public class Saturn extends Planet implements PlanetAcceleration{
    public Saturn(){
        this.mass = 5.683 * Math.pow(10, 26);
        this.radius = 58232;
    }
    @Override
    public double acceleration() {
        return AccelerationUnit.acceleration(mass, radius);
    }

    @Override
    public String toString() {
        return "Saturn";
    }
}
