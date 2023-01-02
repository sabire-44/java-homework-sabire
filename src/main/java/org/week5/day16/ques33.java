package org.week5.day16;

public class ques33 {
    String name ;
    boolean contract;
    double salary;
    ques33 (){
        //line n1
       // this.name = "Joe";
       // this.contract = new Boolean(true) ;
       // this.salary = new Double (100);
    }
    public String toString(){
        return name + ":"+contract+":"+salary;
    }

    public static void main(String[] args) {
        ques33 e = new ques33();
        //line n2
       // e.name = "Joe";
       // e.contract = true;
       // e.salary = 100;
        System.out.print(e);
    }
}
/*  A) Replace line n2 with:
       e.name = "Joe";
       e.contract = true;
       e.salary = 100;
    C) Replace line n1 with :
        this.name = "Joe";
        this.contract = new Boolean(true) ;
        this.salary = new Double (100);
 */
