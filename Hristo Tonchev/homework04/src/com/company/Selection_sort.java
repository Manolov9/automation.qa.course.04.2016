package com.company;

import java.util.Scanner;

/**
 * Created by Ico on 4/19/2016.
 */
public class Selection_sort {
    public static void main(String[] args) {
        int min = Integer.MAX_VALUE;
        int minIndex  = 0;
        int temp  = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("vivedi duljuinata na  masiv ");
        int n = scan.nextInt();
        int arr[] = new int[n];


        for (int index = 0; index < n; index++)
        {
            System.out.println(index + 1 + " 4islo ot masiva");
            arr[index] = scan.nextInt();
        }
        for (int i=0;i<n;i++)
        {
            for (int j=i;j<n;j++)
            {
                if (arr[j]<min)
                {
                    min=arr[j];
                    minIndex=j;
                }
            }
            temp=arr[i];
            arr[i]= min;
            arr[minIndex]=temp;
            min=Integer.MAX_VALUE;
        }
        for (int index=0;index<n;index++)
        {
            System.out.println(arr[index]);
        }

    }
}