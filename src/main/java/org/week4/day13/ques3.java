package org.week4.day13;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class ques3 {
    public static void main (String [] args) {
        String date = LocalDate.parse("2014-05-04").format (DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(date);
    }
}
/*
the result is
D. An exception is thrown at runtime
 */
