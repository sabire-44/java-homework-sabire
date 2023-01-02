package org.week2.day06;

import java.util.Scanner;

public class passingexamuserinput {
    /**
     * Write a java program to find if the student is passed the exam (user scanner class for user inputs)
     * 	Note: passing mark is : 65
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the mark of the student:");
        int mark=sc.nextInt();
        if (mark>=65 && mark<101){
            System.out.println("You passed the exam");
        } else if (mark<65 && mark>=0){
            System.out.println("You failed");
        } else if (mark<0 || mark>100){
            System.out.println("Write the proper exam mark");
        }

    }
}
