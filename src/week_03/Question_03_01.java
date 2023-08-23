package week_03;
import java.util.Scanner;
public class Question_03_01 {

    public static void main(String[]args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a , b , c : ");

        double a = input.nextDouble();
        int b = input.nextInt();
        int c = input.nextInt();

        double delta = (b * b)-(4 * a * c);

        if ( delta > 0 ) {

            double x1 = ((-1 * b) + Math.pow(delta , 0.5)) / (2 * a);
            double x2 = ((-1 * b) - Math.pow(delta , 0.5)) / (2 * a);

            System.out.println("The equation has two roots " + (int)(x1 * 1000000) / 1000000.0 +  "and " + (int)(x2 * 100000) / 100000.0);

        }
        else if (delta == 0) {
            double x = -b / (2 * a) ;

            System.out.println("The equation has one root " + (int)x);

        }

        else if (delta < 0) {

            System.out.println("The equation has no real roots.");

        }



    }
}
