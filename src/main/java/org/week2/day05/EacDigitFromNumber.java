package org.week2.day05;

public class EacDigitFromNumber {
    public static void main(String[] args) {

        int number=325345;
        while(number!=0){
            System.out.println(number % 10);
            number=number/10;
        }
    }
}

