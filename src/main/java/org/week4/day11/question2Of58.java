package org.week4.day11;

import java.util.Scanner;

public class question2Of58 {
    public static void main(String [] args){
        /**
         * 2- Define a program to find out whether a given number is even or odd.
         */
        int number, remainder;
        System.out.println("Please enter an integer number: ");
        Scanner scan = new Scanner(System.in);
        number = scan.nextInt();
        remainder = number % 2;
        if (remainder == 0)
            System.out.println(number + "is an Even number");
        else
            System.out.println(number + "is an Odd number");
    }
}

