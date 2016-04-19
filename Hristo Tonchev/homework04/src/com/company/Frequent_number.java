package com.company;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Ico on 4/19/2016.
 */
public class Frequent_number {
    public static void main(String[] args) {
        int maxCount = Integer.MIN_VALUE;
        int currentCount = 1;
        int number = 0;
        System.out.println("Izberi duljina na masiv\" ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr  = new int[n];
        for (int index=0;index<n;index++)
        {
            System.out.println("Vuvedu "+(index+1)+" simvol ot masiva");
            arr[index]= scan.nextInt();
        }
        Arrays.sort(arr);
        for (int index =1; index<n;index++)
        {
            if (arr[index]==arr[index-1])
            {
                currentCount++;
            }
            else
            {
                currentCount=1;
            }
            if (currentCount> maxCount)
            {
                maxCount=currentCount;
                number=arr[index];
            }

        }
        if (n==1)
        {
            maxCount=1;
            number=arr[0];
        }
        System.out.println("Nai chesto se povtarq 4isloto "+ number+" To se povtarq "+ maxCount+" puti ");
    }
}

