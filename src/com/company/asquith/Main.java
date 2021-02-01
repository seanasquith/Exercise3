package com.company.asquith;

import java.util.*;


public class Main {


    public static double collectTemp() {
        System.out.print("Please enter a temperature in Fahrenheit: ");
        Scanner input = new Scanner(System.in);
        return input.nextDouble();
    }

    public static double convertTemp(double fTemp) {
        return 5 * (fTemp - 32) / 9;
    }

    public static void displayTemp(double fTemp, double cTemp) {
        System.out.print(fTemp + "° Fahrenheit is equal to ");
        System.out.printf("%.3f", cTemp);
        System.out.println("° Celsius\n");
    }

    public static void main(String[] args) {
        double fTemp = 0;
        while (fTemp >= -460) {
            fTemp = collectTemp();
            double cTemp = convertTemp(fTemp);
            displayTemp(fTemp, cTemp);
        }
    }
}
