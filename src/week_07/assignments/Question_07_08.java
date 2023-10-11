package week_07.assignments;

import java.util.Arrays;
import java.util.Scanner;

public class Question_07_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] intArray = new int[10];
        double[] doubleArray = new double[10];

        System.out.print("Enter ten integer values : ");
        for (int i = 0; i < doubleArray.length; i++) {
            doubleArray[i] = input.nextDouble();

        }
        System.out.println("The average of the values is : " + average(doubleArray));

    }

    public static double average(double[] array) {
        double sum = 0.0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];

        }
        return sum / array.length;
    }

    public static int average(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum / array.length;
    }
}

