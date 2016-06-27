package HW_01;

import java.io.IOException;
import java.util.FormatFlagsConversionMismatchException;

// Task_07 Unicode Character
// Declare a character variable and assign it with the symbol that has Unicode code `42` (decimal)
// using the \u0042 syntax, and then print it.
// Hint: first, use the Windows Calculator to find the hexadecimal representation of `42`.
// The output should be `*`.
// =====================================================================================================
// Escape Sequence	Description
// \t	Inserts a tab in the text at this point.
// \b	Inserts a backspace in the text at this point.
// \n	Inserts a newline in the text at this point.
// \r	Inserts a carriage return in the text at this point.
// \f	Inserts a form feed in the text at this point.
// \'	Inserts a single quote character in the text at this point.
// \"	Inserts a double quote character in the text at this point.
// \\	Inserts a backslash character in the text at this point.


public class Task_07 {

    public static void main (String[] args) throws IOException {


        String a = "00" +  Integer.toHexString(42);
        System.out.println("a = " + a);

        int b = Integer.parseInt(a, 16);

        System.out.println((char) b);

        int c = 0;
        for (int i=0x0000;i<=0x257F;i++)
        {
          //  System.out.printf("0x%x : %c\n",i,(char)i);

            System.out.print((char)i + ", ");

            if(c<32) {
            c=c+1;
        }
            else {
            c=0;
                System.out.println();
                System.out.printf("0x%x : %c\n",i,(char)i);

        }
        }

     //  System.out.println(b);
    }

}
