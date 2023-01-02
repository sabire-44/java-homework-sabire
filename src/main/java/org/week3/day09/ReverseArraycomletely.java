package org.week3.day09;

public class ReverseArraycomletely {
    /**
     *  Example 5:
     *
     *     Create a program that reverses an array in place
     *     Modify the contents of the inputted array
     *
     *     Input:{1,2,3,4,5}
     *     Output:{5,4,3,2,1}
     */
    static void reverse(int a[], int n)
    {
        int[] b = new int[n];
        int j = n;
        for (int i = 0; i < n; i++) {
            b[j - 1] = a[i];
            j = j - 1;
        }

        // printing the reversed array
        System.out.println("Reversed array is: \n");
        for (int k = 0; k < n; k++) {
            System.out.print(b[k] +" ");
        }
    }

    public static void main(String[] args)
    {
        int [] arr = {1, 2, 3, 4, 5};
        reverse(arr, arr.length);
    }
}
