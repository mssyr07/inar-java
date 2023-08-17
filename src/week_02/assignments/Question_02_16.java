package week_02.assignments;
import java.util.Scanner;
public class Question_02_16 {
    public static void main(String[]args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the side : ");
        double  side = input.nextDouble();

        double area = (( Math.pow(27, (double) 1 /2)) / 2 ) * Math.pow(side , 2 );

        System.out.println(area);
    }
}
