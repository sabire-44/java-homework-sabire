package org.week3.day09;

import java.util.Arrays;

public class functionscondsmallestitemarray {

/**
 * Example 1:
 *
 *     Create a function that finds the second smallest item in integer array;
 *
 *     Input{1903,1905,1907,1961,1999,2011,2023}
 *
 *     Output: 1905
 */
public static void main(String args[])
{
    int arr[]={1903,1905,1907,1961,1999,2011,2023};
    int n=arr.length;

    // sorting the array using
    // in-built sort function
    Arrays.sort(arr);

    // printing the desired element
    System.out.println("second smallest number is "+arr[1]);
}
}









