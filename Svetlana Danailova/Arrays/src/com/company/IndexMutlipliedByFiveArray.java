package com.company;


public class IndexMutlipliedByFiveArray {

    public static void main(String[] args) {
        int[]array = new int[20];
        for (int index =0; index < 20; index++)
        {
            array[index] = index * 5;
            System.out.println(array[index]);
        }

    }
}
