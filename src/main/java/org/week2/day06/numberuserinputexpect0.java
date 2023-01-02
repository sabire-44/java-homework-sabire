package org.week2.day06;

import java.util.Scanner;

public class numberuserinputexpect0 {
    /**
     * Write a java program that accepts user input as integer from keyboard until enter 0 to stop.
     */
    public static void main(String[] args) {
        int counter = 0;
        double sum = 0;
        int input = 0;
        double average;
        System.out.print("Enter a series of values (0 to quit): ");
        Scanner in = new Scanner(System.in);
        while ((input = in.nextInt()) != 0) {
            if (input != 0) {
                sum = input + sum;
            }
            counter++;
        }
        if (counter > 0) {
            average = sum / counter;
            System.out.println("Total number of integers entered is " + counter);
            System.out.println("The average value is: " + average);
        } else {
            System.out.println("No data was entered.");
        }

    }
}

/*
Scanner obj = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a number");
            int number = obj.nextInt();
            if (number == 0) {
                break;
            }
            System.out.println(number);
        }
 */