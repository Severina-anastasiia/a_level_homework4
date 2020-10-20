package com.company;

public class Earth extends Planet implements PlanetAcceleration{

    public Earth(){
        this.mass = 5.9726 * Math.pow(10, 24);
        this.radius = 6371;
    }
    @Override
    public double acceleration() {
        return AccelerationUnit.acceleration(mass, radius);
    }

    @Override
    public String toString() {
        return "Earth";
    }
}
