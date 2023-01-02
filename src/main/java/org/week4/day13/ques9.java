package org.week4.day13;

public class ques9 {
    public static void main(String [] args) {
    class CD {
  int r;
  CD (int r) {
      this.r=r;
  }
}
class DVD extends CD {
    int c;
    DVD (int r, int c) {
        // line n1
        super(r);
        this.c = c;
    }
}
DVD dvd = new DVD (10 , 20);
    }
}
/*
the answer is
C. Option C
 */