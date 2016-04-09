package com.company;

public class TheSmallestOfThreeNumbers {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;
        int c = 1;

        if(a<b && a<c){
            System.out.println(a);
        }else if(b<c && b<a){
            System.out.println(b);
        }else{
            System.out.println(c);
        }
    }
}
