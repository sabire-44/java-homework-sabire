package org.week4.day11;

public class question43Of58 {
    public static void main(String[] args) {
        /** 43- Given an int array, return a new array with double the length where
         * its last element is the same as the original array, and all the other elements are 0.
         * The original array will be length 1 or more. Note: by default,
         * a new int array contains all 0's.
         *
         * makeLast([4, 5, 6]) → [0, 0, 0, 0, 0, 6]
         * makeLast([1, 2]) → [0, 0, 0, 2]
         * makeLast([3]) → [0, 3]
         */
/*
public static void main(String[] args) {
        int [] a ={2,2,4};
        int [] nums ={3,3,4,5,6};
public int[] makeLast(int[] nums) {
  int[] num = new int[nums.length*2];
  num[nums.length*2 - 1] = nums[nums.length -1];
  return num;
  for(int i=0;i<num.length-1;i++) {
  num[i]=0;
 }
}
 */

        // int [] Q43 (int []a){
        //        int[] b =new int[a.length*2];
        //        b[b.length-1]=a[a.length-1];
        //        return b;
        //    }
    }
}
