package OOP;

import java.util.Scanner;

/**
 * Created by Ico on 4/20/2016.
 */
public class GSMTest {
    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter model ");
        String Model = scan.nextLine();
        System.out.println("Enter Manufacturer ");
        String Manufacturer = scan.nextLine();
        System.out.println("Enter owner ");
        String Owner = scan.nextLine();
        System.out.println("Enter Price ");
        double Price = scan.nextDouble();



        GSM OnePlusOne = new GSM(Model, Manufacturer, Owner, Price);
        System.out.println("The model of the phone is: " + OnePlusOne.getModel()+ '\n' + "The Manufacturer of the phone is: "
                + OnePlusOne.getManufacturer() +  '\n'+"The Owner of the phone is: " + OnePlusOne.getOwner() + '\n'+ "The Price of the phone is: " + OnePlusOne.getPrice()
        + '\n'+OnePlusOne.getIpohne4s());

        GSM[] array = new GSM[3];
        GSM firstGsm =new GSM("Nokia","China","Cun kai hui",69.9);
        array[0]=firstGsm;
        GSM secondGsm =new GSM("One plus one","Japan","Kakashi",1234.9);
        array[1]=secondGsm;
        GSM thirdGsm =new GSM("Lenovo","USA","Peter",333.3);
        array[2]=thirdGsm;

        //print info about phones
        for (int i =0; i<array.length;i++) {
         array[i].toString();
        }

        //print info about Ipone
        System.out.println( GSM.getIpohne4s().toString());


        //Call history test
        GSM fourhtGsm=new GSM("Nexus","China","Alex",400.20);



        System.out.println("Add calls and print");
        fourhtGsm.AddCalls(22.01,10.10,88888888,90);
        fourhtGsm.AddCalls(23.05,1.10,7777777,33);
        fourhtGsm.AddCalls(2.05,12.10,6666666,66);
        fourhtGsm.PrintCalls();

        System.out.println("Delete call and print");
        firstGsm.DeleteCalls(66);
        fourhtGsm.PrintCalls();

        fourhtGsm.CalculateTotalPrice(0.37);

        fourhtGsm.ClearCalls();
        firstGsm.PrintCalls();




}
}
