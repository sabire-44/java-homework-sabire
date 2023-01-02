package org.week2.day04;

public class blooddonation {
    public static <string> void main(String[] args) {


        /**
         *  homework3
         *  Assign age and weight,
         * for blood donation,
         *  people should be bigger than 21
         *  and
         *  more than 90 pound
         *  please use nested if
         */
        int age = 20, weight = 91;

        /**
         * blood donation criteria
         */
        if (age > 20) {
            if (weight > 90) {
                System.out.println("age " + age + "weight " + weight + "you are eligible for blood donation");
            } else if (weight <= 90) {
                System.out.println("Your age is acceptable but you are not eligible because of your weight");
            }
        } else if (age <= 20) {
            System.out.println("You are not eligible for the age");
        } else if (age <= 0) {
            System.out.println("age is not written properly, enter the age again");
        }
    }
}



