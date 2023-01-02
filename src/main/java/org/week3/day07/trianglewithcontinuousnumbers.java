package org.week3.day07;

public class trianglewithcontinuousnumbers {
    public static void main( String[]args ){
        /**
         * print floyd`s triangle
         */
        int num3=1;
        for(int i=1 ; i<=6; ++i) {
            for (int j=1; j<=i ; ++j){
                System.out.print( num3+" ");
                num3++;
            }
            System.out.println();
        }
    }
}
