package com.company;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Ico on 5/19/2016.
 */
public class TestAnatema {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //  System.out.println("enter the number of the array's length ");
        //int x = scan.nextInt();
        int[] array = new int[3];
        System.out.println("Enter only numbers between 1 and 100 ");

        try {
            for (int i = 0; i < array.length; i++) {
                System.out.println("Enter " + (i + 1) + " number to be checked ");
                array[i] = scan.nextInt();

                if (1 > array[i] || array[i] > 100) {
                    throw new Anatema();
                }
                if (array[i]!= ((int) array[i])){
                    throw  new Anatema();
                }
            }
        } catch (Anatema e)
        {
            System.out.println("Anatmea za tep " + e);
        }
        catch (Exception b)
        {
            System.out.println("Enter a number, you miserable piece of shit: "+ b);
        }
        finally {
            try {
                for (int i = 0; i < array.length; i++) {
                    System.out.println("Enter " + (i + 1) + " number to be checked ");
                    array[i] = scan.nextInt();

                    if (1 > array[i] || array[i] > 100) {
                        throw new Anatema();
                    }
                    if (array[i]!= ((int) array[i])){
                        throw  new Anatema();
                    }
                }
            } catch (Anatema e)
            {
                System.out.println("Anatmea za tep " + e);
            }
            catch (Exception b)
            {
                System.out.println("Enter a number, you miserable piece of shit: "+ b);
            }
        }

        }
    }


