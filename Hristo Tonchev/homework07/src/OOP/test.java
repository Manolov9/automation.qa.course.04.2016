package OOP;

import java.util.Scanner;

import static java.lang.String.valueOf;

/**
 * Created by Ico on 5/14/2016.
 */
public class test {
    public static void main(String[] args) throws Exception {
        Worker Tonchev = new Worker();
        Student Ico = new Student();
        Scanner scan = new Scanner(System.in);
        System.out.println("Choose Student or Worker");
        String Student = "Student";
        String Worker = "Worker";
        int i = 0;

        String choose = scan.next();
        if (choose.equals(Student)) {


            System.out.println("Enter number of Students");
            int n = scan.nextInt();
            String[] gosho = new String[n];

            do {

                System.out.println("Enter the first name of the "+(i+1)+" Studnet: ");
                String firstName = scan.next();
                Ico.setFirstName(firstName);

                System.out.println("Enter the last name of the"+(i+1)+" Studnet: ");
                String lastName = scan.next();
                Ico.setLastName(lastName);

                System.out.println("Enter the grade of the"+(i+1)+" Studnet: ");
                double grade = scan.nextDouble();
                Ico.setAverageGrade(grade);


                i++;

                System.out.println(firstName+" "+lastName+ " has an average grade "+ grade);


            } while (i < n);


        } else if (choose.equals(Worker)) {
            System.out.println("Enter the number of workers ");
            int n = scan.nextInt();
            String[] gosho = new String[n];

            do {

                System.out.println("Enter the first name of the "+(i+1)+" worker: ");
                String firstName = scan.next();
                Ico.setFirstName(firstName);

                System.out.println("Enter the last name of the "+(i+1)+" worker: ");
                String lastName = scan.next();
                Ico.setLastName(lastName);

                System.out.println("Enter the work hours per day of the "+(i+1)+" worker: ");
                double workHoursPerDay = scan.nextDouble();
                Tonchev.setWorkHoursPerDay(workHoursPerDay);

                System.out.println("Enter the  week salary of the "+(i+1)+" worker: ");
                double weekSalary =scan.nextDouble();
                Tonchev.setWeekSalary(weekSalary);
                i++;

                System.out.println(firstName+" "+lastName+ " has worked "+ workHoursPerDay + " hours per day ,his week salary is: "+weekSalary+" evro per week and he recievse "+Tonchev.moneyPerHour()+" evro per hour");


            } while (i < n);
        }
        System.out.println(Tonchev.moneyPerHour());




    }

    }


