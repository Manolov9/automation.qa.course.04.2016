package com.company;


import java.util.Scanner;

public class CompareArrays {
    public static void main(String[] args) {
        System.out.println("Enter first array length: ");
        Scanner scan = new Scanner(System.in);
        int length1 = scan.nextInt();
        int[] array1 = new int[length1];

        for (int index =0; index < length1; index++)
        {
            System.out.println("Enter array1: " + array1[index]);
            array1[index] = scan.nextInt();


        }
    }
}
