package org.week3.day07;

public class trianglewithabcde {
    public static void main(String[] args) {
        /**
         * Example 3: Program to print half pyramid using alphabets
         * A
         * B B
         * C C C
         * D D D D
         * E E E E E
         */
        char last='E';
        char first='A';
        for(int i=1; i<=(last-'A'+1);++i) {
            for(int j=1; j<=i; ++j){
                System.out.print(first+" ");
            }
            first++;
            System.out.println();
        }



    }
}
