package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      int x , y, z ;
       System.out.println("Enter 2 numners ");
        Scanner in = new Scanner(System.in);
        x = in.nextInt();
        y = in.nextInt();
        z = x + y;
        System.out.println("sumata na x + y e ravna na" +z);
    }
}
