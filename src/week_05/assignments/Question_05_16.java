package week_05.assignments;

import java.util.Scanner;

public class Question_05_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = input.nextInt();

        for (int i = 2; num / i > 0; ) {

            if (num % i == 0) {
                System.out.print(i + ",");
                num = num / i; //Remove the factor from num
            } else {
                //Iterate to next possible factor
                i++;
            }


        }
    }
}
