package com.company;


public class Battery {

    //Fields
    private String bstteryModel;
    private int batteryHoursIdle;
    private int batteryHoursTalk;

    //Constructors
    public Battery (String batteryModel, int batteryHoursIdle, int batteryHoursTalk)
    {
        this.bstteryModel = batteryModel;
        this.batteryHoursIdle = batteryHoursIdle;
        this.batteryHoursTalk = batteryHoursTalk;
    }

    //Properties

    public String getBstteryModel()
    {
        return this.bstteryModel;
    }

    public int getBatteryHoursIdle()
    {
        return this.batteryHoursIdle;
    }

    public int getBatteryHoursTalk()
    {
        return this.batteryHoursTalk;
    }


}
