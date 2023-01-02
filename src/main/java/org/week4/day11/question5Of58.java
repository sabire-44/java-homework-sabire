package org.week4.day11;

import java.util.Scanner;

public class question5Of58 {
    public static void main(String[] args){
        /**
         * 5- Define a method that returns the product of two numbers entered by user.
         */
        int num3, num4, mult;
        Scanner multip = new Scanner(System.in);
        System.out.println("Enter number3: ");
        num3 = multip.nextInt();
        System.out.println("Enter number4: ");
        num4 = multip.nextInt();
        mult = num3 * num4;
        System.out.println(num3 + "*" + num4 + " = " + mult);
    }
}
//int[] Q5(){
//        /*Define a method that returns the product of
//        two numbers entered by user.*/
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please put 2 numbers :");
//        int[] num = new int[2];
//        num[0] = scanner.nextInt();
//        num[1]= scanner.nextInt();
//        scanner.close();
//        return num;
//    }
