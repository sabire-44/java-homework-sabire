package org.week5.day16;

public class ques36 {
    public static void main(String[] args ){
        String[] arr={"A","B","C","D"};
        for (int i=0; i< arr.length;i++){
            System.out.print(arr[i]+" ");
            if(arr[i].equals("C")){
                continue;
            }
            System.out.println("Work done");
            break;
        }
    }
}
//  C. A Work done