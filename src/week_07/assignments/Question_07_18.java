package week_07.assignments;

import java.util.Scanner;

public class Question_07_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] numbers = new double[10];

        System.out.print("Enter ten double numbers : ");
        for (int i = 0 ; i < numbers.length; i++){
            numbers[i] = input.nextDouble();


        }
        bubbleSort(numbers);
        for(double e : numbers){
            System.out.print(" " + e);

        }
    }

    public static void bubbleSort(double[] array) {
        for (int i  = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    double temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
