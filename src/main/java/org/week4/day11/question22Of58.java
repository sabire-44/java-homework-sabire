package org.week4.day11;

public class question22Of58 {
    public static void main(String[] args) {
        /** 22- Given 2 int values, return whichever value is nearest to the value 10,
         *  or return 0 in the event of a tie. Note that Math.abs(n) returns
         *  the absolute value of a number.
         *
         * close10(8, 13) → 8
         * close10(13, 8) → 8
         * close10(13, 7) → 0
         */
        /* public int close10(int a, int b) {
  int diffa = Math.abs(a - 10);
  int diffb = Math.abs(b - 10);

  if (diffa < diffb) {
    return a;
  }
  if (diffb < diffa) {
    return b;
  }
  return 0;
}

public int close10(int a, int b) {
  int temp1 = Math.abs(a - 10);
  int temp2 = Math.abs(b - 10);
  if (temp1 == temp2)
    return 0;
  else if (temp1 > temp2)
    return b;
  else
    return a;
}
*/


    }
}
