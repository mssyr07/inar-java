package week_11.assignments.Question_11_12;

import java.util.Scanner;
import java.util.ArrayList;

public class Question_11_12 {
    public static void main(String[] args) {

        ArrayList<Double> list = getList();
        System.out.println("The summation is : " + sum(list));

    }

    public static ArrayList<Double> getList() {
        Scanner input = new Scanner(System.in);
        ArrayList<Double> list = new ArrayList<>();

        System.out.print("Enter five Numbers : ");

        for (double i = 0; i < 5; i++) {
            double number = input.nextDouble();
            list.add(number);
        }
        return list;

    }

    public static double sum(ArrayList<Double> list) {
        double total = 0;
        for (double i : list) {
            total += i;
        }
        return total;
    }


}
