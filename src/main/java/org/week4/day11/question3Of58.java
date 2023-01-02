package org.week4.day11;

import java.util.Scanner;

public class question3Of58 {
    public static void main(String[] args){
        /**
         * 3- A person is elligible to vote if his/her age is greater than or equal to 18.
         * Define a method to find out if he/she is elligible to vote.
         */
        int age;
        System.out.println("Please enter your age: ");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();

        if (age >= 18) {
            System.out.println("age " + age + "you are eligible to vote");
        } else if (age < 18 || age >= 0) {
            System.out.println("Your are not eligible because of your age ");
        } else if (age <= 0) {
            System.out.println("age is not written properly, enter the age again");
        }
/*
package TIHIfElsePrograms;
import java.util.Scanner;
public class TIHVoting {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your age");
		int age = scan.nextInt();
		if(age>18){
			System.out.println("Welcome to vote");
		}else{
			int shortBy = (18 - age);
			System.out.println("Sorry, you can't vote now! You can vote after :"+ shortBy + " years");
		}
	}
}
 */
    }
}
