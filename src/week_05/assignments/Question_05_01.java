package week_05.assignments;
import java.util.Scanner;

public class Question_05_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int positiveCount = 0;
        int negativeCount = 0;

        int sum = 0;
        double average = 0;


        System.out.print("Enter an integer , the input ends if it s 0 : ");

        int value = input.nextInt();

        while (value != 0 ){
            if (value > 0  ){
                positiveCount++;
            }else if ( value < 0 ){
                negativeCount++;
            }
            sum += value ;

        }
        average = sum / (positiveCount + negativeCount);

        System.out.println("The number of Positives is : " + positiveCount);
        System.out.println("The number of Negatives is : " + negativeCount);
        System.out.println("The total is : " + sum);
        System.out.println("The average is : " + average );
    }
}
