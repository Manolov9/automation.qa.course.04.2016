package com.company;

public class QuotesInStrings {
    public static void main(String[] args) {

        String quote1 = "The \"use\" of quotations causes difficulties.";
        String quote2 = "The 'use' of quotations causes difficulties."; //cannot use @ here. So what is the second way?

        System.out.println(quote1 + "\n" + quote2);
    }

}
