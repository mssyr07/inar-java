package week_06.assignments;
import java.util.Scanner;
public class Question_06_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter a string: ");
        String string = input.nextLine();


        System.out.println(
                "The number of letters in the string \"" +
                        string + "\": " + countLetters(string));
    }

    /** Method countLetters counts the number of letters in a string */
    public static int countLetters(String s) {
        int numberOfLetters = 0;
        for (int i = 0; i < s.length(); i++) {

            if (Character.isLetter(s.charAt(i)))
                numberOfLetters++;
        }
        return numberOfLetters;
    }
}
