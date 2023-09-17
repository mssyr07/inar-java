package week_06.assignments;

import java.util.Scanner;

public class Question_06_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Display an integer reversed :");
        System.out.print("Enter an integer : ");
        int number = input.nextInt();

        reverse(number);


    }
    public static void reverse(int number){
        while(number > 0){
            System.out.print(number % 10);
            number /= 10;
        }
        System.out.println();
    }
}
