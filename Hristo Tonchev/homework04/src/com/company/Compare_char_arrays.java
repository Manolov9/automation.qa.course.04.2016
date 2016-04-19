package com.company;

import java.util.Scanner;

/**
 * Created by Ico on 4/18/2016.
 */
public class Compare_char_arrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("vivedi duljuinata na purvi masiv ");
        int lenght1 = scan.nextInt();
        char arr1[]=new char[lenght1];
        for (int index = 0; index <lenght1;index ++)
        {
            System.out.println(index+1+" simvol ot masiva");
          arr1[index]=scan.next().charAt(0);
        }
        System.out.println("vivedi duljinata na vtori masiv ");
        int lenght2 = scan.nextInt();
        char arr2[]=new char[lenght2];
        for (int index = 0; index <lenght2;index ++)
        {
            System.out.println(index+1+" simvol ot masiva");
            arr2[index]=scan.next().charAt(0);
        }

        int index=0;
        for (int i=0;i<Math.min(arr1.length,arr2.length);i++)
        {
            index = i;
            if (arr1[i]!=arr2[i])
            {
                break;
            }
        }
        if (arr1[index]<arr2[index])
        {
            System.out.println("1 masiv e predi 2 masiv ");
        }
        else  if (arr1[index]>arr2[index])
        {
            System.out.println("2 masiv e predi 1 masiv ");
        }
        else  if (index !=arr1.length-1)
        {
            System.out.println("2 masiv e perdi 1");
        }
        else if (index !=arr2.length-1)
        {
            System.out.println("1 masiv e predi 2");
        }
        else
        {
            System.out.println("masiv 1 e raven na masiv 2");
        }

    }
}
