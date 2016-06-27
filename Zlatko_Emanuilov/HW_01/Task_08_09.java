package HW_01;

import java.io.IOException;
import java.io.PushbackInputStream;
import java.security.PublicKey;

/**
 Task_08 Boolean Variable
 *	Declare a Boolean variable called `isFemale` and assign an appropriate value corresponding to your gender.
 *	Print it on the console.

 Task_09 Strings and Objects
 *	Declare two string variables and assign them with `Hello` and `World`.
 *	Declare an object variable and assign it with the concatenation of the first two variables (mind adding an interval between).
 *	Declare a third string variable and initialize it with the value of the object variable (you should perform type casting).
 */

public class Task_08_09 {


    public static void main (String[] args) throws IOException {
    // Task_08

        boolean isFemale = false;
        System.out.println("isFemale? = " + isFemale);

    // Task_09

        String a = "Hello ";
        String b = "World";

        System.out.println(a+b);

        //public string  HW = a+b;




    }



}
