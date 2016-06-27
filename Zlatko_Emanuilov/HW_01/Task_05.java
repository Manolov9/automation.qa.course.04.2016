package HW_01;

import java.io.IOException;

/**
 Task_05 Float or Double?
 *	Which of the following values can be assigned to a variable of type `float`
 *	and which to a variable of type `double`: `34.567839023, 12.345, 8923.1234857, 3456.091`?
 *	Write a program to assign the numbers in variables and print them to ensure no precision is lost.
 */
public class Task_05 {


    public static void main (String[] args) throws IOException {

        double a = 34.567839023;
        double b = 12.345;
        double c = 8923.1234857;
        double d = 3456.091;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

    }

}
