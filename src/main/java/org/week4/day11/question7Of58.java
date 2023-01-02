package org.week4.day11;

public class question7Of58 {
    public static void main(String[] args) {
        /**
         * 7- Define a method to find out if number is prime or not.
         */
        int num = 3;
        int count = 0;
        if (num > 1) {
            for (int i = 1; i <= num; i++) {
                if (num % i == 0)
                    count++;
            }
            if (count == 2) {
                System.out.println(num + " is prime number");
            } else {
                System.out.println(num + " is not a prime number");
            }
        }

    }
}
