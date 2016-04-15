package com.company;

import java.util.Scanner;

/**
 * Created by Ico on 4/15/2016.
 */
public class Nfakt_kFakt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("vuvedi N");
        int N = scan.nextInt();
        System.out.println("vuvedi K");
        int K = scan.nextInt();
        double fakt = 1.0000;
        double sum;
        double fakt2 = 1.0000;
        if (K >N || N >100 )
            System.out.println("greshka abort 1<k<n<100!!");
        else {


            for (int c = 1; c <= N; c++) {
                fakt *= c;
            }
            for (int c = 1; c <= K; c++) {
                fakt2 *= c;
            }
            sum = fakt / fakt2;
            System.out.println(sum);
        }

    }
}
