package org.week3.day08;

public class nestedforloop {
    public static void main(String []args){
        int weeks=3;
        int days=7;
        for(int i = 1; i<= weeks; i++) {
            System.out.println("week: " + i);
            for(int j = 1; j<= days ; ++j) {
                System.out.println("day: " + j);
            }
        }
    }
}
