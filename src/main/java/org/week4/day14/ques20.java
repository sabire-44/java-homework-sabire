package org.week4.day14;

public class ques20 {
    int a1;
    public static void doProduct(int a){
        a = a*a;
    }
    public static void doString(String s){
        s.concat(" "+s);
    }

    public static void main(String[] args) {
        ques20 item = new ques20();
        item.a1=11;
        String sb ="Hello";
        Integer i=10;
        doProduct(i);
        doString(sb);
        doProduct(item.a1);
        System.out.println(i+" "+sb+" "+ item.a1);
    }
}
// E. 10 Hello 11