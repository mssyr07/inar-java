package week_03.assignment;

import java.util.Scanner;

public class Question_03_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter three edges of the triangle :");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        double perimeter = a + b + c;

        if ((a + b) > c && (a + c) > b && (b + c) > a) {
            System.out.println("The perimeter is " + perimeter);
        } else {
            System.out.println("The input is invalid");

        }
    }
}
