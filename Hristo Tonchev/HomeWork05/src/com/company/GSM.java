package com.company;

import java.sql.Time;
import java.time.DateTimeException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

/**
 * Created by Tonchev on 19.4.2016 г..
 */
public class GSM {
    private String model;
    private String manufacturer;
    private String owner;
    private double price;
    private static String ipohne4s;


    public GSM(String model, String manufacturer, String owner, double price)
    {
        this.model = model;
        this.manufacturer = manufacturer;
        this.owner = owner;
        this.price = price;
        this.ipohne4s="Model-Ipohne 4s,Manufacturer-Apple,Owner-Steve, Price-1000.3";
    }

    public static String getIpohne4s()
    {
        return ipohne4s;
    }
    public  static void setIpohne4s(String ipohne4s)
    {
        setIpohne4s("Model-Ipohne 4s,Manufacturer-Apple,Owner-Steve, Price-1000.3");
    }

    public String getModel()
    {
        return this.model;
    }
    public  void setModel(String model)
    {
        this.model=model;
    }
    public  String getManufacturer()
    {
        return  this.manufacturer;
    }
    public void setManufacturer(String manufacturer)
    {
        this.manufacturer=manufacturer;
    }
    public String getOwner()
    {
        return this.owner;
    }
    public void setOwner(String owner)
    {
        this.owner=owner;
    }
    public double getPrice()
    {
        return this.price;
    }
    public void setPrice(double price)
    {
        this.price=price;
    }

    public ArrayList<Calls> CallHistory=new ArrayList<Calls>();// ??????????????????????????????????????????????????


    @Override
    public String toString() {
        System.out.println("<<<<<<<<<<GSM>>>>>>>>>>");
        System.out.println("GSM model: "+this.model);
        System.out.println("GSM manufacture: " + this.manufacturer);
        System.out.println("GSM owner: " + this.owner);
        System.out.println("Gsm price: "+this.price);
        return super.toString();
    }
    public  void AddCalls(double Date,double Time,int PhoneNumber,double Duration)
    {
        Calls calls= new Calls(Date,Time,PhoneNumber,Duration);
        CallHistory.add(calls);
    }
    public  void  DeleteCalls(int Duration)
    {
        for (int i =0;i<CallHistory.toArray().length;i++)//?????????????????????????????????????????CallHistory.Count??
        {
            if (CallHistory.contains(i))//?????????????????????????????????????????CallHistory[i].Duration == duration??????????
            {
                CallHistory.remove(i);
                i--;
            }
        }
    }
    public void ClearCalls()
    {
        CallHistory.clear();
    }
    public void CalculateTotalPrice(double pricePerMinute) {
        double wholetime = 0;
        for (int i = 0; i < CallHistory.toArray().length; i++)
        {
            double price = pricePerMinute * (Math.ceil(wholetime / 60));
        }
        System.out.println("Total price: " + price);
        System.out.println();
    }

    public void PrintCalls()
    {
        for (int i=0;i<CallHistory.toArray().length;i++)
        {
            System.out.println("-------Calls------");
            System.out.println("Date: "+ (CallHistory.contains(i)));//??????????????CallHistory[i].Date
            System.out.println("Time: "+ (CallHistory.contains(i)));//????????????CallHistory[i].Time
            System.out.println("Diled pohne number: "+ (CallHistory.contains(i)));//?????????????????CallHistory[i].DialedPhoneNumber
            System.out.println("Duration: "+ (CallHistory.contains(i)));//????????????????????CallHistory[i].Duration

        }
    }


}
