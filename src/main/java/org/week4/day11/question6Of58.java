package org.week4.day11;

import java.util.Scanner;

public class question6Of58 {
    public static void main(String[] args) {
        /**
         * 6- Write a program to print the circumference and area of a circle of radius
         * entered by user by defining your own method.
         */
        double radius, area, perimeter;
        Scanner circle = new Scanner(System.in);
        System.out.println("enter the radius of the circle: ");
        radius = circle.nextDouble();
        area = Math.PI * radius * radius;
        perimeter = Math.PI * radius * 2;
        System.out.println("Area of the Circle is" + area);
        System.out.println("Perimeter of the Circle is" + perimeter);

    }
}
