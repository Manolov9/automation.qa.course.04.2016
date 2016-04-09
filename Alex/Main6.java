import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two float numbers :  ");
        Double a = input.nextDouble();
        Double b = input.nextDouble();
        Double eps = 0.000001;
        Boolean CheckNubmer = Math.abs(a - b) < eps;
        if (Math.abs(a - b) < eps)
        {
            System.out.println(CheckNubmer);
        }
        else if (Math.abs(a - b) >= eps);
        {
            System.out.println(CheckNubmer);
        }
    }
}
