package week_02.assignments;
import java.util.Scanner;

public class Question_02_13 {

    public static void main(String[]args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a monthly saving amount : ");

        double amount = input.nextDouble();

        final double RATE = 1 + 0.00417;

        double value = amount * RATE ;

        value =(amount + value) * RATE;
        value =(amount + value) * RATE;
        value =(amount + value) * RATE;
        value =(amount + value) * RATE;
        value =(amount + value) * RATE;

        System.out.println("After 6 months , the account value is $" + (int)(value * 100) / 100.0 );


                                         // DOĞRU AMA TEKRAR ÇALIŞ///


    }
}
