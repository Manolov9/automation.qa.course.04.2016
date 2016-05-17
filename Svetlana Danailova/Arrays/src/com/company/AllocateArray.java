package com.company;

/**
 * Created by User on 5/17/2016.
 */
public class AllocateArray {
    public static void main(String[] args) {
        int[] arr = new int[20];

        for (int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i] = i * 5);
        }
    }
}
