package org.week2.day06;

import java.util.Scanner;

public class smallestnumberuserinput {
    /**
     * Write a java program to find the smallest number (user scanner class for user inputs)
     */
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter three numbers:");
            int first = sc.nextInt();
            int second = sc.nextInt();
            int third = sc.nextInt();
          //  int x = (first > second && first > third) ? first : (second > third) ? second : third;
            int y = (first < second && first < third) ? first : (second < third) ? second : third;
            //  System.out.println("Largest Number : "+x);
            System.out.println("Smallest Number : "+y);
        }
}


