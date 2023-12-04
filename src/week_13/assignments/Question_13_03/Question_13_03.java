package week_13.assignments.Question_13_03;

import java.util.ArrayList;
import java.util.Collections;

public class Question_13_03 {
    public static void main(String[] args) {

        ArrayList<Number> myList = new ArrayList<>();

        myList.add(1);
        myList.add(1.5);
        myList.add(10);
        myList.add(1.53);
        myList.add(5);
        myList.add(12.5);
        myList.add(65);

        System.out.println("Before Sort : \n" + myList);
        sort(myList);
        System.out.println("After sort : \n" + myList);

    }

    public static void sort(ArrayList<Number> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            Number min = list.get(i);
            int minIndex = i;

            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j).doubleValue() < min.doubleValue()) {
                    min = list.get(j);
                    minIndex = j;

                }


            }
            if (minIndex != i) {
                list.set(minIndex, list.get(i));
                list.set(i, min);

            }
        }
    }
}
