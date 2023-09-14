package week_05.assignments;
import java.util.Scanner;

public class Question_05_08 {
    public static void main(String[] args) {
                                                                            /////////

        double highScore = 0, secondHigh = 0;

        String highName = "";
        String name = "";
        String tempName = "";
        String result = "";
        String currentStudent ="";
        double tempScore = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");

        int numStudents = input.nextInt();

        System.out.print("Enter a students name: ");
        name = input.next();

        System.out.print("Enter the students score: ");
        highScore = input.nextDouble();

        for (int i = 1; i <= numStudents; i++) {
            System.out.print("Enter a students name: ");
            tempName = input.next();

            System.out.print("Enter the students score: ");
            tempScore = input.nextDouble();

            if (tempScore > highScore) {
                highScore = tempScore;
                highName = name;

                numStudents--;
                continue;
            }


            numStudents--;

            currentStudent = "Student : " + i + "Name : " + name + "Score : " + tempScore ;
            result += currentStudent;
        }
        System.out.println(result);
        System.out.println("Student wit the highest score : ");
        System.out.print(highName);

    }
}
