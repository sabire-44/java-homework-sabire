package org.week2.day05;

public class IfElseSabire {
    /**
     *  write a program that:
     *             1. 0 ~12 ==> good morning
     * 		2. 12 ~ 15 ==> good afternoon
     * 		3. 15 ~ 23 ==> good night
     * 		4. 12 ==> good noon
     */
    public static void main(String[] args) {
        int hour = 7;
        if (hour>=0 && hour<12) {
            System.out.println("good morning");
        } else if (hour>12 && hour<=15) {
            System.out.println("good afternoon");
        } else if (hour>15 && hour<=24) {
            System.out.println("good night");
        } else if (hour==12){
            System.out.println("good noon");
        } else {
            System.out.println("Please enter right time");
        }



    }



}
