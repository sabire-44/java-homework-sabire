package org.week2.day06;

import java.util.Scanner;

public class reversegivennumberuserinput {
    /**
     * Write a java program to reverse a given number (user scanner class for user inputs)
     * input: 45678 , Output: 87654
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        int rev = 0;

        //find reverse using while loop
        while (num != 0)
        {
            rev = rev * 10 + num % 10;
            num = num / 10;
        }
        System.out.println("Reversed num: " + rev);

    }
}
