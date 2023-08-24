package week_03.assignment;

import java.util.Scanner;

public class Question_03_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print(" scissor ( 0 ) , rock ( 1 ) , paper ( 2 ) : ");
        int userChoice = input.nextInt();
        ;

        int computerChoice = (int) ((Math.random()) * 2);

        if (userChoice < 0 || userChoice > 2) {
            System.out.println(" Invalid value. Press 0 , 1 , or 2 .");

        }
        if (computerChoice == userChoice) {
            System.out.println(" We have a DRAW here !");

            switch (userChoice) {

                case 0:
                    System.out.println(" Player and Computer both choosed the scissors ");
                    break;
                case 1:
                    System.out.println(" Player and the Computer both choosed the rock ");
                    break;
                case 2:
                    System.out.println(" Player and the Computer both choosed the paper ");
                    break;
            }


        } else {

            switch (userChoice) {
                case 0:
                    System.out.println((computerChoice == 1) ? "The computer is rock. You are scissor. You lost." : " The computer is paper. You are scissor. You won. ");
                    break;
                case 1:
                    System.out.println((computerChoice == 2) ? "The computer is paper. You are rock . You lost." : " The computer is scissor. You are rock. You won . ");
                    break;
                case 2:
                    System.out.println((computerChoice == 0) ? "The computer is scissor. You are paper. You lost." : " The computer is rock. You are paper . You won . ");
                    break;

            }
        }
    }
}
