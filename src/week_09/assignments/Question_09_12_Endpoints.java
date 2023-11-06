package week_09.assignments;

import java.util.Scanner;

public class Question_09_12_Endpoints {                             // Check it back. Not sure. //
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter four endpoints for two lines: x1, y1, x2, y2, x3, y3, x4, y4: ");

        double[] numbers = new double[8];
        for (int i = 0; i < 8; i++) {
            numbers[i] = input.nextDouble();
        }
        double a = numbers[1] - numbers[3];
        double b = -(numbers[0] - numbers[2]);
        double c = numbers[5] - numbers[7];
        double d = -(numbers[4] - numbers[6]);
        double e = (numbers[1] - numbers[3]) * numbers[0] - (numbers[0] - numbers[2]) * numbers[1];
        double f = (numbers[5] - numbers[7]) * numbers[4] - (numbers[4] - numbers[6]) * numbers[5];

        LinearEquation_09_11 linearEquation = new LinearEquation_09_11(a, b, c, d, e, f);

        if (linearEquation.isSolvable()) {
            System.out.printf("The intersecting point is at (" + linearEquation.getX() + " and " +
                    linearEquation.getY() + " ) ");

        } else {
            System.out.println("The equation does not have a solution with the points provided.");


        }


    }
}
