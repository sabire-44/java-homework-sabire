package org.week4.day14;

public class ques15 {
    public static void main(String[] args ){
        StringBuilder sb1 = new StringBuilder("Duke");
        String str1 = sb1.toString();
        String str2 = str1; // the code is inserted here
        System.out.print(str1 == str2);
    }
}
// A. String str2 = str1;