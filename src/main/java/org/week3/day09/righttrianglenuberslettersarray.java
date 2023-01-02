package org.week3.day09;

public class righttrianglenuberslettersarray {
    /**
     * Example 2:
     *
     *     Create a program that displays a right triangle with contents of an array
     *
     *     Input{1,2,3,4}
     *     Output:
     *             1
     *             12
     *             123
     *             1234
     *     Input{A,B,C,D}
     *     Output
     *             A
     *             AB
     *             ABC
     *             ABCD
     */
    public static void main(String[] args) {


        int numbers[]={1,2,3,4};
        for (int i = 0; i < numbers.length; i++){
            for (int j = 0; j <= i; j++){
                System.out.print(numbers[j]);
            }
            System.out.println(); // making new line
        }
        System.out.println("--------------------------");
        String letters[]={"A","B","C","D"};
        for (int i = 0; i < letters.length; i++){
            for (int j = 0; j <= i; j++){
                System.out.print(letters[j]);
            }
            System.out.println(); // making new line
        }
    }
}