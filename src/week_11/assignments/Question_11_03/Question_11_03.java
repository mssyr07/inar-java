package week_11.assignments.Question_11_03;

import week_09.assignments.Account_09_07;

public class Question_11_03 {
    public static void main(String[] args) {

        Account_09_07 account = new Account_09_07(1122,2000);
        Savings saving = new Savings(1122,5000);
        CheckingAccount checking = new CheckingAccount(1122,1000,500);

        System.out.println(account.toString());
        System.out.println(saving.toString());
        System.out.println(checking.toString());

        checking.withdraw(2500);
        saving.withdraw(2000);
        System.out.println(saving.getBalance());

        checking.withdraw(2999);
        System.out.println(account.getBalance());

    }
}
