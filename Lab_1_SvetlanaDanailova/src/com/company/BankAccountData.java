package com.company;


import java.math.BigInteger;

public class BankAccountData {
    public static void main(String[] args) {
        String firstName = "Elena";
        String middleName = "Vladimirova";
        String lastName = "Petrova";
        double money = 394850.57;
        String bankName = "Bulbank";
        String iban = "BG32 UBBS 7827 1013 2377 32";
        BigInteger cardNumber1 = new BigInteger("123456789123509");
        BigInteger cardNumber2 = new BigInteger("908765432123456");
        BigInteger cardNumber3 = new BigInteger("574836123456789");

        System.out.println("First name:"+firstName+'\n'+"Middle name:"+middleName+'\n'+"Last name:"+lastName+'\n'+
                "Balance money:"+money+'\n'+"Bank name:"+bankName+'\n'+
                "IBAN:"+iban+'\n'+"Credit card1:"+cardNumber1+'\n'+"Credit card2:"+cardNumber2+'\n'+"Credit card3:"+cardNumber3+'\n');

    }
}

