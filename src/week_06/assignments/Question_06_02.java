package week_06.assignments;

import java.util.Scanner;

public class Question_06_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number you want to sum it s digits : ");
        long number = input.nextLong();

        System.out.print(" The summation of the number is ");
        System.out.print(sumDigits(number));


    }

    public static int sumDigits(long n) {
        int sum = 0;

        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }

        return sum;


    }
}
