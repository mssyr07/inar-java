package week_05.assignments;

import java.util.Scanner;

public class Question_05_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double monthlyInterestRate = 5.000;

        System.out.print("Enter the loan amount : ");
        int loanAmount = input.nextInt();


        System.out.print("Number of years : ");
        int numberOfYears = input.nextInt();

        double monthlyPayment = loanAmount * monthlyInterestRate / (1
                - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
        double totalPayment = monthlyPayment * numberOfYears * 12;

        System.out.println("Interest Rate " + " Monthly Payment " + " Total Payment ");

        for(int i = 1; i <= numberOfYears && monthlyInterestRate <= 8.0; i++){
            System.out.println(monthlyInterestRate + "  " + monthlyPayment + "  " + totalPayment);

            monthlyInterestRate += 0.125;



        }
    }
}
