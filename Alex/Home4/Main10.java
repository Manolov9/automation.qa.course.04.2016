package com.company;

import java.lang.reflect.Array;

public class Main {

    public static void main(String[] args) {

        int [] huicheta = new int[] {60,5,4};
        int s = 0;


        for (int i = 0; i<huicheta.length;i++)
        {
            s = s + huicheta[i];

        }
        double sredno = s/huicheta.length;
        System.out.println("Sumata na masiva e : "+s);
        System.out.println("Srednoto na masiva e : "+sredno);






	// write your code here
    }
}
