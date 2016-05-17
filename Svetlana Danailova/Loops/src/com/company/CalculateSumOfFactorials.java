package com.company;


import java.util.Scanner;

public class CalculateSumOfFactorials {
    public static void main(String[] args) {
        System.out.println("Enter two whole numbers n and x:");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int x = scan.nextInt();
        //double factor = 1e5; // = 1 * 10^5 = 100000.
        //double result = Math.round(x * factor) / factor;

        int Factorial = 1;
        double sum = 1;
        for (int i = 1; i <=n; i++)
        {
            Factorial *= i;
            sum+=(Factorial/Math.pow(x,i ));
        }
        System.out.println(sum);


    }
}
