package week_12.assignments.Question_12_12;

import java.io.File;
import java.io.PrintWriter;                         //////////
import java.util.ArrayList;
import java.util.Scanner;

public class Question_12_12 {
    public static void main(String[] args) {

        if (args.length != 1) {
            System.out.println("Usage : java Question_12_12 filename");
            System.exit(1);
        }

        File myFile = new File(args[0]);
        if (!myFile.exists()) {
            System.out.println("Source " + args[0] + "doesnt exist ");
            System.exit(2);


        }

        ArrayList<String> contents = new ArrayList<>();


        try {
            Scanner input = new Scanner(System.in);

            while (input.hasNext()) {
                String s1 = input.nextLine();
                contents.add(s1);


            }

            input.close();

            PrintWriter output = new PrintWriter(myFile);

            for (int i = 0; i < contents.size() - 1; i++) {
                if (contents.get(i + 1).contains("{")) {
                    output.println(contents.get(i) + " " + contents.get(i + 1).trim());
                    i++;
                } else output.println(contents.get(i));
            }

            output.println(contents.size() - 1);


            output.close();


        } catch (Exception ex) {
            System.out.println("Caused error");
        }
    }
}
