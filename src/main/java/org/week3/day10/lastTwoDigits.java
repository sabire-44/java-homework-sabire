package org.week3.day10;

import java.util.Scanner;

public class lastTwoDigits {
    public static void main(String[] args) {
        long customerID;
        long lasttwo=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Customer ID with six digits: ");
        customerID=sc.nextLong();
        lasttwo = customerID % 100;
        System.out.println(lasttwo);
        if (lasttwo>24 && lasttwo<100) {
            System.out.println("Customer( Customer ID =" +customerID+" is not eligible for the promotion");
        } else if(lasttwo>=0 && lasttwo<25) {
            System.out.println("Customer( Customer ID =" +customerID+"is eligible for the promotion");
        }
    }
}
// public String Q4(int id){
//           if (0<=(id%100)&&(id%100)<25){
//               return ("CONGRATS ! COSTUMER ID "+id+" IS ELIGIBLE FOR OUR SPECIAL DISCOUNT.");
//           }
//           return ("SORRY ! COSTUMER ID "+id+" IS NOT ELIGIBLE FOR OUR SPECIAL DISCOUNT.");
//       }