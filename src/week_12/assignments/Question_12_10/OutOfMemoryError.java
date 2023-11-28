package week_12.assignments.Question_12_10;

import java.util.ArrayList;

public class OutOfMemoryError {
    public static void main(String[] args) {


        ArrayList<String> list = new ArrayList<>();

        int i = 0;

        boolean isTrue = true;


        while (isTrue) {

            try {


                String statement = new String(i + "Fenerbahçe");
                i++;
                list.add(statement);
            } catch (java.lang.OutOfMemoryError ex) {
                System.out.println(ex.getMessage());

                System.out.println("outOfMemoryException occurs! : Java heap space");
                isTrue = false;
            }

        }          // Wait for 10 seconds approximately to see the result //
    }
}
