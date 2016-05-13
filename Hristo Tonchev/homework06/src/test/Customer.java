package test;

/**
 * Created by Ico on 5/13/2016.
 */
public abstract class Customer {
    public String name;

    public Customer() {

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public Customer(String name)
    {
        this.name=name;
    }
    @Override
    public String toString()
    {
        return String.format("Type: " + toString()+ "Name: " +name+ this.toString()+this.name);
    }
}
