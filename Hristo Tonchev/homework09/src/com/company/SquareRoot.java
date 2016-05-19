package com.company;

import java.io.IOException;
import java.util.Scanner;

public class SquareRoot {

    public static void main(String[] args) throws IOException {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter a positive integer number");
        try {


            int x = scan.nextInt();
            System.out.println("The square root of your number is  "+ Math.sqrt(x));
            if (x < 0 || x!=(int)x){
                throw new  IOException();
            }

        } catch (IOException e){
            System.out.println("You entered a negative nubmer! Error: "+e);
        } catch (Exception d){
            System.out.println ("You did not enter a number! Error: "+d);
        }finally {
            System.out.printf("See you later Aligator ");
        }

    }
}
