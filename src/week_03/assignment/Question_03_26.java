package week_03.assignment;
/////
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Question_03_26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer :");
        int number = input.nextInt();
        boolean trueOrFalse ;

        System.out.println( (number % 5 == 0 ) && (number % 6 == 0) ? "Is " + number + " divisible by 5 and 6 ? true" : "Is " + number + " divisible by 5 and 6 ? false");
        System.out.println( (number % 5 == 0 ) || (number % 6 == 0) ? "Is " + number + " divisible by 5 or 6 ? true" : "Is " + number + " divisible by 5 or 6 ? false");
        System.out.println( (number % 5 == 0 )  ^  (number % 6 == 0) ? "Is " + number + " divisible by 5 or 6 , but not both ? true" : "Is " + number + " divisible by 5 or 6 , but not both ? false");




    }
}
