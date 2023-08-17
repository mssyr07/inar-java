package week_02.assignments;
import java.util.Scanner;


public class Question_02_06 {

    public static void main(String[]args){

        Scanner input = new Scanner(System.in);

        System.out.println(" Enter a number between 0 and 1000 : ");

        int number = input.nextInt();

        int total = number % 10 ;

        number = number / 10 ;

        total += number % 10 ;

        number = number /10 ;

        total +=  number % 10 ;

        System.out.println(" The sum of the digits is " + total);


    }
}
