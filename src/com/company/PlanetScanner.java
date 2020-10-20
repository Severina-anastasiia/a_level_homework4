package com.company;

import java.util.Scanner;

public class PlanetScanner {
    private PlanetReport planets = new PlanetReport();
    public void run(){
        boolean end = true;
        while (end){
            System.out.println("About what planet you want to know?\n"
                    + "1 - Mercury\n" + "2 - Venus\n" + "3 - Earth\n" + "4 - Mars\n"
                    + "5 - Jupiter\n" + "6 - Saturn\n" + "7 - Uranus\n" + "8 - Neptune\n" + "9 - exit\n");
            Scanner input = new Scanner(System.in);
            int i = input.nextInt();
            switch (i){
                case 1:
                    planets.print(0);
                    break;
                case 2:
                    planets.print(1);
                    break;
                case 3:
                    planets.print(2);
                    break;
                case 4:
                    planets.print(3);
                    break;
                case 5:
                    planets.print(4);
                    break;
                case 6:
                    planets.print(5);
                    break;
                case 7:
                    planets.print(6);
                    break;
                case 8:
                    planets.print(7);
                    break;
                case 9:
                    end = false;
                    break;
                default:
                    System.out.println("Incorrect value. Try again");
            }
        }
    }
}
