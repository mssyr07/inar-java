package week_11.assignments;

import java.util.Scanner;
import java.util.ArrayList;

public class Question_11_13 {
    public static void main(String[] args) {

        ArrayList<Integer> list = getList();
        removeDuplicate(list);

    }

    public static ArrayList<Integer> getList() {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.print("Enter ten Integers : ");
        for (int i = 0; i < 10; i++) {
            int number = input.nextInt();
            list.add(number);
        }
        return list;

    }

    public static void removeDuplicate(ArrayList<Integer> list) {
        ArrayList<Integer> getDistinctList = new ArrayList<>();
        for (Integer i : list) {
            if (!getDistinctList.contains(i)) {
                getDistinctList.add(i);
            }
        }
        System.out.println("The distinct integers are : " + getDistinctList);
    }

}
