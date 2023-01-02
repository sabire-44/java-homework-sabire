package org.week4.day11;

import java.util.Scanner;

public class question8Of58 {
    public static void main(String[] args ) {
        /**
         * 8- Write a program which will ask the user to enter his/her marks (out of 100).
         * Define a method that will display grades according to the marks entered as below:
         * Marks        Grade
         * 91-100         AA
         * 81-90          AB
         * 71-80          BB
         * 61-70          BC
         * 51-60          CD
         * 41-50          DD
         * <=40          Fail
         */
        int mark;
        Scanner grade = new Scanner(System.in);
        System.out.println("Enter your mark: ");
        mark = grade.nextInt();
        if (mark > 90 && mark <= 100) {
            System.out.println("AA");
        } else if (mark > 80 && mark <= 90) {
            System.out.println("AB");
        } else if (mark > 70 && mark <= 80) {
            System.out.println("BB");
        } else if (mark > 60 && mark <= 70) {
            System.out.println("BC");
        } else if (mark > 50 && mark <= 60) {
            System.out.println("CD");
        } else if (mark > 40 && mark <= 50) {
            System.out.println("DD");
        } else if (mark >= 0 && mark <= 40) {
            System.out.println("Fail");
        } else {
            System.out.println("Put an appropriate mark");
        }
    }
}
