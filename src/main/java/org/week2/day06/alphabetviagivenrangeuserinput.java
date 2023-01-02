package org.week2.day06;

import java.util.Scanner;

public class alphabetviagivenrangeuserinput {
    public static void main(String[] args) {
        //Write a java program to print the alphabets with the given range via keyboard.
    /*
    input : a f
    output: a b c d e f
     */
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter your first letter");
            String letter1 = scan.next();
            System.out.println("Enter your second letter");
            String letter2 = scan.next();
            char ch;
            /**
             * We are getting input from keyboard as String.
             * We need to get the letter as char.
             * from String, we can use charAt() method to extract
             * the character( char) .
             * We used if condition to make sure user enters only single character
             */
            if (letter1.length() == 1 && letter2.length() == 1) {
                for (ch = letter1.charAt(0); ch <= letter2.charAt(0); ch++) {
                    System.out.print(ch + " ");
                }
            }else {
                System.out.println("Enter only one letter");
            }
       /* for (ch = 'a'; ch <= 'z'; ch++) {
            System.out.print(ch + " ");
        }*/ //if you directly use the char. Without Scanner

        }
    }
