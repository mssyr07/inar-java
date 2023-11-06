package week_09.assignments;

import java.util.Scanner;

public class LinearEquationTest_09_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a , b , c , d , e , f :");

        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();


        LinearEquation_09_11 linearEquation = new LinearEquation_09_11(a, b, c, d, e, f);

        if (linearEquation.isSolvable()) {
            System.out.println("x is : " + linearEquation.getX() + " and y is : " +linearEquation.getY());
        } else
            System.out.println("The equation has no solution");

    }
}
