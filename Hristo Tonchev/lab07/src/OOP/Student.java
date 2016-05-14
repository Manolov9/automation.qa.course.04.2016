package OOP;

/**
 * Created by Tonchev on 26.4.2016 г..
 */
public class Student extends Human {
    private String enumeration="COLLEGE";
    private double averageGrade;


    public Student(String firstName, String lastName, String enumeration, double averageGrade) {
        super(firstName, lastName);
        this.averageGrade=averageGrade;
        this.enumeration="COLLEGE";
    }

    @Override
    public String getFirstName() {
        return super.getFirstName();
    }

    @Override
    public String getLastName() {
        return super.getLastName();
    }

    @Override
    public void setFirstName(String fristName) {
        super.setFirstName(fristName);
    }

    @Override
    public void setLastName(String lastName) {
        super.setLastName(lastName);
    }
    public String getEnumeration()
    {
        return enumeration;
    }
    public void setEnumeration(Student enumeration)
    {
        this.enumeration="COLLEGE";
    }
    public double getAverageGrade()
    {
        return  averageGrade;
    }
    public void  setEnumeration(double averageGrade)
    {
        this.enumeration=enumeration;
    }
}
