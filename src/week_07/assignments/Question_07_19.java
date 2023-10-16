package week_07.assignments;

import java.util.Scanner;
import java.util.Arrays;
                                                            ////

public class Question_07_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the list : ");
        int number = input.nextInt();
        int[] list = new int[number];
        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextInt();


        }
        System.out.println("The list is " + (isSorted(list) ? " already" : " not") + " sorted");


    }

    public static boolean isSorted(int[] array) {
        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        Arrays.sort(newArray);

        if (Arrays.equals(newArray , array)){
            return true;
        }else {
            return false;
        }


        }
    }

