package com.company;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Vuvedete broi elementi na purviq masiv : ");
        int n = input.nextInt();
        int masiv[] = new int[n];

        System.out.println("enter elements : ");
        for (int i = 0; i < n; i++) {
            masiv[i] = input.nextInt();
        }


        System.out.print("Vuvedete broi elementi na vrotiq masiv : ");
        int b = input.nextInt();
        int masiv2[] = new int[b];

        System.out.println("enter elements : ");
        for (int i = 0; i < b; i++) {
            masiv2[i] = input.nextInt();
        }

       if (Arrays.equals(masiv,masiv2))
       {
           System.out.println("SAME");
            }
        else {
           System.out.println("NOT SAME");
        }











//        for (int i : masiv) {
//            System.out.print(i);
//        }
//
//        for (int i : masiv2) {
//            System.out.print(i);
//
//        }


    }

}


    // write your code here


