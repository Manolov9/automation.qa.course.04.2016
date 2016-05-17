package com.company;
import java.text.DecimalFormat;
import java.util.Scanner;

public class MinMaxSumAndAverageOfNNumbers {
    public static void main(String[] args) {
        System.out.println("Enter how manu number you want: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int max = 0;
        int min = 1;
        int sum = 0;


        for (int i = 1; i <=n; i++)
        {
            int num = scan.nextInt();
            sum +=num;

            if ((num <= 0) && (num <= min))
            {
                min = num;
                continue;
            }
            if (num <= min)
            {
                min = num;

            }else if (num >= max)
            {
                max = num;
            }
        }
        System.out.println("Min = " + min );
        System.out.println("Max = " + max );
        System.out.println("Sum = " + sum );
        double avg = sum/n;
        //double avg1 = (int)Math.round(avg * 100)/(double)100;
        avg =Double.parseDouble(new DecimalFormat("##.##").format(avg));
        System.out.println("Avg = " + avg);



    }
}
