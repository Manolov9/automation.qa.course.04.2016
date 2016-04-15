package com.company;


import java.util.Scanner;

/**
 * Created by Ico on 4/13/2016.
 */
public class min_max_sum_avrage {

    public static void main(String[] args) {
        System.out.println("Kolko golqm iska6 da ti e masiva  ? ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] num = new int[n];
        double average = 0;
        int i = 0;
        int sum = 0;

        for (i = 0; i < num.length; i++) {
            System.out.println("Vuvedi 4islo ot masiva kato si mnogo otvoren");
            num[i] = in.nextInt();
            sum = sum + num[i];
        }

        average = sum / 3;
        System.out.println("Average = " + average);
        System.out.println("Sum = " + sum);

        int min = num[0];
        int max = num[0];
        for (i = 0; i < num.length; i++) {
            {
                if (min > num[i]) {
                    min = num[i];
                }
                if (max < num[i]) {

                    max = num[i];
                }
            }


        }
        System.out.println("Min = " + min);
        System.out.println("Max = " + max);
    }
}



