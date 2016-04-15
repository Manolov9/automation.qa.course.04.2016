package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int till = 0;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int n = in.nextInt();

        if (n >= 0) {

            for (int y = 1; y <= n; y++) {
                if (!(y % 3 == 0) && !(y % 7 == 0)) {

                    System.out.println(y);

                }


            }
        } else {
            System.out.println("Vuvel si gre6no 4islo bokliK :)");
        }


    }
}


        // write your code here


