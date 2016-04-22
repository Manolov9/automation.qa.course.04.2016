package OOP;

/**
 * Created by Tonchev on 19.4.2016 г..
 */
public class Battery {
    private String model;
    private double hours_idle;
    private double hours_talk;

public Battery(String model,double hours_idle,double hours_talk)
{
    this.model=model;
    this.hours_idle=hours_idle;
    this.hours_talk=hours_talk;
}
    public String getModel()
    {
        return this.model;
    }
    public  void setModel(String model)
    {
        this.model=model;
    }
    public double getHours_idle()
    {
        return this.hours_idle;
    }
    public void setHours_idle(double hours_idle)
    {
        this.hours_idle=hours_idle;
    }
    public double getHours_talk()
    {
        return this.hours_talk;
    }
    public void setHours_talk(double hours_talk)
    {
        this.hours_idle=hours_talk;
    }
}
