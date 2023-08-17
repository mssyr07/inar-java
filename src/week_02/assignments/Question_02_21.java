package week_02.assignments;
import java.util.Scanner;


public class Question_02_21 {
    public static void main(String[]args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter investment amount : ");
        double investmentAmount = input.nextDouble();

        System.out.println("Enter annual interest rate in percentage ");
        double annualInterestRate = input.nextDouble();

        System.out.println("Enter number of year : ");
        int numberOfYears = input.nextInt();


        double futureInvestmentValue = investmentAmount * Math.pow((1 + (annualInterestRate / 1200)) , numberOfYears * 12 );
        System.out.println("Accumulated value is $"+(int)(futureInvestmentValue * 100) / 100.0);
    }
}
