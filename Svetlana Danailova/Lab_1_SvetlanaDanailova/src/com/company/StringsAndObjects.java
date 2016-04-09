package com.company;


public class StringsAndObjects {
    public static void main(String[] args) {
        String firstString = "Hello";
        String secondString = "World!";

        Object both = firstString + " " + secondString;

        String sentence = (String)both;

        System.out.println(sentence);

    }
}
