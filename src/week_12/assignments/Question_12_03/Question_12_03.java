package week_12.assignments.Question_12_03;

import java.util.Scanner;

public class Question_12_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] array = getArray();
        System.out.print("Enter the index : ");

        try {
            System.out.println("The corresponding value is : " + array[input.nextInt()]);

        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("It s out of bounds. Try Again");
        }
    }

    public static int[] getArray() {
        int[] array = new int[100];

        for (int i = 0; i < 100; i++) {
            array[i] = (int) ((Math.random() * 100) + 1);
        }
        return array;
    }
}
