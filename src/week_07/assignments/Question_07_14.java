package week_07.assignments;

import java.util.Scanner;

public class Question_07_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.print("Enter five numbers : ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();

        }
        System.out.println("The greatest common divisor is : " + greatestCommonDivisor(numbers));

    }

    public static int greatestCommonDivisor(int... array) {
        int minNumber = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < minNumber) {
                minNumber = array[i];

            }
        }

        int divisor = 1;
        int gcd = 0;
        boolean isGcd = false;

        while (divisor <= minNumber) {
            for (int i = 1; i < array.length; i++) {
                if (array[i] % divisor == 0) {
                    isGcd = true;
                } else {
                    isGcd = false;
                    break;
                }
            }
            if (isGcd) {
                gcd = divisor;
            }
            divisor++;
        }
        return gcd / 2 ;

    }
}
