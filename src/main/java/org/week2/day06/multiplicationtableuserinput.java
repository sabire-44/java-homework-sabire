package org.week2.day06;

import java.util.Scanner;

public class multiplicationtableuserinput {
    public static void main(String[] args)
    {
        // number n for which we have to print the
        // multiplication table.
        Scanner given=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = given.nextInt();
        // looping from 1 to 10 to print the multiplication
        // table of the number.
        // using for loop
        for (int i = 1; i <= 10; i++) {
            // printing the N*i,ie ith multiple of N.
            System.out.println(number + " * " + i + " = " + number * i);
        }
    }
}
