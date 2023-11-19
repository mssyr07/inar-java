package week_11.assignments.Question_11_07;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Question_11_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Enter a list of integers ending with 0 : ");
        Integer number = input.nextInt();

        while (number.intValue() != 0) {
            list.add(number);
            number = input.nextInt();

        }

        System.out.println("Before Shuffling ..");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");


        }

        System.out.println("\nAfter Shuffling : ");

        shuffle(list);


    }

    public static void shuffle(ArrayList<Integer> list) {
        Collections.shuffle(list);

        for (int i = 0; i < list.size(); i++) {

            System.out.print(list.get(i) + " ");

        }


    }


}


