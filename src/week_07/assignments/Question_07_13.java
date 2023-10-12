package week_07.assignments;

import java.util.Scanner;

public class Question_07_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] excludedNumbers = new int[10];

        System.out.print("Enter ten numbers to exclude from the random : ");
        for (int i = 0; i < 10; i++) {
            excludedNumbers[i] = input.nextInt();


        }
        System.out.println("Number generated : " + getRandomNumbers(excludedNumbers));

    }

    public static int getRandomNumbers(int...numbers){
        boolean isSame = true;
        int number = 0;
        while (isSame) {
            number = (int) (Math.random() * 53 + 1);
            for (int i = 0; i < numbers.length; i++) {
                if (number == numbers[i]) {
                    isSame = true;
                    break;
                } else {
                    isSame = false;
                }
            }
        }
        return number;
    }
}
