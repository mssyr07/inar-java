package week_07.assignments;

import java.util.Scanner;

public class Question_07_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of Students : ");
        int[] numberOfStudents = new int[input.nextInt()];

        char[] grades = new char[numberOfStudents.length];


        System.out.print("Enter " + numberOfStudents.length + " scores : ");
        for (int i = 0; i < numberOfStudents.length; i++) {
            numberOfStudents[i] = input.nextInt();


        }

        getTheGrade(numberOfStudents, grades);

        //displaying the results
        for (int i = 0; i < numberOfStudents.length; i++) {
            System.out.println("Student " + i + " score is " + numberOfStudents[i] + " and the grade is " + grades[i]);


        }
    }

    public static int maxGrade(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static void getTheGrade(int[] studentScore, char[] theGrade) {
        int bestGrade = maxGrade(studentScore);

        for (int i = 0; i < studentScore.length; i++) {
            if (studentScore[i] >= bestGrade - 10) {
                theGrade[i] = 'A';

            } else if (studentScore[i] >= bestGrade - 20) {
                theGrade[i] = 'B';

            } else if (studentScore[i] >= bestGrade - 30) {
                theGrade[i] = 'C';
            } else if (studentScore[i] >= bestGrade - 40) {
                theGrade[i] = 'D';


            } else theGrade[i] = 'F';

        }
    }


}