package week_02.assignments;
import java.util.Scanner;
public class Question_02_09 {

    public static void main(String[]args){

        Scanner input = new Scanner(System.in);

        System.out.println(" Enter v0, v1 and t : ");
        double v0 = input.nextDouble();
        double v1 = input.nextDouble();
        double time =input.nextDouble();

        double averageAcceleration = (v1-v0) / time ;

        System.out.println(" The average acceleration = " + averageAcceleration);



    }
}
