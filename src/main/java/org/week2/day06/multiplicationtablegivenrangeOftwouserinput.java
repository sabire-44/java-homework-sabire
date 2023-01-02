package org.week2.day06;

import java.util.Scanner;

public class multiplicationtablegivenrangeOftwouserinput {
    /**
     *Write a java program to print the multiplication table for the given range by user input.
     * input: 2 5
     * output:
     * 2 * 1 =2 		3 *1 = 3 		4 * 1 =4 		5 * 1 =5
     * 2 * 2 =4 		3 *2 = 6 		4 * 2=8 		5 * 2 =10
     */
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please put your first number");
            int number1 = scanner.nextInt();
            System.out.println("Please put your second number");
            int number2= scanner.nextInt();

            int results=1;
            if(!(number2 <=0) && !(number1 <=0)){ //  false & false
                for (int i = number1; i <= number2; i++) {
                    for (int j = 1; j <= 10; j++) {
                        results = i * j;
                        System.out.println(i + " * " + j + " = " + results + " \t");
                    }
                    System.out.println();
                }
            }else{
                System.out.println("Please enter a value greater then 0");
            }
            scanner.close();
        }
}
