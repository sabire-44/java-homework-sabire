package org.week2.day04;

public class midtermfinal {
    public static void main(String[] args) {
        double mtExam;
        int midterm = 100;
        int finalExam = 70;
        mtExam = (midterm * 0.4) + (finalExam * 0.6);
        if (mtExam >= 70 && mtExam <= 100) {
            System.out.println("Passed");
        } else if (mtExam >= 0 && mtExam < 70) {
            System.out.println("Failed");
        } else {
            System.out.println(" Write Correct exam result");
        }

    }
}
