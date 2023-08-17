package week_02.assignments;
import java.util.Scanner ;


public class Question_02_14 {

    public static void main(String[]args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter  weıght in pounds : ");
        double weight = input.nextDouble();
        weight = weight * 0.45359237;

        System.out.println("Enter height in inches : ");
        double height = input.nextDouble();
        height = height * 0.0254;

        double bmi = weight / Math.pow(height , 2);

        System.out.println( " BMI is " + bmi);

    }
}
