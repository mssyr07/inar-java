package week_06.assignments;

import java.util.Scanner;

public class Question_06_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("The amount invested : ");
        double amount = input.nextInt();
        System.out.print("Annual Interest Rate : ");
        double annualInterestRate = input.nextInt();

        double monthlyInterestRate = annualInterestRate / 1200;
        int numberOfYears = 30;


        System.out.println(" Years      Future Value ");

        for (int year = 1; year <= numberOfYears; year++) {
            System.out.println(" " +  year + "           " + (int)(futureInvestmentValue(amount, monthlyInterestRate, year) * 100) / 100.0);

        }


    }

    public static double futureInvestmentValue(
            double investmentAmount, double monthlyInterestRate, int years) {
        return investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);
    }
}


