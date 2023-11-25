package week_12.assignments.Question_12_04;

import java.util.Date;

public class Loan {

    private double annualInterestRate;

    private int numberOfYears;

    private double loanAmount;

    private Date date;


    public Loan() {
        this(2.5, 1, 1000);
    }

    public Loan(double annualInterestRate, int numberOfYears, double loanAmount) throws IllegalArgumentException {

        if (annualInterestRate <= 0 || numberOfYears <= 0 || loanAmount <= 0 ){
            throw new java.lang.IllegalArgumentException("");
        }

        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
        this.date = date;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public int getNumberOfYears() {
        return numberOfYears;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public Date getDate() {
        return date;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public void setNumberOfYears(int numberOfYears) {
        this.numberOfYears = numberOfYears;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getMonthlyPayment() {
        double monthlyAmountRate = annualInterestRate / 1200;
        double monthlyPayment = loanAmount * monthlyAmountRate /
                (1 - (1 / Math.pow(1 + monthlyAmountRate, numberOfYears * 12)));
        return monthlyPayment;
    }

    public double getTotalPayment() {
        double totalPayment = getMonthlyPayment() * numberOfYears * 12;
        return totalPayment;
    }
}
