package org.week3.day10;

import java.util.Scanner;

public class xEqualsToy {
    public static boolean xequaly(int x, int y) {

        return  (x==y);
    }
    public static void main(String[] args) {
        int x, y;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x ");
        x = sc.nextInt();
        System.out.println("Enter y");
        y = sc.nextInt();
        System.out.println(xequaly(x,y));

    }


}







