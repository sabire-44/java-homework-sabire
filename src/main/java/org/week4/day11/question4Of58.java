package org.week4.day11;

import java.util.Scanner;

public class question4Of58 {
    public static void main(String[] args){


    /**
     * 4- Write a program to print the sum of two numbers entered by user by defining
     * your own method.
     */
    int num1, num2, sum;
    Scanner input = new Scanner(System.in);
        System.out.println("Enter number1: ");
    num1 = input.nextInt();
        System.out.println("Enter number2: ");
    num2 = input.nextInt();
    sum = num1 + num2;
        System.out.println(num1 + "+" + num2 + " = " + sum);

    }
}
//
