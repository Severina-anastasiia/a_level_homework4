package com.company;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class PlanetReport {
    private ArrayList<PlanetAcceleration> planets = new ArrayList<>();
    private DecimalFormat df = new DecimalFormat("###.###");

    public PlanetReport(){
        planets.add(new Mercury());
        planets.add(new Venus());
        planets.add(new Earth());
        planets.add(new Mars());
        planets.add(new Jupiter());
        planets.add(new Saturn());
        planets.add(new Uranus());
        planets.add(new Neptune());
    }

    public void print(int index){
        System.out.println("Free fall acceleration of " + planets.get(index).toString()
                + " = " + df.format(planets.get(index).acceleration()));
    }
}
