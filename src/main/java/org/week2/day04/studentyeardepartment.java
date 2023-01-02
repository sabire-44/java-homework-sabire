package org.week2.day04;

public class studentyeardepartment {
    public static void main(String[] args) {

    /**
     * homework-4
     * declare variable year and department
     * years should be 1,2,3,4
     * deparments Computer and Machine Learning
     * Use the first if statement to check the department of the student.
     * Use the inner if statement to check in which year the student is.
     * Display the result.
     * i.e;
     * The student is in the Computer Science department
     * The student is in 2nd year
     */



    String departmentName ="computer";
    int year= 1;

     if(year>0 && year<5){
        System.out.println("the student is in " +departmentName+ " department");
        System.out.println("the student  is in year " +year);
    }  else if(year<0 && year>4) {
        System.out.println("Enter the  proper year of the student again");
    }
}
}
