import people.Employee;
import people.Student;

public class Startup {

  public static void main(String[] args) {
    Student stamat = new Student("Stamat", "IT Academy");


    System.out.println(stamat.toString());


    Object obj = new Object();
    Employee emp = new Employee("Ime", 32, "Academy", 800.0);

  }
}