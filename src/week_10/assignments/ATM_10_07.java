package week_10.assignments;

import week_09.assignments.Account_09_07;

import java.util.Scanner;

public class ATM_10_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Account_09_07[] accounts = new Account_09_07[10];
        initialBalance(accounts);

        do {
            System.out.print("Enter an id : ");
            int id = input.nextInt();

            if (isValid(id, accounts)) {
                int choice;
                do {

                    choice = displayMenu(input);
                    if (isTransaction(choice)){
                        executeTransaction(choice,accounts,id,input);
                    }

                }while (choice != 4);
            }

        }while (true);


    }

    public static void initialBalance(Account_09_07[] accounts) {
        int initialBalance = 100;
        for (int i = 0; i < accounts.length; i++) {
            accounts[i] = new Account_09_07(i, initialBalance);
        }
    }

    public static boolean isValid(int id, Account_09_07[] account) {
        for (int i = 0; i < account.length; i++) {
            if (id == account[i].getId()) {
                return true;
            }
        }
        return false;
    }

    public static int displayMenu(Scanner input) {
        System.out.print("\nMain menu\n1: check balance\n2: withdraw" +
                "\n3: deposit\n4: exit\nEnter a choice: ");
        return input.nextInt();

    }

    public static boolean isTransaction(int choice){
        return choice > 0 && choice < 4;
    }

    public static void executeTransaction(int choice , Account_09_07[] account , int id , Scanner input){
        switch (choice){
            case 1 :
                System.out.print("The Balance is : " + account[id].getBalance());
                break;

            case 2 :
                System.out.print("Enter an amount to withdraw : ");
                account[id].withdraw(input.nextDouble());
                break;

            case 3:
                System.out.print("Enter an amount to deposit : ");
                account[id].deposit(input.nextDouble());
                break;
        }
    }
}
