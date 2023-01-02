package org.week2.day06;
import java.util.Scanner;
public class ArmstrongNumberUserInput {
        public static void main(String[] args) {
            Scanner obj=new Scanner(System.in);
            System.out.println("Enter an integer number: ");
            int y=obj.nextInt();
            int temp=y;
            int total=0;
            String number= Integer.toString(y);
            int length = number.length();
            for (int i=0; i<length; i++){
                int result = temp % 10;
                total= (int) (total+Math.pow(result, length));
                temp=temp/10;
            }
            if (total==y) {
                System.out.println(true);
            }else {
                System.out.println(false);
            }
        }
    }

