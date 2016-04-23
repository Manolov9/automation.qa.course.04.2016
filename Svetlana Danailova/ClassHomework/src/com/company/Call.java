package com.company;
import java.sql.Time;
import java.util.Date;



public class Call {

    //Fields
    private Date date;
    private Time time;
    private String dialedPhoneNumbers;
    private int duration;

    //Constructors
    public Call(Date date, Time time, String dialedPhoneNumbers, int duration)
    {
        this.date = date;
        this.time = time;
        this.dialedPhoneNumbers = dialedPhoneNumbers;
        this.duration = duration;

    }

    public Date getDate()
    {
        return this.date;

    }

    public Time getTime() {
        return time;
    }

    public String getDialedPhoneNumbers()
    {
        return this.dialedPhoneNumbers;
    }

    public int getDuration()
    {
        return this.duration;
    }






}
