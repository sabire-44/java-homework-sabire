package org.week4.day11;

public class question23Of58 {
    public static void main(String[] args) {
/** 23- Given 2 int values, return true if they are both in the range 30..40 inclusive,
 *  or they are both in the range 40..50 inclusive.
 *
 * in3050(30, 31) → true
 * in3050(30, 41) → false
 * in3050(40, 50) → true
 */
        /*
        public boolean in3050(int a, int b) {
  if ((a >= 30 && a <= 40) && (b >= 30 && b <= 40)) {
    return true;
  } else if ((a >= 40 && a <= 50) && (b >= 40 && b <= 50)) {
    return true;
  } else {
    return false;
    }
} */
        /**
         * Given 2 positive int values, return the larger value that is in the range 10..20
         * inclusive, or return 0 if neither is in that range.
         *
         * max1020(11, 19) → 19
         * max1020(19, 11) → 19
         * max1020(11, 9) → 11
         */
        /*
        public int max1020(int a, int b) {
  int tempa;
  int tempb;
  if (a >= 10 && a <= 20)
    tempa = a;
  else
    tempa = 0;
  if (b >= 10 && b <= 20)
    tempb = b;
  else
    tempb = 0;
  return Math.max(tempa, tempb);
} */
//if (a >= 10 && a <= 20 && b >= 10 && b <= 20){
//if (a > b) return a; return b;
//}
//else if (a >= 10 && a <= 20) return a;
//else if (b >= 10 && b <= 20) return b;
//return 0;

    }
}
