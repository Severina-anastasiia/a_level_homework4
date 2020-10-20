package com.company;

public class Uranus extends Planet implements PlanetAcceleration{
    public Uranus(){
        this.mass = 8.681 * Math.pow(10, 25);
        this.radius = 25362;
    }
    @Override
    public double acceleration() {
        return AccelerationUnit.acceleration(mass, radius);
    }

    @Override
    public String toString() {
        return "Uranus";
    }
}
