package org.week4.day11;

public class question52Of58 {
    public static void main(String[] args) {
        /** 52- Write a method that returns the sum of all even Fibonacci numbers.
         *  Consider all Fibonacci numbers that are less than or equal to n.
         * Each new element in the Fibonacci sequence is generated by adding
         * the previous two elements.
         * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
         */
        /*
import java.io.*;
class GFG
{
    static int evenFibSum(int limit)
    {
        if (limit < 2)
            return 0;
        // Initialize first two even Fibonacci numbers and their sum
        long ef1 = 0, ef2 = 2;
        long sum = ef1 + ef2;
        // calculating sum of even Fibonacci value
        while (ef2 <= limit)
        {
            // get next even value of Fibonacci sequence
            long ef3 = 4 * ef2 + ef1;
            // If we go beyond limit, we break loop
            if (ef3 > limit)
                break;
            // Move to next even number and update sum
            ef1 = ef2;
            ef2 = ef3;
            sum += ef2;
        }
        return(int) sum;
    } */


        //  int Q52(int n){
        //        int n1=0 ,n2=2;
        //        int sum =n1+n2;
        //        while(n2<=n){
        //            int n3=4*n2+n1;
        //            if(n3>n){
        //                break;
        //            }
        //            n1=n2;
        //            n2=n3;
        //            sum +=n2;
        //        }
        //        return sum;
        //    }
    }
}
