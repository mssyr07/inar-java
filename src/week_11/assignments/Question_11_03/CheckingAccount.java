package week_11.assignments.Question_11_03;

import week_09.assignments.Account_09_07;

import java.util.Date;

public class CheckingAccount extends Account_09_07 {

    private double overDraftLimit;

    public CheckingAccount() {
        super();
        overDraftLimit = -500;
    }

    public CheckingAccount(int id, double balance, double overDraftLimit) {
        super(id, balance);
        this.overDraftLimit = overDraftLimit;
    }

    public double getOverDraftLimit() {
        return overDraftLimit;
    }

    public void setOverDraftLimit(double overDraftLimit) {
        this.overDraftLimit = overDraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() - amount > overDraftLimit) {
            setBalance(getBalance() - amount);
        } else System.out.println("Limit is -$500 ");
    }

    @Override
    public String toString() {
        return super.toString() + "\nLimit is -$500";
    }
}
