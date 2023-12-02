package week_12.assignments.Question_12_14;

import java.io.File;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Question_12_14 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the file's path : ");
        String path = input.nextLine();

        File file = new File(path);

        double total = 0;
        int count = 0;

        try {
            input = new Scanner(file);

            while (input.hasNext()) {
                total += input.nextDouble();
                count++;
            }
            input.close();

            System.out.println("Sum of the numbers : " + total + "\nNumber of integers : " + count + "\nAvrage : " + (total / count));

        } catch (InputMismatchException | IOException ex) {
            if (ex instanceof InputMismatchException) {
                System.out.println("Input is not valid ");
            } else System.out.println("File can't be read");

        }
    }

}
