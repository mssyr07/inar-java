package week_07.assignments;

import java.util.Scanner;

public class Question_07_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[10];
        System.out.print("Enter ten numbers : ");
        for (int i = 0; i < 10; i++) {
            numbers[i] = input.nextInt();

        }

        reverse(numbers);
        for (int e : numbers) {
            System.out.print(e + " ");
        }


    }

    public static int[] reverse(int[] array) {
        for (int i = 0, j = array.length - 1; i < j; i++, j--) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;

        }
        return array;
    }
}
