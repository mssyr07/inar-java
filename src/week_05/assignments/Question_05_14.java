package week_05.assignments;

import java.util.Scanner;

public class Question_05_14 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer :");
        int firstNumber = input.nextInt();
        System.out.print("Enter second integer :");
        int secondNumber = input.nextInt();

        int greatestCommonDevisor = 0;

        int min = Math.min(firstNumber, secondNumber);

        for (int i = 1; i <= min; i++) {
            if (firstNumber % i == 0 && secondNumber % i == 0) {
                greatestCommonDevisor = i;

            }
        }
        System.out.println("The greatest common divisor for " + firstNumber + " and " + secondNumber + " is : " + greatestCommonDevisor);


    }
}
