package week_06.assignments;
import java.util.Scanner;

public class Question_06_36 {
    public static void main(String[] args) {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);


            System.out.print("Enter the number of sides: ");
            int n = input.nextInt();
            System.out.print("Enter the side: ");
            double side = input.nextDouble();


            System.out.println("The area of the polygon is " + area(n, side));

        }

        /** Method area computes and returns the area of a regular polygon */
        public static double area(int n, double side) {
            return (n * Math.pow(side, 2) / (4 * Math.tan(Math.PI / n)));
    }
}
