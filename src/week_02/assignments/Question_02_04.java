package week_02.assignments;

import java.util.Scanner;
public class Question_02_04 {

    public static void main(String[]args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number in pounds : ");
        double pound = input.nextDouble();

        double convention = pound* 0.454 ;

        System.out.println( pound + " pounds is " + convention + " kilograms" );

    }


}