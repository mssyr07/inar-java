package week_03.assignment;

import java.util.Scanner;

public class Question_03_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print(" Enter the weight of the package (in pounds) : ");
        int weight = input.nextInt();
        double cost = 0.0;

        if (weight < 0 || weight == 0) {
            System.out.println("Invalid weight ");
        }
        if (weight <= 1 && weight > 0) {
            cost = weight * 3.5;
            System.out.println("Shipping cost of package is $" + cost);

        } else if (weight <= 3 && weight > 1) {
            cost = weight * 5.5;
            System.out.println("Shipping cost of package is $" + cost);


        } else if (weight <= 10 && weight > 3) {
            cost = weight * 8.5;
            System.out.println("Shipping cost of package is $" + cost);

        } else if (weight < 20 && weight > 10) {
            cost = weight * 10.5;
            System.out.println("Shipping cost of package is $" + cost);
        } else {
            System.out.println("The package cannot be shipped ");
        }
    }
}






