package week_03.assignment;
import java.util.Scanner;
public class Question_03_02 {

    public static void main(String[]args){

        Scanner input = new Scanner(System.in);

        int a = (int)System.currentTimeMillis() % 10 ;
        int b = (int)(System.currentTimeMillis()) / 5 % 10;
        int c = (int)(System.currentTimeMillis()) / 7 % 10;

        System.out.println("What is " + a  + " + " + b +" + " + c + " = ?" );

        int answer = input.nextInt();

        System.out.println( a + " + " + b + " + " +  c  + " = " + answer + " is " + (a+b+c == answer));


    }
}
