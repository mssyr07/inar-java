package week_02.assignments;
import java.util.Scanner;



public class Question_02_11 {

    public static void main( String[]args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of years : ");

        int year = input.nextInt();


        double population = 312.032486;
        double populationChange = ((31.557667 / 7) + (31.557600 / 45) - (31.557600 / 13));

        population += year * populationChange;

        System.out.println(population);




    }
}
