package week_12.assignments.Question_12_16;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Question_12_16 {
    public static void main(String[] args) {

        if (args.length != 3) {
            System.out.println("Usage: java Question_12_16 file oldStr newStr");
            System.exit(1);
        }

        File sourceFile = new File(args[0]);
        if (!sourceFile.exists()) {
            System.out.println("\"Source file \" + args[0] + \" does not exist\"");
            System.exit(2);
        }

        try {
            ArrayList<String> list = new ArrayList<>();
            Scanner input = new Scanner(sourceFile);

            while (input.hasNext()) {
                String s1 = input.nextLine();
                String s2 = s1.replaceAll(args[2], args[3]);
                list.add(s2);
            }
            input.close();

            PrintWriter output = new PrintWriter(sourceFile);
            for (int i = 0; i < list.size(); i++) {
                output.println(list.get(i));
            }

            output.close();


        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
