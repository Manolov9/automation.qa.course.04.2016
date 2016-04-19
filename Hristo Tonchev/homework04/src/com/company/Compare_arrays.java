package com.company;

import java.util.Scanner;

/**
 * Created by Ico on 4/18/2016.
 */
public class Compare_arrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("vivedi duljuinata na purvi masiv ");
      int lenght1 = scan.nextInt();
        int arr1[]=new int[lenght1];
        for (int index = 0; index <lenght1;index ++)
        {
            System.out.println(index+1+" 4islo ot masiva");
            arr1[index]=scan.nextInt();
        }
        System.out.println("vivedi duljinata na vtori masiv ");
        int lenght2 = scan.nextInt();
        int arr2[]=new int[lenght2];
        for (int index = 0; index <lenght2;index ++)
        {
            System.out.println(index+1+" 4islo ot masiva");
            arr2[index]=scan.nextInt();
        }
        boolean equal=true;

        if (lenght1==lenght2)
        {
           for (int index=0; index <lenght1;index++)
           {
               if (arr1[index]!= arr2[index])
               {
                   equal=false;

               }
           }
        }
        else
        {
            equal=false;
        }
        if (equal)
        {
            System.out.println("masivite sa ravni");
        }
        else
        {
            System.out.println("masivite ne sa ravni");
        }

    }
}
