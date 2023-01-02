package org.week5.day15;

public class ques21 {
    ques21(){
        System.out.println("Vehicle");
    }
}
class Bus extends ques21{
    Bus (){
        System.out.println("Bus");
    }
}
class Transport {
    public static void main(String[] args) {
        ques21 v= new Bus();
    }
}

// A. Vehicle Bus