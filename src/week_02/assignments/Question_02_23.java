package week_02.assignments;
import java.util.Scanner;
public class Question_02_23 {

    public static void main(String[]args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter driving in distance : ");
        double distance = input.nextDouble();

        System.out.println("Enter miles in per galon : ");
        double miles = input.nextDouble();

        System.out.println("Enter price per galon : ");
        double price = input.nextDouble();

        double cost = (distance / miles ) * price;

        System.out.println(" The cost of driving : " + (int)(cost * 100) / 100.0);

    }
}
