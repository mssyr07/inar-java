package week_13.assignments.Question_13_02;

import java.util.ArrayList;
import java.util.Collections;

public class Question_13_02 {
    public static void main(String[] args) {

        ArrayList<Number> myList = new ArrayList<>();

        myList.add(1);
        myList.add(1.5);
        myList.add(10);
        myList.add(1.53);
        myList.add(5);
        myList.add(12.5);
        myList.add(65);

        System.out.println("Before Shuffle : \n" + myList);
        shuffle(myList);
        System.out.println("After Shuffle : \n" + myList);
    }

    public static void shuffle(ArrayList<Number> list) {
        Collections.shuffle(list);
    }
}
