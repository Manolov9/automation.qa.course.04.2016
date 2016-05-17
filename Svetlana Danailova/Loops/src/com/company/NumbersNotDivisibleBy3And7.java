package com.company;


import java.util.Scanner;

public class NumbersNotDivisibleBy3And7 {
    public static void main(String[] args) {
        System.out.println("Enter a positive number: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int i;

        for (i = 1; i <=n; i++)
        {
            if (i%3!= 0 && i%7!=0)
            {
                System.out.print(i + " ");

            }
        }
    }
}
