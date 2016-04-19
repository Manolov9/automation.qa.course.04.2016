package com.company;

import java.util.Scanner;

/**
 * Created by Ico on 4/19/2016.
 */
public class Index_of_letters {
    public static void main(String[] args) {
        char[] alphabet=new char[25];
        for (int i =0;i<alphabet.length;i++)
        {
            alphabet[i]=(char)('a'+i);

        }
        System.out.println("Vuvedi duma: ");
        Scanner scan = new Scanner(System.in);
        String word = scan.next().toLowerCase();
/*
        for (char letter: word)
        {
        for (int index =0;index<alphabet.length;index++)
        {
            if (letter==alphabet[index])
            {
                System.out.println("The index of "+letter+" is "+index);
            }

        }
        }*/
    }
}
