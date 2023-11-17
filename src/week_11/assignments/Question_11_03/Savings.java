package week_11.assignments.Question_11_03;

import week_09.assignments.Account_09_07;

public class Savings extends Account_09_07 {

    public Savings(){
        super();
    }

    public Savings(int id,double amount){
        super(id,amount);
    }

    public void withdraw(double amount){
        if (amount < getBalance()){
            setBalance(getBalance() - amount);
        }
        else System.out.println("Not enough savings for that.");

    }

    @Override
    public String toString() {
        return "Savings{}";
    }
}
