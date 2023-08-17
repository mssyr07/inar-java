package week_02.assignments;
import java.util.Scanner;

public class Question_02_05 {
    public static void main(String [] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the subtotal and gratuity rate : ");
        int subtotal = input.nextInt();
        double gratuity = input.nextInt();

        double totalGratuity = gratuity / subtotal ;
        double total = totalGratuity + subtotal ;

        System.out.println(" The gratuity is $" + totalGratuity + " and total is $"+total);

    }
}
