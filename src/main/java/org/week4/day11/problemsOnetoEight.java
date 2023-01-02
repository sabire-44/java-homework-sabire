package org.week4.day11;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class problemsOnetoEight {
    /**
     * 1. write a method that can convert km to miles
     *      *             1 km = 0.612 miles
     */
    /* double Q1(double km) {
        //write a method that can convert km to miles
           // 1 km = 0.612 miles
        return 0.612 * km;
} */
        private static Scanner sc;

        public static void main(String[] args) {

            sc= new Scanner(System.in);

            System.out.print("Please Enter the Kilometers =  ");
            double kilometer = sc.nextDouble();

            double mile = kilometer * 0.621371;

            System.out.println("Distance in KiloMeters = " + kilometer + " KiloMeters");
            System.out.println("Distance in Miles      = " + mile + " Miles");

/**
 *  2. write a method that can convert gallons to litters
 *      *             1 G = 3.75 L
 */

        double gallons;		//holds gallons
        double liters;		//holds liters

        gallons = 10;	//gallons

        liters = gallons *3.7854; // conversion to liters

        System.out.println(gallons + " gallons is " + liters + " liters.");
// double Q2(double G) {
//        /*write a method that can convert gallons to litters
//            1 G = 3.75 L*/
//        return G * 3.75;
//    }

/**
 *  * 3. write a method that can print out the array in Descending order
 */
            // Initializing the array
            Integer array[] = { 1, 2, 3, 4, 5 };

            // Sorting the array in descending order
            Arrays.sort(array, Collections.reverseOrder());

            // Printing the elements
            System.out.println(Arrays.toString(array));
/**
 * import java.util.*;
 *
 * class GFG {
 *     public static void main(String[] args)
 *     {
 *
 *         // Initializing the array
 *         int array[] = { 1, 2, 3, 4, 5, 6 };
 *
 *         // Sorting the array in ascending order
 *         Arrays.sort(array);
 *
 *         // Reversing the array
 *         reverse(array);
 *
 *         // Printing the elements
 *         System.out.println(Arrays.toString(array));
 *     }
 *
 *     public static void reverse(int[] array)
 *     {
 *
 *         // Length of the array
 *         int n = array.length;
 *
 *         // Swapping the first half elements with last half
 *         // elements
 *         for (int i = 0; i < n / 2; i++) {
 *
 *             // Storing the first half elements temporarily
 *             int temp = array[i];
 *
 *             // Assigning the first half to the last half
 *             array[i] = array[n - i - 1];
 *
 *             // Assigning the last half to the first half
 *             array[n - i - 1] = temp;
 *         }
 *     }
 * }
 */
//  public void Q3() {
//        int[] Q3Array = {1, 3, 5, 7, 9, 2, 4, 6, 8, 0};
//        Arrays.sort(Q3Array);
//        int[] ReverseArray = new int[Q3Array.length];
//        int j = Q3Array.length - 1;
//        for (int i : Q3Array) {
//            ReverseArray[j] = i;
//            j--;
//        }
//        System.out.println(Arrays.toString(ReverseArray));
//    }
/**
 *  * 4. write a method that accepts 3 parameters: 2 numbers and one operator,
 *      *     and prints out the calculation
 *      * 		if operator is not between [-, +, *, /, %] output should be Invalid Operator
 *      *     Ex: calculate(10, 2, "*") ==> 20;
 *      take input numbers and operator from user
 *      take result variable and initialize to 0
 *      switch based on operator
 */
            Scanner in = new Scanner(System.in);
            double number1 = sc.nextDouble();
            char operator = sc.next().charAt(0);
            double number2 = sc.nextDouble();
            double result = 0.0;
            switch(operator){
                case '+' :
                    result = number1 + number2;
                    System.out.println(result);
                    break;
                case '-' :
                    result = number1 - number2;
                    System.out.println(result);
                    break;
                case '*' :
                    result = number1 * number2;
                    System.out.println(result);
                    break;
                case '/' :
                    result = number1 / number2;
                    System.out.println(result);
                    break;
                case '%' :
                    result = number1 % number2;
                    System.out.println(result);
                    break;
                default :
            }
            // void Q4() {
            //        /*write a method that accepts 3 parameters: 2 numbers and one operator,
            //	 	and prints out the calculation
            //		if operator is not between [-, +, *, /, %] output should be Invalid Operator
            //		Ex: calculate(10, 2, "*") ==> 20;*/
            //        Scanner scanner = new Scanner(System.in);
            //        System.out.println("PLS enter your first parameter :");
            //        int a = scanner.nextInt();
            //        System.out.println("PLS enter your second parameter :");
            //        int b = scanner.nextInt();
            //        System.out.println("PLS put your operator :");
            //        String op = scanner.next();
            //        /*if (!(op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/") || op.equals("%"))) {
            //            System.out.println("PLS PUT APPROPRIATE OPERATOR");
            //        }*/
            //        switch (op) {
            //            case "+" -> System.out.println("The result is " + (a + b));
            //            case "-" -> System.out.println("The result is " + (a - b));
            //            case "*" -> System.out.println("The result is " + (a * b));
            //            case "/" -> System.out.println("The result is " + (a / b));
            //            case "%" -> System.out.println("The result is " + (a % b));
            //            default -> System.out.println("\\\\ CHANGE OPERATOR //");
            //        }
            //        scanner.close();
            //    }
/**
 * 5. write a method that can calculate grade
 * 			if score is 100 ~ 90 ==> A
 * 			if score is 89 ~ 80 ==> B
 * 			if score is 79 ~ 70 ==> C
 * 			if score is 69 ~ 60 ==> D
 * 			if score is 0 ~ 59 ==> F
 * 			otherwise ==> Invalid Score
 */
            Scanner sc = new Scanner(System.in);
            System.out.println(" Enter the mark obtained");
            int mark = sc.nextInt();
            if (mark<=100 && mark>89) {
                System.out.println("GRADE:A");
            } else if(mark<90 && mark>=80) {
                System.out.println("GRADE :B");
            }else if(mark<80 && mark>=70) {
                System.out.println("GRADE :C");
            }else if(mark<70 && mark>=60) {
                System.out.println("GRADE :D");
            }else if(mark<60 && mark>=0) {
                System.out.println("GRADE :F");
            }else System.out.println("Invalid Score");
            // void Q5(int score) {
            //        /*write a method that can calculate grade
            //			if score is 100 ~ 90 ==> A
            //			if score is 89 ~ 80 ==> B
            //			if score is 79 ~ 70 ==> C
            //			if score is 69 ~ 60 ==> D
            //			if score is 0 ~ 59 ==> F
            //			otherwise ==> Invalid Score*/
            //
            //        if (score >= 90 && score <= 100) System.out.println(score + " YOUR GRADE IS A");
            //        else if (score >= 80 && score <= 89) System.out.println(score + " YOUR GRADE IS B");
            //        else if (score >= 70 && score <= 79) System.out.println(score + " YOUR GRADE IS C");
            //        else if (score >= 60 && score <= 69) System.out.println(score + " YOUR GRADE IS D");
            //        else if (score >= 0 && score <= 59) System.out.println(score + " YOUR GRADE IS F");
            //        else System.out.println("INVALID SCORE !");
            //    }
/**
 *  *6. Write a Java method to multiply corresponding elements of two arrays of integers.
 *      * Sample input:
 *      * Array1: [1, 3, -5, 4]
 *      * Array2: [1, 4, -5, -2]
 *      *
 */

                    int a1[]={4,3,2,5};
                    int a2[]={1,7,8,9};
                    System.out.print(" The first array is: ");
                    for(int i=0;i < a1.length;i++)
                    System.out.print(a1[i]+", ");
                    System.out.println();

                    System.out.print(" The Second array is: ");
                    for(int i=0;i < a1.length;i++)
                    System.out.print(a2[i]+", ");
                    System.out.println();

                    System.out.print("The result of mult is:");
                    for(int i=0;i<a1.length; i++)
                    System.out.print(a1[i]*a2[i]+", ");

                    System.out.println();
                    //   void Q6() {
            //        /*Write a Java method to multiply corresponding elements of two arrays of integers.
            //        Sample input:
            //        Array1: [1, 3, -5, 4]
            //        Array2: [1, 4, -5, -2]  */
            //        int[] Q6Array1 = {1, 3, -5, 4};
            //        int[] Q6Array2 = {2, 4, -5, -2};
            //        for (int i : Q6Array1) {
            //            for (int j : Q6Array2) {
            //                System.out.print(i + "*" + j + "=" + i * j + "\t ");
            //            }
            //            System.out.println();
            //        }
            //    }
            //    void Q7(int n){
            //        while (n != 1) {
            //            if (n % 2 == 0) {
            //                n = n / 2;
            //                System.out.println(n);
            //            } else {
            //                n = (n * 3 + 1) / 2;
            //                System.out.println(n);
            //            }
            //        }
/**
 * 7. Write a Java program start with an integer n, divide n by 2 if n is even
 * or multiply by 3 and add 1 if n is odd, repeat the process until n = 1.
 */

int n=25;
while ( n!=1 ) {
    if( n%2 == 0){
        n = n/2;
    } else{
        n=( n*3 + 1 ) / 2;
    }
}
if (n % 2 == 1) {
    while (n>0) {
        n=3*n+1;
        System.out.println(n);
        if ( n%2 == 0 ) {
            while (n>0) {
                n = n / 2;
                System.out.println(n);
            }
        }

    }
}
//    /*void Q7(int n) {
//        if (n % 2 == 0) {
//            while (n > 0) {
//                n /= 2;
//                System.out.println(n);
//            }
//        }
//        if (n % 2 == 1) {
//            while (n > 1) {
//                n = (3 * n + 1);
//                System.out.println(n);
//                if (n % 2 == 0) {
//                    while (n > 0) {
//                        n /= 2;
//                        System.out.println(n);
//                    }
//                }
//            }
//        }
//    }*/

            // void Q7(int n){
            //        while (n != 1) {
            //            if (n % 2 == 0) {
            //                n = n / 2;
            //                System.out.println(n);
            //            } else {
            //                n = (n * 3 + 1) / 2;
            //                System.out.println(n);
            //            }
            //        }
/**
 *   8. Write a Java program to check if a number is Armstrong's number or not?
 *   (input 153 output true,  123 output false)
 */
            int y = 1634;
            int temp = y;
            int total = 0;
            String number = Integer.toString(y);
            int length = number.length();
            for (int i=0; i<length; i++){
                int results = temp % 10;
                total= (int) (total+Math.pow(results, length));
                temp = temp / 10;
            }
            if (total==y) {
                System.out.println(true);
            }else {
                System.out.println(false);
            }
                }
    }

// void Q8(int number){
//        /*Write a Java program to check if a number is Armstrong's number or not? */
//        int temp,remainder,n=0;
//        temp=number;
//        double result=0;
//        while(temp !=0){ temp/=10;
//            n++;}
//            temp=number;
//        while(temp >0){
//            remainder=temp%10;
//            result += Math.pow(remainder,n);
//            temp/=10;
//           }
//        if(result==number){
//            System.out.println("Armstrong Number :"+number);
//            }else {
//            System.out.println("Number: "+number+" is not Armstrong.");
//        }
//        }
//
//}