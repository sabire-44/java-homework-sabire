package org.week3.day07;

public class fullpyramidstars {
    public static void main(String[] args) {
        /**
         * Program to print full pyramid using *
         * result should be like this;
         *         *
         *       * * *
         *     * * * * *
         *   * * * * * * *
         * * * * * * * * * *
         */
        int rows=5, k=0;
        for(int i=1; i<=rows; ++i, k=0) {
            for(int space=1; space<=rows-i; ++space) {
                System.out.print("  ");
            }
            while(k!=2*i-1) {
                System.out.print("* ");
                ++k;
            }
            System.out.println();
        }
    }
}
