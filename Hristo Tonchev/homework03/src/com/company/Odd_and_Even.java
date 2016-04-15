package com.company;

import com.sun.javafx.scene.layout.region.Margins;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Ico on 4/15/2016.
 */
public class Odd_and_Even {
    public static void main(String[] args) {
        System.out.println("Enter integers with a space between them:");
        System.out.println("Kolko golqm iska6 da ti e masiva  ? ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] num = new int[n];
        int sumOdd=1;
        int sumEven=1;
        int a=num[0];
        int b=num[0];
        for (int i=0;i<num.length;i++)
        {
            if (i%2==0)
            {
                sumOdd*= num[i];
            }
            else
            {
                sumEven*=num[i];
            }
        }
        if (sumEven==sumOdd)
        {
            System.out.println("yes");
            System.out.println(Arrays.toString(num)+" "+sumOdd);
        }
        else
        {
            System.out.println("no");
        }
    }
}
