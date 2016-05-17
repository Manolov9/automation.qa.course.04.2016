package com.company;

import java.util.Scanner;

public class NumbersFrom1ToN {

    public static void main(String[] args) {
        System.out.println("Enter a positive number: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int i;

                   for (i = 1; i<=n; i++)
            {


                System.out.print(i + " ");

            }

    }
}
