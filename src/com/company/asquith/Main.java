package com.company.asquith;

import java.util.*;


public class Main {


    public static double userInput() {
        System.out.print("Please enter a temperature in Fahrenheit: ");
        Scanner input = new Scanner(System.in);
        double fTemp = input.nextDouble();
        return fTemp;
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
            fTemp = userInput();
            double cTemp = convertTemp(fTemp);
            displayTemp(fTemp, cTemp);
        }
    }
}
