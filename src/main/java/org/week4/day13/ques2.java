package org.week4.day13;

public class ques2 {
    public static void main (String [] args) {
        int i = 10;
        int j = 20;
        int k = (j += i) / 5;
        System.out.println(i + " : " + j + " : " + k);
    }
}
/*
The result is
A. 10 : 30 : 6
 */