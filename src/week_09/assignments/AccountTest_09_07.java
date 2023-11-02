package week_09.assignments;

public class AccountTest_09_07 {
    public static void main(String[] args) {

        Account_09_07 newAccount = new Account_09_07(1122 , 20000);

        newAccount.setAnnualInterestRate(4.5);

        newAccount.withdraw(2500);

        newAccount.deposit(3000);

        System.out.println(newAccount.toString());

    }
}
