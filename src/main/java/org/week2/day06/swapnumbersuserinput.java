package org.week2.day06;

import java.util.Scanner;

public class swapnumbersuserinput {
    public static void main(String[] args) {

        /**
         * Write a java program to swap two numbers (user scanner class for user inputs):
         *         Given: a=20, b=30
         *         Output: a=30, b=20
         */

        Scanner input = new Scanner (System.in);
        System.out.println(" Enter two numbers to swap");
        int a=input.nextInt();
        int b=input.nextInt();
        System.out.println("You entered a= "+a+"  b= "+b);
        int temp=0;
        temp=a;
        a=b;
        b=temp;
        System.out.println("Swapped values a= "+a+"  b= "+b);



    }
}
