package week_07.assignments;

import java.util.Scanner;

public class Question_07_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter ten numbers : ");
        double[] numbers = new double[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();

        }

        revisedSelectionSort(numbers);
        for (double i : numbers) {
            System.out.print(i + " ");

        }
    }

    public static void revisedSelectionSort(double[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            double currentMax = array[i];
            int currentMaxIndex = i;

            for (int j = i - 1; j >= 0; j--) {
                if (array[j] > currentMax) {
                    currentMax = array[j];
                    currentMaxIndex = j;
                }
            }
            if (currentMaxIndex != i) {
                array[currentMaxIndex] = array[i];
                array[i] = currentMax;
            }
        }
    }
}
