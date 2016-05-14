package OOP;

/**
 * Created by Tonchev on 26.4.2016 г..
 */
public class Student extends Human {
    private String enumeration="COLLEGE";
    private double averageGrade;

    public Student(){}

    public Student(String firstName, String lastName) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.enumeration = "COLLEGE";
        this.averageGrade = getAverageGrade();
        this.setAverageGrade(averageGrade);
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
    public void setFirstName(String firstName) {

        super.setFirstName(firstName);
    }

    @Override
    public void setLastName(String lastName) {

        super.setLastName(lastName);
    }
    public String getEnumeration()
    {
        return enumeration="College";
    }
    public void setEnumeration(String enumeration)
    {
        this.enumeration="COLLEGE";
    }
    public double getAverageGrade()
    {
        return  averageGrade;
    }
    public void  setAverageGrade(double averageGrade)
    {
        try {
            if (averageGrade < 2 || averageGrade > 6)
            {
                throw new Exception("Ocnekata da e mejdu 2 i 6");
            }

        }catch (Exception e){
            e.printStackTrace();
        }
        this.averageGrade=averageGrade;
    }


}
