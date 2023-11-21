package week_11.assignments.Question_11_10;

import java.util.Scanner;

public class MyStackTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        MyStack stack = new MyStack();

        System.out.print("Enter five integers : ");

        for (int i = 0; i < 5; i++) {
            stack.push(input.nextInt());
        }

        System.out.print("Stack :  " + stack);


        System.out.print("\nDisplaying them in reversing order .. ");
        System.out.println();

        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}
