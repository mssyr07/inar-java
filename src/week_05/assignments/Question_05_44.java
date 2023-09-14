package week_05.assignments;

import java.util.Scanner;

public class Question_05_44 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter an integer: ");
        short number = input.nextShort();

        String bits = "";


        for (int i = 0; i < 16; i++) {
            bits = (number & 1) + bits;
            number >>= 1;
        }

        // Display result
        System.out.println("The bits are " + bits);

    }
}
