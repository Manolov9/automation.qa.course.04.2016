package com.company;

import java.util.Scanner;

import static java.lang.Math.E;
import static java.lang.Math.sqrt;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Vuvedi 4islo boklik : ");
        try {
            int r = sc.nextInt();


            if (r < 0) {
                System.out.println("Invalid Number");
            } else {
                System.out.println("stoinosta e :  " + Math.sqrt(r));

            }
        } catch (Exception e) {
            System.out.println("Burka6 Pedal");
        }
        finally {
            System.out.println("ARE BEGAI !");

    }
    }
  }
