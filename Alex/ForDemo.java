package com.company;

/**
 * Created by Divdedov QA on 4/8/2016.
 */
public class ForDemo {
    public static void main (String[]args) {




        for (int c = 32;c< 128; c++) {
            System.out.println(c + ": " + (char) c);
        }

        for (char letter = ' ';letter< 274; letter++) {
            System.out.print(letter);
        }

    }
}



