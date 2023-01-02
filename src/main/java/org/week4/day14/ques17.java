package org.week4.day14;

public class ques17 {
    int x,y;
    public ques17(int x, int y) {
        initialize(x,y);
    }
    public void initialize (int x ,int y) {
        this.x = x*x;
        this.y = y*y;
    }
    public static void main(String[] args ){
        int x=3,y=5;
        ques17 obj = new ques17(x,y);
        System.out.println(x+ " "+y);
    }
}
// B. 3 5
