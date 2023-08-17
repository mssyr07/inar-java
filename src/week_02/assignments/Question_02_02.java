package week_02.assignments;
import java.util.Scanner;

public class Question_02_02 {

    public static void main(String[]args) {

        final double PI = 3.14;

        Scanner input = new Scanner (System.in);

        System.out.println( " Enter the radius and length of a cylender : ");
        double radius = input.nextDouble();
        int length = input.nextInt();

        double area = radius * radius  * PI;
        double volume = area * length;


        System.out.println(" The area is : "+ area);
        System.out.println(" The volume is : " + volume);







    }
}




