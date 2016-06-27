package HW_01;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.omg.CORBA.portable.ValueOutputStream;

import java.io.IOException;
import java.util.Scanner;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;

/**

 Task_03 Sum Two Numbers
 Write a program SumTwoNumbers.java that enters two integers from the console, calculates and prints their sum.
 Search in Internet to learn how to read numbers from the console. Examples:

    https://docs.oracle.com/javase/7/docs/api/java/util/Scanner.html
    http://www.tutorialspoint.com/java/util/java_util_scanner.htm2

 */
public class Task_03 {

    public static void main(String[] args) throws IOException {

        System.out.println ("--------------- Task 03 ------------------");

        Scanner sc = new Scanner(System.in);

                    System.out.print ("a =>");
        int a = sc.nextInt();

                    System.out.print ("b =>");

        int b = sc.nextInt();

                    System.out.println(a+b);

        System.out.println ("--------------- Task 03a ------------------");

        Scanner sca = new Scanner(System.in);

        String c = sca.nextLine();

        System.out.println(c);

    }


}
