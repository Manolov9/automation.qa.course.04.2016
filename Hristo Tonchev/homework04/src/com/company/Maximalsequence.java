package com.company;

import java.util.Scanner;

/**
 * Created by Ico on 4/19/2016.
 */
public class Maximalsequence {
    public static void main(String[] args) {
        int maxCount = 0;
        int currentCount = 1;
        int sequenceStart = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("vivedi duljuinata na purvi masiv ");
        int lenght = scan.nextInt();
        int arr[] = new int[lenght];
        for (int index = 0; index < lenght; index++) {
            System.out.println(index + 1 + " 4islo ot masiva");
            arr[index] = scan.nextInt();
            if (index != 0) {
                if (arr[index] == arr[index - 1]) {
                    currentCount++;
                } else {
                    currentCount = 1;
                }
                if (currentCount > maxCount) {
                    maxCount = currentCount;
                    sequenceStart = index + 1 - maxCount;
                }

            }
        }
        System.out.println("the max count of seuqnce is: ");

        for (int index = sequenceStart; index < sequenceStart + maxCount; index++) {
            System.out.println(arr[index]);
        }
    }
}
