package week_05.assignments;

import java.util.Scanner;

public class Question_05_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        double startTime = System.currentTimeMillis();
        String correctAnswers = "";
        String wrongAnswers = "";
        String record = "";
        int numberOfCorrect = 0;
        int numberOfWrong = 0;

        for (int i = 0; i < 10; i++) {

            int value1 = (int) (Math.random() * 14 + 1);
            int value2 = (int) (Math.random() * 14 + 1);

            System.out.print("What is " + value1 + " + " + value2 + " ? ");
            int answer = input.nextInt();

            if (answer == value1 + value2) {
                System.out.println("You re correct ! ");
                numberOfCorrect++;

                record = "" + value1 + " + " + value2 + " = " + answer + " correct" + '\n';
                correctAnswers += record;


            } else if (answer != value1 + value2) {

                System.out.println("Your answer is wrong !");
                System.out.println(value1 + " + " + value2 + " should be " + (value1 + value2));
                numberOfWrong++;

                record = "" + value1 + " + " + value2 + " = " + answer + " wrong " + '\n';
                wrongAnswers += record;
            }


        }

        double finishingTime = System.currentTimeMillis();
        int testTime = (int) (finishingTime / 1000) - (int) (startTime / 1000);


        System.out.println("Test time is " + testTime + "seconds" + '\n');

        System.out.println("Correct count is " + numberOfCorrect);
        System.out.println(correctAnswers);


        System.out.println("Wrong count is " + numberOfWrong);
        System.out.println(wrongAnswers);


    }
}
