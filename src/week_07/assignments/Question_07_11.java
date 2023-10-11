package week_07.assignments;

import java.util.Scanner;

public class Question_07_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[10];

        System.out.print("Enter ten numbers : ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }
        System.out.println("The mean is : " + mean(numbers));
        System.out.println("The standart deviation is " + deviation(numbers));

    }

    public static double deviation(double[] array) {
        double deviation = 0;
        double mean = mean(array);

        for (double i : array) {
            deviation += Math.pow(i - mean, 2);
        }

        return (int) (Math.sqrt(deviation / array.length - 1) * 100) / 100.0;
    }

    public static double mean(double[] array) {
        double mean = 0;
        for (double i : array) {
            mean += i;
        }
        return (int) ((mean / array.length) * 100000) / 100000.0;
    }
}
