package org.week4.day11;

import java.util.Scanner;

public class question1Of58 {
    /**
     * 1- Define two methods to print the maximum and the minimum number respectively among three numbers
     * entered by user.
     */
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        int a = 0, b = 0, c = 0, small = 0, large = 0;
        System.out.println("Enter three numbers");
        a = ss.nextInt();
        b = ss.nextInt();
        c = ss.nextInt();
        large = Math.max(a, Math.max(b, c));
        small = Math.min(a, Math.min(b, c));
        System.out.println("max number" + large + "min number" + small);
    }
}

/*
//package com.company.Function;

import java.util.Scanner;

public class Max_Min {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int max = maxofthree(a,b,c);
        int min = minofthree(a,b,c);
        System.out.println("MAX : " + max);
        System.out.println("MIN : " + min);
    }

    static int minofthree(int a, int b, int c) {

        int min = 0;

        if(a < b && a < c){
            min = a;
        }
        else if (b < a && b < c){
            min = b;
        }
        else{
            min = c;
        }
        return min;

    }

    static int maxofthree(int a, int b, int c) {

        int max = 0;

        if(a > b && a > c){
            max = a;
        }
        else if (b > a && b > c){
            max = b;
        }
        else{
            max = c;
        }
        return max;
    }
}
 */
