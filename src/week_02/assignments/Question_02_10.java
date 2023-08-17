package week_02.assignments;
import java.util.Scanner;

public class Question_02_10 {

    public static void main(String[]args){

        Scanner input = new Scanner(System.in);


        System.out.println("Enter the amount of water : ");
        double weight = input.nextDouble();
        System.out.println(" Enter the initial temoerature : ");
        double initTemp = input.nextDouble();
        System.out.println("Enter the final temperature : ");
        double finalTemp = input.nextDouble();

double neededEnergyAmount = weight * (finalTemp-initTemp) * 4184 ;

        System.out.println(" The energy needed is : " + neededEnergyAmount);





    }
}
