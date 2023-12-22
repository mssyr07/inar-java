package week_12.assignments.Question_12_13;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;



public class Question_12_13 {
    public static void main(String[] args) {

        if (args.length != 1) {
            System.out.println("Usage : Java Question_12_13 filename");
            System.exit(1);
        }
        File myFile = new File(args[1]);
        if (!myFile.exists()) {
            System.out.println("source " + args[1] + "doesnt exist");
            System.exit(2);
        }

        ArrayList<String> lines = new ArrayList<>();
        ArrayList<String> words = new ArrayList<>();

        try {
            Scanner input = new Scanner(System.in);

            while (input.hasNext()) {
                String s1 = input.nextLine();
                lines.add(s1);
            }
            input.close();

            Scanner input2 = new Scanner(System.in);

            while (input.hasNext()) {
                String s2 = input2.next();
                words.add(s2);

            }

            input.close();


            int totalCharacters = 0;

            for (int i = 0; i < lines.size(); i++) {
                totalCharacters += lines.get(i).length();
            }

            System.out.println("File " + args[0] + " has");
            System.out.println(totalCharacters + " characters");
            System.out.println(words.size() + " words");
            System.out.println(lines.size() + " lines");

        } catch (Exception ex) {
            System.out.println("Error");
        }
    }
}
