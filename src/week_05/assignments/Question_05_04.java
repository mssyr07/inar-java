package week_05.assignments;

import java.util.Scanner;

public class Question_05_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Miles" + "                  " + "Kilometers");

        for(int i = 1 ; i < 11 ; i++){
            System.out.println(i + "                            " + (i*1609));
        }
    }
}
