package HW_01;

import java.io.IOException;

/**
 Task_06 Variable in Hexadecimal Format
 *	Declare an integer variable and assign it with the value `254` in hexadecimal format (`0x##`).
 *	Use Windows Calculator to find its hexadecimal representation.
 *	Print the variable and ensure that the result is `254`.
 */
public class Task_06 {

    public static void main (String[] args) throws IOException {

        String a = Integer.toHexString(1254);
        System.out.println(a);

    }


}
