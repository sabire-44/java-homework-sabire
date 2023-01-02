package org.week2.day06;

import java.util.Scanner;

public class addingnumberuserinput {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter two numbers that will be added");
        int firstnumber=obj.nextInt();
        int secnumber=obj.nextInt();
        int total=firstnumber+secnumber;
        System.out.println("Total: "+total);

    }
}
