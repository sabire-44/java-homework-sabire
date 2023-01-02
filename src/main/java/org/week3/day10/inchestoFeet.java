package org.week3.day10;

import java.util.Scanner;

public class inchestoFeet {

        public static void main(String args[])
        {
            //Scanner class object created
            Scanner sc=new Scanner(System.in);
            double feet = 1;
            double inch = 1;
            //converting inch to feet
            double ft = inch / 12;
            //converting feet to inch
            double inc = feet * 12;
            //printing result
            System.out.println("Value of "+inch+" inch in feet: "+ ft);
            System.out.println("Value of "+feet+" feet in inch: "+ inc);
        }
    }

