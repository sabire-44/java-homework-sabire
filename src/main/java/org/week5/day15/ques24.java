package org.week5.day15;

public class ques24 {
    public ques24(){
        System.out.print("A ");
    }
}
class B extends ques24{
    public B (){        //linen1
        System.out.print("B ");
    }
}
class C extends B{
    public C(){         //lin n2
        System.out.print("C ");
    }

    public static void main(String[] args) {
        C c = new C();
    }
}
// C. A B C