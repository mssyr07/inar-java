package week_11.assignments.Question_11_08;
import week_11.assignments.Question_11_08.Account_11_08;
import week_11.assignments.Question_11_03.Transactions;
import java.util.ArrayList;

public class Question_11_08 {
    public static void main(String[] args) {

        Account_11_08 account = new Account_11_08("George",1122,1000);


        account.deposit(30);
        account.deposit(40);
        account.deposit(50);

        account.withdraw(5);
        account.withdraw(4);
        account.withdraw(2);

        ArrayList<Transactions> transactions = account.getTransactions();
        System.out.println("\nThe Account : ");

        for (int i = 0; i < transactions.size(); i++){
            if (i != transactions.size() - 1){
                System.out.println(transactions.get(i) + "\n");
            }else System.out.println(transactions.get(i));
        }

    }
}
