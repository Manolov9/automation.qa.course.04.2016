package com.company;

import java.util.Scanner;

/**
 * Created by Ico on 4/14/2016.
 */
public class problem_5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double sum = 1;
        System.out.println("enter n ");
        int n = scan.nextInt();
        System.out.println("enter x ");
        int x = scan.nextInt();
        double rezlut =1.00000;
        double Faktsum=1.00000;
        int temp=1;
        if (n <= 0)
        {
            System.out.println("Number should be non-negative.");
        }
        else {
                for (int i =1;i <=n;i++)
                {
                    Faktsum*=i;
                    temp=temp ^n;
                    rezlut +=Faktsum/temp;


                }

            System.out.println(rezlut);




        }
    }
}