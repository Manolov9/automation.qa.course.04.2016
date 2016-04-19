package com.company;

import java.util.Scanner;

/**
 * Created by Ico on 4/19/2016.
 */
public class Find_sum_in_array {
    public static void main(String[] args) {
        System.out.println("Izberi duljina na masiv\" ");
        Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
             int[] arr = new int[n];
                 for (int index = 0; index < n; index++)
                 {
                     System.out.println("Vuvedu " + (index + 1) + " simvol ot masiva");
                     arr[index] = scan.nextInt();
                 }
        System.out.println( "Vuvedete Suma");
        int S = scan.nextInt();
        int sum =0;
        boolean solution=false;
        for (int i =0; i<n;i++)
        {
            for (int j=i;j<n;j++)
            {
                sum +=arr[j];
                if (sum ==S)
                {
                    solution=true;
                    System.out.println("Slednite 4isla imat sumata "+S);
                    for (int print =i;print<=j;print++)
                    {
                        System.out.println(arr[print]);

                    }
                    System.out.println();

                }
            }
            sum = 0;
        }
        if (!solution)
        {
            System.out.println("nqma 4isla ot izbraniq masiv sus suma " + S);
        }
    }
}
