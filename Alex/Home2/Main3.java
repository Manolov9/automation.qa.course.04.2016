package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        double sum = 0;
        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;

        // Creating array of grade values
        double[] grades = new double[5]; //{
               // 82, 70, 99, 90, 92, 75, 87, 85, 91, 110, 91, 87, 4
       // };

        for (int i = 0; i < grades.length; i++) {
            System.out.print("enter a number : ");
            grades[i]=in.nextDouble();
            sum += grades[i];
            if (min > grades[i]) {
                min = grades[i];
            }
            else if (max < grades[i]) {
                max = grades[i];
            }
        }


        double average = (double) sum / grades.length;

        System.out.print("\nMin:  " + min);
        System.out.print("\nMax:  " + max);
        System.out.print("\nSum:  " + sum);
        System.out.print("\nAverage:  " + average);


    }
}