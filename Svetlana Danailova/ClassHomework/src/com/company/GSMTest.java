package com.company;

public class GSMTest {
    public static void main(String[] args) {
        GSM[] array = new GSM[3];

        GSM firstGSM = new GSM("Galaxy S4", "Samsung", 900.00 ,"Ivo" );
        array[0] = firstGSM;

        GSM secondGSM = new GSM("Xperia", "Sony", 600.00, "Georgi" );
        array[1] = secondGSM;

        GSM thirdGSM = new GSM("Nexus", "LG", 1400.00, "Sasho" );
        array[2] = thirdGSM;

        //Print information about the GSMs in the array
        for (int i = 0; i < array.length; i++)
        {
            array[i].toString();
            System.out.println(array[i]);
        }

        //Print information about the static property iPhone6
        GSM.iPhone6.toString();


    }
}
