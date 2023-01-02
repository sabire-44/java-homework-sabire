package org.week2.day06;

import java.util.Scanner;
/** a java program to get below inputs from user
      * Enter your Name
      * Enter your Gender
       *Enter your Age
     *Enter your Phone Number
        Enter your City
        And print these in puts in below format:
        Please verify below details are correct:
        Choose one of the option(1 or 2):
        1- All given informations are correct
        2- I need to re-enter the informations
        Name 			: John Doe
        Gender			: Male
        Age				: 35
        Phone Number	: 7775554433
        City			: Colorado
        If user enters 1 then print the below message:
        Thanks for your confirmation, we saved your details.
        If user enters 2 then go to the beginning and start asking the same questions again.
*/
public class namegenderagephonecityuserinput {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        while(true){
            System.out.println("Enter your name:");
            String name=input.next();
            System.out.println("Enter your gender:");
            String gender=input.next();
            System.out.println("Enter your age:");
            byte age=input.nextByte();
            System.out.println("Enter your phone number:");
            long phonenumber=input.nextLong();
            System.out.println("Enter your city:");
            String city=input.next();
            System.out.println("Please verify below details are correct:\n"+":\n choose one of the options(1 or 2)");
            byte selection= input.nextByte();
            System.out.println("Name\t\t\t:"+name);
            System.out.println("Gender\t\t\t:"+gender);
            System.out.println("Age\t\t\t\t:"+age);
            System.out.println("Phone number\t:"+phonenumber);
            System.out.println("City\t\t\t:"+city);

            if (selection==1) {
            System.out.println("Thanks for your confirmation,we saved your details.");
            break;
            } else if (selection ==2) {
            continue;
}
}
}
}