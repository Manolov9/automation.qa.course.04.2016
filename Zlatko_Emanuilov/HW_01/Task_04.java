package HW_01;

import java.io.IOException;

/**
 Task_04 Declare Variables
 *	Declare five variables choosing for each of them the most appropriate of the types
 `byte, sbyte, short, ushort, int, uint, long, ulong`
 to represent the following values: `52130, -115, 4825932, 97, -10000`.
 *	Choose a large enough type for each number to ensure it will fit in it.
 Try to compile the code.

 */
public class Task_04 {

    public static void main (String[] args) throws IOException {

        byte a = -115; // -128 - +127
        byte b = 97;
        short c = 87; // -32 768 - +32 767
        short d = -10000;
        int e = 52130;  // -2 147 483 648 - +2 147 483 647
        int f = 4825932;
        long g = -9223372036854775808L; // -9 223 372 036 854 775 808 - +9 223 372 036 854 775 807


        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);


    }



}
