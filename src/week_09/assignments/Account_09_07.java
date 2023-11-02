package week_09.assignments;

import java.util.Date;

public class Account_09_07 {

    private int id ;

    private double balance ;

    private double annualInterestRate;

    private Date datecreated ;


    public Account_09_07(){
        id = 0;
        balance = 0;
        annualInterestRate = 0;
        datecreated = new Date();

    }

    public Account_09_07(int id , double balance){
        this.id = id;
        this.balance = balance;
        datecreated = new Date();

    }

    public Date getDatecreated() {
        return datecreated;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public void setDatecreated(Date datecreated) {
        this.datecreated = datecreated;
    }

    public double getMonthlyInterestRate(){
        return annualInterestRate / 12 ;
    }

    public double getMonthlyInterest(){
        return balance * (getMonthlyInterestRate() / 100) ;
    }


    public void withdraw(double amount){
        balance -= amount;
    }

    public void deposit(double amount){
        balance += amount;
    }

    @Override
    public String toString() {
        return "Account Summary " +
                "id = " + id +
                " balance = " + balance +
                " annualInterestRate= " + annualInterestRate +
                " datecreated = " + datecreated ;

    }
}
