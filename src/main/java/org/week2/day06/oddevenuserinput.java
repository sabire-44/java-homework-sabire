package org.week2.day06;

import java.util.Scanner;

public class oddevenuserinput {
    /**
     * Write a java program to find the given number is odd or even (user scanner class for user inputs)
     */
    public static void main(String[] args) {
        Scanner given=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = given.nextInt();
        int modresult = number % 2;
        if (modresult == 0) {
            System.out.println("The given number is an even number");
        } else if(modresult == 1) {
            System.out.println("The given number is an odd number");
        }
    }
}
