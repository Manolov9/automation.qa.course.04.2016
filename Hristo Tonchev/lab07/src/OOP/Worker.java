package OOP;

/**
 * Created by Tonchev on 26.4.2016 г..
 */
public class Worker extends Human implements IWorker {
    private double weekSalary;
    private double workHoursPerDay;

    public Worker(String firstName, String lastName, double weekSalary, double workHoursPerDay) {
        super(firstName, lastName);
        this.weekSalary = weekSalary;
        this.workHoursPerDay = workHoursPerDay;
    }

    @Override
    public void setLastName(String lastName) {
        super.setLastName(lastName);
    }

    @Override
    public void setFirstName(String fristName) {
        super.setFirstName(fristName);
    }

    @Override
    public String getFirstName() {
        return super.getFirstName();
    }

    @Override
    public String getLastName() {
        return super.getLastName();
    }

    public double getWeekSalary() {
        return weekSalary;
    }

    public double getWorkHoursPerDay() {
        return workHoursPerDay;
    }

    public void setWeekSalary(double weekSalary) {
        this.weekSalary = weekSalary;
    }

    public void setWorkHoursPerDay(double workHoursPerDay) {
        this.workHoursPerDay = workHoursPerDay;
    }

    public double moneyPerHour() {

        return this.getWeekSalary() / getWorkHoursPerDay();

    }

    @Override
    public void work(String FirstName, String LastName, double workHours, double monthlySalary) {
        System.out.println(FirstName + " "+ LastName +  "works "+  workHours+ " hours per day and makes" +monthlySalary+ "leva a month. ");

    }
}
