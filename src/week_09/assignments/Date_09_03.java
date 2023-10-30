package week_09.assignments;

import java.util.Date;

public class Date_09_03 {
    public static void main(String[] args) {


        // could be also imported as :  java.util.Date date = new java.util.Date();
        Date date = new Date();

        for (long elapsedTime = 10000; elapsedTime <= 100000000000L; elapsedTime *= 10) {
            date.setTime(elapsedTime);
            System.out.print("For elapsed " + elapsedTime + " time is : ");
            System.out.println(date.toString());
        }
    }
}
