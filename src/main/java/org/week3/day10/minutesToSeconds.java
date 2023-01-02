package org.week3.day10;

import java.util.Scanner;

public class minutesToSeconds {
    /**
     * public static void main(String[] args)
     *     {
     *         int min,sec;
     *         Scanner sc=new Scanner(System.in);
     *         System.out.println("Enter Minutes");
     *         min=sc.nextInt();
     *         sec=min*60;
     *         System.out.println("Seconds: "+sec);
     *     }
      *
     */
    int sec;
    void seconds(int m)
    {
        sec=m*60;
    }
    public static void main(String[] arg)
    {
        int min;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Minutes");
        min=sc.nextInt();
        minutesToSeconds res=new minutesToSeconds();
        res.seconds(min);
        System.out.println("Seconds: "+res.sec);
    }
}
