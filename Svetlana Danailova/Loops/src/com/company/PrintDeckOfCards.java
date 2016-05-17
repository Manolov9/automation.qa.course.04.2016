package com.company;


public class PrintDeckOfCards {
    public static void main(String[] args) {
        for (int i = 2; i <=14; i++ )
        {
            for (int j=1; j <=4; j++)
            {
                switch(i)
                {
                    case 2:
                        System.out.println("Two of");
                        break;
                    case 3:
                        System.out.println("Three of");
                        break;
                    case 4:
                        System.out.println("Four of");
                        break;
                    case 5:
                        System.out.println("Five of");
                        break;
                    case 6:
                        System.out.println("Six of");
                        break;
                    case 7:
                        System.out.println("Seven of");
                        break;
                    case 8:
                        System.out.println("Eight of");
                        break;
                    case 9:
                        System.out.println("Nine of");
                        break;
                    case 10:
                        System.out.println("Ten of");
                        break;
                    case 11:
                        System.out.println("Jack of");
                        break;
                    case 12:
                        System.out.println("Queen of");
                        break;
                    case 13:
                        System.out.println("King of");
                        break;
                    case 14:
                        System.out.println("Ace of");
                        break;
                    default:
                        System.out.println(" ");
                        break;

                }
                switch (j)
                {
                    case 1:
                        System.out.println("Clubs");
                        break;
                    case 2:
                        System.out.println("Diamonds");
                        break;
                    case 3:
                        System.out.println("Hearts");
                        break;
                    case 4:
                        System.out.println("Spades");
                        break;
                    default:
                        System.out.println(" ");
                        break;
                }
                //System.out.println(new String("-", 30));
            }
        }
    }
}
