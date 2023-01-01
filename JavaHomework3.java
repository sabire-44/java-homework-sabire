package november24;

public class JavaHomework3 {
    public static void main(String[] args) {

        // q1
        // Fix the below issue
        int num1 = 1238;
        byte num2 = 12;
        int q1Total= num1 + num2;

        System.out.println("========================");
        System.out.println("Sum of num1 and num2 is:"+q1Total);
        // q2
        // Fix the below issue
        int q2Total;
        int num3 = 129, num4 = 1200;
        q2Total = num3 + num4;

        System.out.println("========================");
        System.out.println("Sum of num3 and num4 is:"+q2Total);

        //q3
        // Print the result of num3-num4
        double num5 = 129, num6 = 1200;
        int subt1=num3-num4;
        // Your code goes here

        System.out.println("========================");
        System.out.println("Subtraction of num3 and num4 is:"+subt1);

/*  NOTE:
    In Java, any number of underscore characters (_) can appear anywhere between digits in a numerical literal.
    e.g. 123_154_44_89_8_6969_ , e.g. $ 123_000_00
    This feature enables you, for example, to separate groups of digits in numeric literals,
    which can improve the readability of your code.
    For details:
    https://docs.oracle.com/javase/7/docs/technotes/guides/language/underscores-literals.html
*/

        // q4
        // Print the result of num5/num6 by using a variable. Define the type of the result
        int num7 = 7_963_965;
        double num8 = 140.25;
        double div1= num5 / num6;
        // Your code goes here

        System.out.println("========================");
        System.out.println("Division of num5 and num6 is:"+div1);
        //q5
/* Print the below string in your console
   2022Clarusway2022
*/
        byte num11 = 20;
        int num9 = 2021;
        byte num12 = 22;
        byte num10 = 1;
        String str = "Clarusway";
        //Your code here

        System.out.println("========================");
        System.out.println("2022"+str+"2022");

        //q6
/*
    Write some code that stores the length (8) and width (5) of a rectangle in variables.
    Create another variable that stores the area (calculated using the width and length).
    Create another variable that stores the perimeter (calculated using the width and length).
    Print the values of all four variables as shown.
    Length: 8
    Width: 5
    Area: 40
    Perimeter: 26
 */
        int length=8, width=5;
        int area=length*width;
        int perimeter=(2*length)+(2*width);
        System.out.println("========================");
        System.out.println("area of the rectangle:"+area+"perimeter of the rectangle:"+perimeter);

        //q7
        // Print first 4 and then 5 by using the only given unary operators,
        // You can change the unary operator places
        int i = 3;
        i++;
        ++i;
        // print 4 with below print statement
        System.out.println(--i);
        // print 5 with below print statement
        System.out.println(++i);

        System.out.println("========================");

        //q8
        // Print below boolean values by using the a and b variables with relational operators
        // True
        // False
        int a = 10;
        int b = a - 5;
        boolean result=true;
        if (b==5) {
            System.out.println("The result is"+result);
        } else {
            System.out.println("The result is"+!result);
        }
        System.out.println("========================");

        //q9
        //Print true by using either && or ||
        boolean q9 = 5 < 44;
        boolean q99 = false;
        boolean result1=true;
        if(result1==q99 && result1==q9) {
            System.out.println("the result is " + q9);
        } else System.out.println("the result is " + q99);
        System.out.println("========================");
        //q10
        // print 3 times True by using below values and relational operators > , != and <=
        int q10 = 13;
        int q11 = 34;
        int q12 = 100;
        int q13 = 33;
        int q14=length+width;
        if (q10<q11) System.out.println("true");
        if (q10!=q11) System.out.println("true");
        if (q10<=q14) System.out.println("true");
    }

}
