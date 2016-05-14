package OOP;

public abstract class Human {
    private String firstName;
    private String lastName;

    public Human(String firstName, String lastName)
    {
        this.firstName=firstName;
        this.lastName=lastName;
    }
    public String getFirstName()
    {
        return firstName;
    }
    public void setFirstName(String fristName)
    {
        this.firstName=fristName;
    }
    public String getLastName()
    {
        return lastName;
    }
    public void setLastName(String lastName)
    {
        this.lastName=lastName;
    }

}
