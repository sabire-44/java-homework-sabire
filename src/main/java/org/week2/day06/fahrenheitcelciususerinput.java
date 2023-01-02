package org.week2.day06;

import java.util.Scanner;

public class fahrenheitcelciususerinput {
    public static void main(String[] args) {
        /**
         * Write a java program to convert Fahrenheit to Celsius using user input.
         * 	Formula: Celsius= (Fahrenheit-32)*5/9
         * 	Given : 87F
         * 	Calculation:  (87-32)*5/9=30.5 Celcius
         */
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the Fahrenheit value:");
        double Fahrenheit=input.nextDouble();
        double Celcius=(Fahrenheit-32)*5/9;
        System.out.println("Celcius"+Celcius);

    }
}
