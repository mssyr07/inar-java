package week_02.assignments;

import java.util.Scanner;

public class Question_02_20 {

    public static void main(String[]args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter balance and interest rate : ");

        int balance = input.nextInt();
        double annualIntersetRate = input.nextDouble();

        double interest = balance * (annualIntersetRate / 1200);

        System.out.println(" The interest is : " + interest);



    }
}
