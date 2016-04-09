package com.company;

public class NullValuesArithmetic {
    public static void main(String[] args) {

        Integer nullableInteger = null;
        Double floatNumber = null;

        System.out.println("Null value: " + nullableInteger);
        System.out.println("Null value: " + floatNumber);

        nullableInteger = 7;
        floatNumber = 4.5;

        System.out.println("Number value: " + nullableInteger);
        System.out.println("Number value: " + floatNumber);

        nullableInteger += 7;
        floatNumber += 4.5;

        System.out.println("Number + null value: " + nullableInteger);
        System.out.println("Number + null value: " + floatNumber);

    }
}
