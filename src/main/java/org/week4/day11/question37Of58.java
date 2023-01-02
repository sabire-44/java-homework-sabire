package org.week4.day11;

public class question37Of58 {
    public static void main(String[] args) {
        /** 37- Given an array of ints length 3, figure out which is larger,
         * the first or last element in the array, and set all the other elements to be
         * that value. Return the changed array.
         *
         * maxEnd3([1, 2, 3]) → [3, 3, 3]
         * maxEnd3([11, 5, 9]) → [11, 11, 11]
         * maxEnd3([2, 11, 3]) → [3, 3, 3]
         */
        /*
        public static void main(String[] args) {
        int [] a ={2,2,4};
        int [] nums ={3,3,6};
        public int[] maxEnd3(int[] nums) {
  if (nums[0] >= nums[nums.length-1]) {
  nums[0] = nums[0];
  nums[1] = nums[0];
  nums[2] = nums[0];
  }
  else if (nums[0] <= nums[nums.length-1]) {
  nums[0] = nums[nums.length-1];
  nums[1] = nums[nums.length-1];
  nums[2] = nums[nums.length-1];
  }
  return new int[] { nums[0],nums[1],nums[2]};
}
}
        */

// int [] Q37 (int []a){
//        int i=Math.max(a[0],a[a.length-1]);
//        Arrays.fill(a, i);
//        return a;
//    }
    }
}
