package org.week4.day11;

public class question30Of58 {
    public static void main(String[] args) {
/** 30- Given an array of ints, return true if it contains a 2, 7, 1 pattern:
 * a value, followed by the value plus 5, followed by the value minus
 * 1. Additionally the 271 counts even if the "1" differs by 2 or less from the correct
 * value.
 * has271([1, 2, 7, 1]) → true
 * has271([1, 2, 8, 1]) → false
 * has271([2, 7, 1]) → true
 */
        /*
       public static void main(String[] args) {
        int [] nums={1,2,4,7};
        int [] a={1,2,3,7};
public boolean has271(int[] nums) {
  int len = nums.length;
  for (int i = 0; i < nums.length - 1; i++) {
    if (i+2 <= nums.length - 1){
      int j = Math.abs(nums[i] - 1);
      int k = Math.abs(j - nums[i+2]);
      if(nums[i+1] == nums[i]+5 && k <= 2)
        return true;
    }
  } return false;
}
         */

        //  boolean Q30 (int []a){
        //        for (int i=0;i<=a.length-1;i++){
        //            if(i+2<a.length&i+1<a.length){
        //            if (a[i + 1] == a[i] + 5) {
        //                    if (a[i + 2] == a[i] - 1 | a[i + 2] == a[i] - 2) {
        //                        return true;
        //                    }
        //                }
        //            }
        //        }
        //        return false;
        //    }
        //    }
    }
}
