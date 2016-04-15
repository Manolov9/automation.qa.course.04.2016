package com.company;



/**
 * Created by Ico on 4/14/2016.
 */
public class deck_of_52_cards {
    public static void main(String[] args) {
        int[] deck =new int[52];
        String[] Boi= {"♣ ", "♦ ", "♥ ", "♠ "};
        String[] Cifri= {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

        for (int i=0; i < deck.length; i++){
            deck[i]=i;
        }
        for (int i=0;i <52;i++){
            String boq=Boi[deck[i] /13];
            String Cifra= Cifri[deck[i]%13];
            System.out.println(Cifra + " of "+ boq);

        }
























        /* int[] deck = new int[52];
        String[] boq = {"♣ ", "♦ ", "♥ ", "♠ "};
        String[] rank = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};


        for (int i = 0; i < deck.length; i++) {
            deck[i] = i;
        }

        for (int i = 0; i < 52; i++) {
            String znak = boq[deck[i] / 13];
            String cifra = rank[deck[i] % 13];
            System.out.println( cifra + " of " + znak);
        }*/
    }
}

