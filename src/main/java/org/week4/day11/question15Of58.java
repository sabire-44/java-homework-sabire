package org.week4.day11;

public class question15Of58 {
    public static void main(String[] args) {
        /** 15- Given 2 int values, return true if one is negative and one is positive.
         *  Except if the parameter "negative" is true,
         *  then return true only if both are negative.          *
         * posNeg(1, -1, false) → true
         * posNeg(-1, 1, false) → true
         * posNeg(-4, -5, true) → true
         */
        //public boolean posNeg(int a, int b, boolean negative) {
        //   if (negative && a < 0 && b < 0)
        //   return true;
        //else if (!negative && a < 0 && b > 0)
        //    return true;
        //else if (!negative && a > 0 && b < 0)
        //  return true;
        //else
        // return false;
        //OR
        // public boolean posNeg(int a, int b, boolean negative) {
        // return (negative && a < 0 && b < 0)
        // || (!negative && a < 0 && b > 0)
        // || (!negative && a > 0 && b < 0);
        // }

        /*
         boolean Q15(int a, int b, boolean c) {
         if (a > 0 & b < 0) return true;
        else if (a < 0 & b > 0) return true;
        else if (a < 0 & b < 0 & c == true) return true;
        else return false;
    }
         */
    }
}