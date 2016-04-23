package com.company;

import java.sql.Time;
import java.util.*;

public class GSM {

    //Fields
    private String model;
    private String manufacturer;
    private double price;
    private String owner;
    public static String iPhone6;

    //Constructors
    public GSM(String model, String manufacturer, double price, String owner) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.price = price;
        this.owner = owner;

    }

    static {
        iPhone6 = new String("iPhone6" + "Apple");
    }

    //Method
    public String toString() {

        return ("GSM model" + " " + this.model + " " + "GSM manifacturer" + " " + this.manufacturer + " " + "GSM price" + " " + this.price + " " + "GSM owner" + " " + this.owner);
    }

    public void AddCalls(Date date, Time time, String dialedPhoneNumber, int duration)
    {
        Call call = new Call(date, time, dialedPhoneNumber, duration);
        CallHistory.add(call);
    }


    //Properties
    public String getModel()
    {
        return this.model;
    }

    public String getManufacturer()
    {
        return this.manufacturer;
    }

    public double getPrice()
    {
        return this.price;
    }

    public String getOwner()
    {
        return this.owner;
    }

    public static String getiPhone6()
    {
        return iPhone6;
    }

    public ArrayList<Call> CallHistory = new ArrayList<Call>();


}
