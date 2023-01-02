package org.week4.day13;

public class ques1 {
    public static void main (String [] args) {
        int x = 1;
        int y = 1;
        if (x++ < ++y) {
            System.out.println("Hello ");
        } else {
            System.out.println("Welcome ");
        }
        System.out.println("Log " + x + ":" + y);
    }
}

/*
The result is
A. Hello
Log 2:2
 */
