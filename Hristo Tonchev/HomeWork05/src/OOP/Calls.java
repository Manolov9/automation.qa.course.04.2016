package OOP;

import java.time.DateTimeException;
import java.util.Date;

/**
 * Created by Ico on 4/21/2016.
 */
public class Calls {
    private double Date;
    private double Time;
    private long PhoneNumber;
    private double Duration;



    public  Calls(double Date,double Time,long PhoneNumber,double Duration)
    {
        this.Date=Date;
        this.Time=Time;
        this.PhoneNumber=PhoneNumber;
        this.Duration=Duration;
    }
    public  double getDate()
    {
        return this.Date;
    }
    public void setDate(double Date)
    {
        this.Date=Date;
    }
    public double getTime()
    {
        return  this.Time;
    }
    public void setTime(double Time)
    {
        this.Time=Time;
    }
    public long getPhoneNumber()
    {
        return this.PhoneNumber;
    }
    public void setPhoneNumber(long PhoneNumber)
    {
        this.PhoneNumber=PhoneNumber;
    }
    public double getDuration()
    {
        return this.Duration;
    }
    public void setDuration(double Duration)
    {
        this.Duration=Duration;
    }
}

