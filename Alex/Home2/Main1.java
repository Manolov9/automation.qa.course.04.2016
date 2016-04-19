package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int till = 0;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int n = in.nextInt();

        if (n >=0 ) {

            while (till <= n) {

                System.out.print(till+" ");
                till++;
            }


        }

        else {
            System.out.println("Vuvel si gre6no 4islo bokliK :)");
        }






	// write your code here
    }
}
