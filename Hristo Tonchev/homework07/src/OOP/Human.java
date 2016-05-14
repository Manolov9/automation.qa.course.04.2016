package OOP;

public abstract class Human {
    public String firstName;
    public String lastName;

    public Human(){}

    public Human(String firstName, String lastName)
    {
        this.firstName=firstName;
        this.lastName=lastName;
    }
    public String getFirstName()
    {
        return firstName;
    }
    public void setFirstName(String firstName)
    {
        try {
            if (firstName.length() > 20 || firstName.length() < 3) {
                throw new Exception("firstname trqbva da e mejdu 3 i 20 simvola");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        this.firstName=firstName;
    }
    public String getLastName()
    {
        return lastName;
    }
    public void setLastName(String lastName)
    {
        try {
            if (lastName.length() > 20 || lastName.length() < 3) {
                throw new Exception("lastname trqbva da e mejdu 3 i 20 simvola");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.lastName=lastName;
    }

}
