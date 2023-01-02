package org.week2.day04;

public class EarningJava30nov {
    public static void main(String[] args) {
        /**
         * write a program that annual earning
         *               Perfect start for work => =>100
         *               Good start for work => 80 ~ 99
         *               Average start for work => 70 ~ 79
         *               below average start for work => 60 ~ 69
         *               Not acceptable =>  0 ~ 59
         */
        int earning= 70;
        if ( earning>=100) {
            System.out.println("Perfect start for work");
        } else if  ( earning>=80 && earning<=99){
            System.out.println("Good start for work");
        } else if ( earning>=70 && earning<=79) {
            System.out.println("Average start for work");
        } else if ( earning>=60 && earning<=69){
            System.out.println("below average start for work");
        } else if ( earning >=0 && earning<=59){
            System.out.println("Not acceptable");
        } else {
            System.out.println("Please enter the right number");
        }

    }
}
