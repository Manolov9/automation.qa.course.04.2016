package com.company;

import java.util.Scanner;

public class Problem_2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("Enter a nubmer : ");
        int n = scan.nextInt();
        if (n <= 0 ) {
            System.out.println("otricatelno");

        }
        else{
            for (int x = 1; x <= n; x++){
           if (!(x%3==0) && !(x%7==0)) {

                System.out.println(x);
            }}


            // write your code here
        }

    }
}
