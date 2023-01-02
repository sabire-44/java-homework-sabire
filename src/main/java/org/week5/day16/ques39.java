package org.week5.day16;

public class ques39 {
    String type ="Canine";
    int maxSpeed = 60;
    ques39(){}
    ques39(String type, int maxSpeed){
        this.type=type;
        this.maxSpeed=maxSpeed;
    }
}
class WildAnimal extends ques39{
    String bounds ;
    WildAnimal (String bounds){
     super ();// line n1
     this.bounds = bounds; // line n1
    }
    WildAnimal(String type, int maxSpeed,String bounds){
     super (type ,maxSpeed);   //line n2
      this.bounds = bounds;  //line n2
    }

    public static void main(String[] args) {
        WildAnimal wolf = new WildAnimal("Long");
        WildAnimal tiger = new WildAnimal("Feline",80,"short");
        System.out.println(wolf.type+" "+wolf.maxSpeed+" "+wolf.bounds);
        System.out.println(tiger.type+" "+tiger.maxSpeed+" "+tiger.bounds);
    }  //       Answer ===> A) E)
}
/* A. Replace line n1 with:
     super ();
     this.bounds = bounds;
E. Replace line n2 with:
    super (type ,maxSpeed);
    this.bounds = bounds;
    output: Canine 60 Long
            Feline 80 Short
 */
