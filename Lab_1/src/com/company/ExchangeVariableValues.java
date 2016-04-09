package com.company;

public class ExchangeVariableValues {
    public static void main(String[] args) {

        int variableA = 5;
        int variableB = 10;
        System.out.println("Before\n" +variableA);
        System.out.println(variableB);

        int variableC = variableA;
        variableA = variableB;
        variableB = variableC;

        System.out.println("After\n" +variableA);
        System.out.println(variableB);

    }
}
