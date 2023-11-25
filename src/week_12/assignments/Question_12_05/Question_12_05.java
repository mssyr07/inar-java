package week_12.assignments.Question_12_05;

import java.util.Scanner;

public class Question_12_05 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Three Sides of Triangle : ");

        int side1 = input.nextInt();
        int side2 = input.nextInt();
        int side3 = input.nextInt();

        try {
            TriangleWıthException triangle = new TriangleWıthException(side1,side2,side3);
            System.out.println(triangle);
            System.out.println("Perimeter : " + triangle.getPerimeter());
            System.out.println("Area      : " + triangle.getArea());
        }
        catch (IllegalTriangleException ex) {
            System.out.println("Sum of every two sides must be greater than the 3rd side ");
            ex.printStackTrace();
        }

    }
}
