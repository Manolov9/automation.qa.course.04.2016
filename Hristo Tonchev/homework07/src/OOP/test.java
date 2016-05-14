package OOP;

import java.util.Scanner;

/**
 * Created by Ico on 5/14/2016.
 */
public class test {
    public static void main(String[] args) throws Exception {
        Worker Tonchev = new Worker();
        Student Ico = new Student();
        Scanner scan = new Scanner(System.in);

        System.out.println("VAVEDI li4no ime:");
        String firstName = scan.next();
        Ico.setFirstName(firstName);

        System.out.println("VAVEDI familiq:");
        String lastName = scan.next();
        Ico.setLastName(lastName);

        System.out.println("vuvedi grade");
        double grade =scan.nextDouble();
        Ico.setAverageGrade(grade);

        System.out.println("vuvedi rabotni chasove");
        double workHoursPerDay =scan.nextDouble();
        Tonchev.setWorkHoursPerDay(workHoursPerDay);

    }
}

