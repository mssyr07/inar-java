package week_12.assignments.Question_12_11;

import java.util.Scanner;

import java.io.File;
                                                        ////////////
import java.io.PrintWriter;

import java.io.IOException;

import java.util.ArrayList;



public class Question_12_11 {
    public static void main(String[] args) {

        //Check the peogram whether it works properly//

        if (args.length != 2){
            System.out.println("Usage : Java Question_12_11 John filename");
            System.exit(1);
        }

        // Checks whether the file exist //

        File myFile = new File(args[1]);
        if (!myFile.exists()){
            System.out.println(args[1] + " doesnt exist");
            System.exit(2);
        }

        // Creates a list to keep the text in the folder//
        ArrayList<String> contents = new ArrayList<>();

        try {
            //Creates a scanner to read the file//
            Scanner input = new Scanner(System.in);

            //Read the text line-by-line till the end//
            while (input.hasNext()){
                String s1 = input.nextLine();

                //Removes the contents which occurs with the first arg//
                String s2 = s1.replaceAll(args[0], " " );

                //Add the changed content to Arraylist//
                contents.add(s2);

            }

            //Closes Scanner//
            input.close();

            //Creates a Printwriter to write the list//
            PrintWriter output = new PrintWriter(myFile);

            //Displays all the elements in the list //
            for (int i = 0; i < contents.size(); i++){
                output.println(contents.get(i));

            }

            //Closes the Printwriter//
            output.close();

        }catch (IOException ex){
            //Displays the exception message in case of an Exception//
            System.out.println(ex.getMessage());

        }
    }
}
