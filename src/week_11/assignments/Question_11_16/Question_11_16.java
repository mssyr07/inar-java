package week_11.assignments.Question_11_16;

import java.util.ArrayList;
import java.util.Scanner;

public class Question_11_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number1 = (int)(Math.random() * 10);
        int number2 = (int)(Math.random() * 10);

        ArrayList<Integer> answerList = new ArrayList<>();

        System.out.print("What is " + number1 + " + " + number2 + " ? : ");
        int answer = input.nextInt();


        while (answer != number1 + number2){
            if (!answerList.contains(answer)){
                answerList.add(answer);
                System.out.println("Sorry , it's wrong ");
            }
            else System.out.println("You've already entered it ");

            System.out.println("What is " + number1 + " + " + number2 + " ? : ");
            answer = input.nextInt();

        }
        System.out.println("You got it ! ");
    }
}
