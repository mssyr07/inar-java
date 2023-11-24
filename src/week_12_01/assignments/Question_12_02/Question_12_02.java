package week_12_01.assignments.Question_12_02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Question_12_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter two integers to sum : ");
        boolean flag = true;

        try {
            int number1 = input.nextInt();
            int number2 = input.nextInt();

            System.out.println("Sum of " + number1 + " + " + number2 + " = " + (number1+number2));
            flag = false;
        }
        catch (InputMismatchException ex){
            System.out.println(ex.getClass().toString().substring(6));
            System.out.println("Wrong input ! Please input integers");
            input.nextLine();
        }

    }
}
