package week_04.assignments;

import java.util.Scanner;

public class Question_04_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of sides : ");
        int numberOfSides = input.nextInt();

        System.out.print("Enter the side length : ");
        double sideLength = input.nextDouble();

        double area = (numberOfSides * Math.pow(sideLength, 2)) / (4 * Math.tan(Math.PI / numberOfSides));

        System.out.println("The area of the polygon is :  " + (int) (area * 100) / 100.0);

    }
}
