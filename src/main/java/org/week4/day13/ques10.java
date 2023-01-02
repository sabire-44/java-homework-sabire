package org.week4.day13;

public class ques10 {
    public static void main (String[] args) {
        int var1 = 200;
        System.out.println(doCalc(var1));
        System.out.print(" "+var1);
    }
    static int doCalc(int var1){
        var1 = var1 * 2;
        return var1;
    }
}

/*
the result is
A. 400 200
 */
