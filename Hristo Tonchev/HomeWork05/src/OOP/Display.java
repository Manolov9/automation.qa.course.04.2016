package OOP;

/**
 * Created by Tonchev on 19.4.2016 г..
 */
public class Display {//(size and number of colors).
    private double size;
    private int number_of_colors;

    public  Display(double size,int number_of_colors)
    {
        this.size=size;
        this.number_of_colors=number_of_colors;
    }
    public  double getSize()
    {
        return this.size;
    }
    public void setSize(double size)
    {
        this.size=size;
    }
    public int getNumber_of_colors()
    {
        return this.number_of_colors;
    }
    public void setNumber_of_colors(int number_of_colors)
    {
        this.number_of_colors=number_of_colors;
    }

}
