import java.io.IOException;

/**
// Task_11 Isosceles Triangle
// *	Write a program that prints an isosceles triangle of 9 copyright symbols `©`, something like this:
//
// ```
//    ©
//   © ©
//  ©   ©
// © © © ©
// ```
//
// _Note:  The `©` symbol may be displayed incorrectly at the console so you may need to change the console character
// encoding to `UTF-8` and assign a Unicode-friendly font in the console._
//
// _Note:  Under old versions of Windows the `©` symbol may still be displayed incorrectly,
// regardless of how much effort you put to fix it._

 */
public class Task_11 {

    public static void main(String[] args) throws IOException {


        String a = "© ";
        Integer rows = 6;

        for (int p = rows; p > 0; p--) {
            for (int i = 1; i <= rows - p; i++) {
                System.out.print(a);
            }

            System.out.println();
        }

        System.out.println("---------------------");
        for (int x = rows; x > 0; x--) {


            for (int y = 1; y <= 1+ x; y++) {
                System.out.print(" ");
            }
            for (int y = 1; y <= rows - x; y++) {
                System.out.print(a);
            }

            System.out.println();
        }

        System.out.println("---------------------");
//        for (int x = 1; x <= rows; x++) {
//
//            for (int y = 1; y <= rows; y++) {
//
//               if ((y == (rows/2-x/2)) || (y == (rows/2+x/2)) || (x==rows)){
//                   System.out.print(a);
//                }else{
//                   System.out.print(" ");
//                }
//
//            }
//
//            System.out.println();
//        }
        System.out.println("---------------------");
    }
}