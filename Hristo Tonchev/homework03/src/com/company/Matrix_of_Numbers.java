package com.company;

import java.util.Scanner;

/**
 * Created by Ico on 4/15/2016.
 */
public class Matrix_of_Numbers {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        int input = 0;

        do {
            System.out.println("Please enter a number between 1 and 20.");
            input = in.nextInt();
        } while ((input <= 1) || (input >= 20));

        printMatrix(input);
    }

    private static void printMatrix(int input) {
        for (int i = 0; i < input; i++) {
            for (int j = i + 1; j < input + i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}