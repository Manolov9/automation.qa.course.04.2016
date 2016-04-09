package com.company;

import java.text.DecimalFormat;

public class ComparingFloats {
    public static void main(String[] args) {
        float firstA = 5.3f;
        float firstB = 6.01f;
        double secondA = 5.00000001;
        double secondB = 5.00000003;
        DecimalFormat df = new DecimalFormat("#,###,##0.0000000");
        DecimalFormat pf = new DecimalFormat("#,###,##0.00000000");

        double fourthA = -4.999999;
        double fourthB = -4.999998;

        System.out.println("First pair: " + firstA + " and " + firstB + '\n' + "Second pair: " + secondA + " and " + secondB + '\n' +
                "Third pair: " + df.format(-0.0000007) + " and " + pf.format(0.00000007) + '\n' +
                "Fourth pair: " + fourthA + " and " + fourthB + '\n');




    }

}
